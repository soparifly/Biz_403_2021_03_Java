package com.callor.score.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordServiceImplV1A implements WordService {

	protected final int 영어 = 0;
	protected final int 한글 = 1;
	protected List<WordVO> wordList;
	protected Scanner scan;
	protected WordVO vo;
	protected Integer num;
	protected Random rnd;

	public WordServiceImplV1A() {
		rnd = new Random();
		wordList = new ArrayList<WordVO>();
		scan = new Scanner(System.in);
		

		this.loadWord();

	}

	@Override
	public void loadWord() {
		// TODO Auto-generated method stub

		String wordFile = "src/com/callor/score/word.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				try {
					String reader = buffer.readLine();
					if (reader == null)
						break;

					String word[] = reader.split(":");
					WordVO wordVO = new WordVO();
					wordVO.setKorea(word[한글]);
					wordVO.setEnglish(word[영어]);
					wordList.add(wordVO);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("파일에서 데이터 읽는 중 문제발생");
//					e.printStackTrace();
				}

			}//while end
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 여는 동안 문제 발생");
		}

	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewWord() {

		int nWinCount = 0;
		int nLoseCount = 0;
		while (true) {

			WordVO vo = this.getWord();
			System.out.println(vo.toString());

			System.out.println("=".repeat(59));
			System.out.println("다음 뜻과 같은 영어단어는?(그만하기 :qUIT");
			System.out.println(vo.getKorea());
			System.out.println("-".repeat(50));
			System.out.print(" >> ");
			String strKor = scan.nextLine();
			if (strKor.equals("QUIT")) {
				break;
			}
			if (strKor.equalsIgnoreCase(vo.getEnglish())) {
				System.out.println("참 잘했어요");
				nWinCount++;
			} else {
				System.out.println("좀더 열심히 공부합시다");
				nLoseCount++;
			}
			System.out.println("=".repeat(50));
			System.out.printf("지금까지 성공한 갯수 : %d \n", nWinCount);
			System.out.printf("지금까지 실패한 갯수 : %d \n", nLoseCount);
		}
		System.out.println("Game Over!!");
	}

	protected WordVO getWord() {
		// TODO Auto-generated method stub
		// wordList에 담긴 데이터중 임의 데이터 1개를 추출하기
		rnd = new Random(); // 난수생성
		rnd.nextInt(100);
		Integer nSize = wordList.size();
		num = rnd.nextInt(nSize); // 저장된 리스트만큼의 수에서 난수한개뽑음
		WordVO wordVO = wordList.get(num);
//		System.out.println(wordVO.toString());
		vo = wordList.get(num);
		return wordVO;
		
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
	}
	

}
