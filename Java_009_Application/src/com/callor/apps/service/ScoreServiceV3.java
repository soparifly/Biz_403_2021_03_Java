package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV3 {
	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	Scanner scan;

	// 생성자 메서드 // void가 없고 //클래스 이름과같다
	public ScoreServiceV3(int members) {
		scan = new Scanner(System.in); // TODO Auto-generated constructor stub
		subject = new String[] { "국어", "영어", "수학" };

		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}
/*
 * 점수를 입력받을 과목명을 배열로 만들어두고
 * 과목명 문자열을 inputScore()에 전달하여
 * 3과목의 점수를 입력받는 코드를 작성
 * 
 */
	public void makeScores() {
		for (int i = 0; i <subject.length; i ++) {
			Integer score = this.inputScore(subject[i]); //서브젝트 i변수를 매게변수로쓴다.
		}

	}

	private Integer inputScore(String sub) {
		Integer score = 0;
		while (true) {
			System.out.println(sub + " 점수를 입력하세요");
			System.out.println(" > > ");
			score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println(sub + "점수는 0~ 100까지 입력하세요");
//			continue; //명령을 사용하는 대신
				// else 를 사용하여 코드를 작성
			} else {
				break;
			}
		}
		return score; // 오류를 막기위해서 메서드를 생성수 바로 return값을 입력해준다 //while 입력시는 의미가 없다
	}
}
