package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV4 {
	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	Scanner scan;

	// 생성자 메서드 // void가 없고 //클래스 이름과같다
	public ScoreServiceV4(int members) {
		scan = new Scanner(System.in); // TODO Auto-generated constructor stub
		subject = new String[] { "국어", "영어", "수학" };

		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}

	public void makeScores() {
		for (int i = 0; i <intKor.length; i ++) {
			System.out.printf("%d번 학생의 성적입력\n ",i+1);
			intKor[i]= this.inputScore(subject[0]); //서브젝트 i변수를 매게변수로쓴다.
			intEng[i]= this.inputScore(subject[1]); //서브젝트 i변수를 매게변수로쓴다.
			intMath[i]= this.inputScore(subject[2]); //서브젝트 i변수를 매게변수로쓴다.
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
