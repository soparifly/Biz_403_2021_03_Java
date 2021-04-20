package com.callor.word.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import com.callor.word.domain.ScoreVO;
import com.callor.word.domain.WordVO;
/*
 * 점수
 * 단어를 맞추면 점수 더하기
 * 단어를 틀려서 재도전하면 -
 * 힌트를 요구하면 점수를 - 
 * 건너뛰기 - 
 */
public class WordServiceImplV2 extends WordServiceImplV1 {
	protected ScoreVO score;
	protected WordVO gameWord;
	protected String basePath;
	
	
	protected final int 맞은개수 =0 ;
	protected final int 틀린개수 =1 ;
	protected final int 포인트 =2 ;
	public WordServiceImplV2() {
	score = new ScoreVO(3);	// TODO Auto-generated constructor stub
	basePath = "src/com/callor/word/";
	this.loadScore();
	}
	/*
	 * getsuffleWord() method를 호출하여 suffle된 영던어를 받고 suffle된 영단어를 inputWord()에게 전달하여
	 * 게임을 시작한다.
	 */
	public void startGame() { // 셔플덴 단어를 viewWord에 저장하고 inputWord에서 viewWord를 받아 진행한다

		// 게임용 단어 만들기
		while(true) {
			score.set포인트(0);
			score.set재도전(0);
			int nWordIndex = rnd.nextInt(nWordCount); // 단어수중에 랜덤수를 한아뽑아낸다
			WordVO wordVO = wordList.get(nWordIndex); // wordVO에 word리스트에 잇는 단어하나를 뽑아서 담는다
			
			// getsuffleWord()를 사용하지않고
			// 직접 suffleWord()를 호출하도록 변경함
			String viewWord[] = this.suffleWord(wordVO.getEnglish());
			/*
			 * <break>
			 * 반복문 { 반복문{} } 처럼
			 * 반복문이 겹쳐있을때는 안쪽의 반복문에서 break를 실행하면 한계단씩 반복문이 종료된다.
			 */
			while (true) {
				String strInput = this.inputWord(viewWord);
				if (strInput.equals("QUIT")) {
					this.viewScore();
					this.saveScore();
					System.out.println("게임 종료");
					/*
					 * return 문은 반복문의 겹침 갯수에 관계없이 무조건 현재 메서드 자체가 끝나버린다
					 */
					return;
				} else if (strInput.equals("1")) {
					break;
				} else if (strInput.equals("2")) {

					this.hint(wordVO);
					if(score.get재도전()<=0) {
						System.out.println("재도전 기회없음!!");
						break;
					}
//					System.out.println(wordVO.getEnglish());
				} else {
					//점수계산
					this.yesNo(wordVO, strInput);
//					///if문내부에 if문이 있는 것이 반복될때는 분리하여 method로 만드는게 좋다
//					String strEng = wordVO.getEnglish();
//					if (strEng.equalsIgnoreCase(strInput)) {
//						System.out.println("..");
//						System.out.println("정답!");
					}
				}
			}//내부 while
			// 점수 계산
		}//main while
	//힌트 보여주기
	protected void hint(WordVO wordVO) {
		System.out.println("-".repeat(50));
		System.out.print(wordVO.getKorea() + " : ");
		System.out.println(wordVO.getEnglish());
		System.out.println("-".repeat(50));
		score.set힌트보기(score.get힌트보기()+1);
		viewScore();
	}
	protected void yesNo(WordVO wordVO, String input) {
		score.set맞은개수(score.get맞은개수()+1);
		String  strEng = wordVO.getEnglish();
		if(strEng.equalsIgnoreCase(input)) {
			System.out.println("정답!");
		} else {
			score.set틀린개수(score.get맞은개수()+1);
			score.set재도전(score.get재도전()-1);
		}
		viewScore();
		
	}
	protected void viewScore() {
		System.out.println("=".repeat(50));
		System.out.println("현재 SCORE");
		System.out.println("=".repeat(50));
		
		System.out.printf("맞은 개수 : %d\n",score.get맞은개수());
		System.out.printf("틀린 개수 : %d\n",score.get틀린개수());
		System.out.printf("포인트 : %d\n",score.get포인트());
		System.out.printf("힌트보기 : %d\n",score.get힌트보기());
		System.out.printf("재도전 : %d\n",score.get재도전());
	}
	protected void saveScore() {

		while(true) {
			System.out.println("저장할 파일이름 입력");
			System.out.print(">> ");
			String fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력해야합니다");
				continue;
			}
			
			FileWriter fileWriter = null;
			PrintWriter out =null;
			
			try {
				//위의 저장위치를 아래의 명령문에 입력할수 있다
				fileWriter = new FileWriter(basePath + fileName);
				out = new PrintWriter(fileWriter);
				
				//파일에 값을 콜론을 기준으로 점수를 넣음 
				out.printf("%d:%d:%d\n",
						score.get맞은개수(),
						score.get틀린개수(),
						score.get포인트());
				out.flush();
				out.close();
				System.out.println("게임 저장 완료!!");
				break; //return도 상관 없음 화일문이 하나이기때문에
				
			} catch (IOException e) {
				System.out.println(fileName +"파일 생성 오류");
				System.out.println("파일이름을 다시입력하세요");
				continue;
			}
		}//while end 
	}//end saveScore()
	//게임로딩하기
	protected void loadScore() {
		while(true) {
			System.out.println("불러올 파일이름을 입력하세요");
			System.out.print(">>");
			String fileName = scan.nextLine();
			
			if (fileName.equals("")) {
				System.out.println("게임을 처음부터 시작합니다.");
				score = new ScoreVO(); //여기서 score를 초기화하여 0부터 새로시작함
				return;
			}
			FileReader fileReader= null;
			BufferedReader buffer= null;
			
			try {
				fileReader = new FileReader(basePath + fileName);
				buffer = new BufferedReader(fileReader);
				//한줄뿐이기때문에 while을 필요가없음
				String reader = buffer.readLine();
				String[] sc = reader.split(":");
				// 하면안됨 ScoreVO 
				this.score = new ScoreVO();
				score.set맞은개수(Integer.valueOf(sc[맞은개수]));
				score.set틀린개수(Integer.valueOf(sc[틀린개수]));
				score.set포인트(Integer.valueOf(sc[포인트]));
				buffer.close();
				return; 
			} catch (FileNotFoundException e) {
				System.out.println("파일이 없습니다");
				System.out.println("파일명을 다시 입력하세요");
				continue;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("파일을 읽을 수 없습니다");
				score = new ScoreVO();
				return;
			}
			
		}//end while
		
		
	}

	/*
	 * 원본 List에서 getter된 영단어 전역변수로 선언하고 (gameWord) getSuffle 에서 단어를 저장했다
	 *
	 * 그랬더니 영단어VO는 다른 메서드에서도 참조하는 변수가되고 메서드 간에 서로 관심을 가져야되는 사이가 되버린다 이런상황이 진행되면
	 * 영단어VO 변수때문에 변수의 상태를 잘관리해야하는 문제가 생긴다
	 * 
	 * getsuffleWord()를 사용하지 않고 List에서 wordVO.getEnglish를 하고 직접 데이터를 관리하도록만든다
	 */
//	protected String[] getSuffleWord() {
//				
//		String[] suffleEnglish = this.suffleWord(gameWord.getEnglish());
//		return suffleEnglish;
//	}
	/*
	 * suffle된 단어 배열을 매개변수로 받고 게임을 진행하기
	 */
	protected String inputWord(String[] viewWord) {
		System.out.println("=".repeat(50));
		System.out.println("          [ 뤼팡의 영단어 게임 V2 ] ");
		System.out.println("=".repeat(50));
		System.out.print("  올바른 단어 적기" + "\t");
		System.out.println(Arrays.toString(viewWord));
		System.out.println("-".repeat(50));
		System.out.println();
		while (true) {
			System.out.println("1. 다음게임(skip)");
			System.out.println("2. 힌트보기");
			System.out.println();
			System.out.println("=".repeat(50));
			System.out.print(">> ");
			String strInput = scan.nextLine();
			if (strInput.equals("")) {
				System.out.println("단어나, 메뉴를 선택하세요");
				continue;
			}
			return strInput;
		}

	}

}
