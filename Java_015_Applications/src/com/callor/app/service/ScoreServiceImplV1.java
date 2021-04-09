package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.Subject;

import com.callor.app.model.ScoreVO;
import com.kimbyulook.standard.InputService;
import com.kimbyulook.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {
/*
 * 1메뉴를 보여주고 
 * 2성적입력 : 학생수의 제한이 없다.
 * 	가.학번
 * 	나.학생이름  : inputName()
 * 	다.과목별 성적 :inputScore()
 * 
 * 
 *  가. 학생성적 : inputScore()	 시작
 *  -학번입력
 *  -이름입력
 *  -점수입력
 *  나. 학생이름 입력을 하는inputName() method는 
 *  return type String형 이기때문에 학생이름을 입력받고
 *  학생이름을 return한다
 *  이return학생 이름을 inputScore(_에서 변수에 담아 처리할수있다.
 *  
 */
	protected InputService inService;  //학번, 점수를 입력받을 객
	protected List<ScoreVO> nameList;
	protected List<ScoreVO> scoreList; //저장
	protected Scanner scan; //학생이름 입력받을 객
	Integer student;
	String[] subject;
	Integer kor;
	Integer eng;
	Integer math;
	String name;
	
//	ScoreVO scoreVO;
	public ScoreServiceImplV1() {

		inService = new InputServiceImplV1();

		scoreList = new ArrayList<ScoreVO>();
		nameList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		student = 5;
		subject = new String[] { "국어", "영어", "수학" };
//		scoreVO = new ScoreVO(); 생성자에 클래스를 인스턴스선언을 하면 마지막 추가된 배열의값만 인식한다
	}

	@Override
	public void selectMenu() {
		Integer enter1 = 0;
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("성적입력하는 프로그램");
			System.out.println("=".repeat(50));
			System.out.println("1. 이름입력");
			System.out.println("2. 성적입력");
			System.out.println("3. 입력리스트 출력");

			System.out.println("=".repeat(50));
			System.out.println("QUIT 입력시 종료");
			System.out.print(">>>>>>");

			String enter = scan.nextLine();
			if (enter.equals("QUIT")) {
				System.out.println("업무 종료");
				break;
			}
			try {
				enter1 = Integer.valueOf(enter);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("정확한 값을 입력해주세요");
				continue;
			}
			if (enter1 == 1) {
				this.inputName();
			} else if (enter1 == 2) {
				this.inputScore();
			} else if (enter1 == 3) {
				this.printScore();
			}
		} // while문 종료
		// TODO
	}

	@Override
	public void inputName() {
		this.inputName("무명");
//		for (int st = 0; st < student; st++) {
//
//			System.out.println("이름을 입력하세요(종료시 : QUIT");
//			System.out.print(" >> ");
//			try {
//				name = scan.nextLine();
//			} catch (Exception e) {
////					e.printStackTrace();
//				System.out.println("이름만 입력하세요");
//				continue;
//			}
//			if (name.equals("QUIT")) {
//				System.out.println("종료");
//				return;
//			}
//			ScoreVO scoreVO = new ScoreVO();
//			scoreVO.setName(name);
//			nameList.add(scoreVO);
//		}
		
	}
	private String inputNum() {
		//학번입력처리 : 001, 002형식으로 입력받자	
				// 정수 1 이상을 입력하면 정수 값이 intNum에 담길것이고
				//QUIT를 입력했으면 null값이intNum에 담길것이
				Integer intNum = inService.inputValue("학번", 1);
				//intNum에 null값에 담겨있으면 종료하고 다시 뉴로 돌아간다.
				if(intNum == null) {
					
					return null;
				}
				// 정수를 입력했으면 입력 받은 정수값을 
				//학번에 문자열 형식으로 (001, 002)으로 변환을 하자
				//format("%3d",1) : 전체 자릿수를 3개로 만들고 오른쪽 정렬하는 문자열 만들기
				// " ^ ^1",<- 전체 자릿수를 3개로만들고 정수 값을 오른쪽으로 정렬하고 왼쪽에 빈칸에 0을 체워라
				//->"001"
				String strNum = 
				String.format("%03d", intNum); //format("2021%03d",1) <- 20201001
	return strNum;
	}

	@Override
	public void inputScore() {
		
		
		//TODO 학번, 이름, 과목점수를 입력받아 LIST에 추가

		//학생이름 입력
		
		String strNum = this.inputNum();
		
			if (strNum == null) {
				return;
			}
			//학생이름입력
			String strName = this.inputName(strNum);
			Integer intKor = inService.inputValue("국어", 0, 100);
			if (intKor == null) {
				return;
			}
			Integer intEng = inService.inputValue("영어", 0, 100);
			if (intEng == null) {
				return;
			}
			Integer intMath = inService.inputValue("수학", 0, 100);
			if (intMath == null) {
				return;
			}
			/*
			 * 아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난후 한과목이라도 QUIT하면 종료하는 코드이다
			 * 만약 어 과목에서 QUIT를 입력하여도
			 * 영어, 수학 점수를 입력받은 Prompt 나타나고 3 과목을 모두 통과한후 입력종료된다
			 * 
			 */
			if(intKor == null||intEng==null||intMath==null) {
				return;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setName(strName);
			scoreVO.setNum(strNum);
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);
			scoreList.add(scoreVO); //scoreList값 추
			
				
				
			
		
		//		
//		for (int index = 0; index < student; index++) {
//
//			System.out.println(nameList.get(index).getName() + "의 성적을 입력하세요");
//			kor = this.inService.inputValue(subject[0], 0, 100);
//			eng = this.inService.inputValue(subject[1], 0, 100);
//			math = this.inService.inputValue(subject[2], 0, 100);
//		
//			ScoreVO scoreVO = new ScoreVO();
//			scoreVO.setKor(kor);
//			scoreVO.setEng(eng);
//			scoreVO.setMath(math);
//			scoreList.add(scoreVO);
//		}
	}

	private String inputName(String strNum) {
		// TODO 학번으로 보여주고 이름을 입력받는 method
		while(true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT: 입력취소");
			System.out.print(">>");
			String strName = scan.nextLine();
			if(strName.equals("QUIT")) {
//				return null;
				break;
			} else if(strName.equals("")) {
				//입력 없이 enter만 ;
			System.out.println("학생이름을 반드시 입력해야합니다");
			continue;
			}
			return strName;
		}//end while
		return null;
	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("이름\t국어\t수학\t영어\n");
		System.out.println("-".repeat(50));
		
		for (int st = 0; st < student; st++) {
			//student였을때는 null값이 출려됬으나 size로 바꾸니 잘됨
			//이름값이 출력된후 , 점수값이 다섯번이 따로 출력되는지 의문
			
			//코드가 길어지니 변수에 담아서사용한
			//ScoreVO vo = scoreList.get(st);
			
			System.out.print(nameList.get(st).getName() + "\t");
			System.out.print(scoreList.get(st).getKor() + "\t");
			System.out.print(scoreList.get(st).getEng() + "\t");
			System.out.print(scoreList.get(st).getMath() + "\n");
			System.out.print(scoreList.get(st).getTotal() + "\n");
			System.out.print(scoreList.get(st).getAvg() + "\n");
			// TODO Auto-generated method stub
		}
//	  	어레이배열은 클래스 인스턴스를 한번 초기화를 해주고 목록을 배열이름.add()를 이용하여 추가한다
//		-> 어레이배열이름.add(이용하고자하는 클래스);
//		호출하는 메서드가 달라질때 클래스 인스턴스를 새로 만들면 메서드의 주소가 초기화되기때문에
// 		get으로 동일한 어레이 배열을 출력하면 (출력시 같은 어레이배열을 get하면 )
//		메서드가 따로따로 호출하기 때문에 값이 null로 발생한다
//		해결방법 : ArrayList를 이름목록(nameList)과 점수목록(scoreList)을 따로 선언해주되 
//		호출할때는 필요한 어레이 배열을 같은 메서드안에서 불러도 상관없다
//		필요한 어레이는 []배열처럼 첨자값에따라 저장된 값의 순서를 알수있다 
//		출력시 for반복문을 이용해 어레이 리스트에 저장한 갯수만큼 size를 지정해주고
//		저장한배열명.get(size값).(VO서비스에 저장된)get메소드() 를 입력하면 프린트 출력문으로 출력이 가능하다
		
		System.out.println("=".repeat(50));
	}
}
