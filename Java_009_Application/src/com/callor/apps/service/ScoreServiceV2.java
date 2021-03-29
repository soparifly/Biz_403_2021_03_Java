package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;

	public ScoreServiceV2() {
		scan = new Scanner(System.in);

	}
/*
 * <this>
 * 현재 객체, 같은 클래스내에 있는 코드
 */
	public void makeScores() {
		System.out.println("국어점수입력");
		/*
		 * method return type이 void가 아닌경우에는
		 * method가 reutrn 한 값을 변수에 저장(받기)할수 있다.
		 * 이때 변수는 mehtod의 return type 과 같은 type(형)이어야한다.
		 */
		Integer intKor = this.intputScore();
		System.out.println("영어점수입력");
		Integer intEng = this.intputScore();
		this.intputScore();
		System.out.println("수학점수입력");
		Integer intMath = this.intputScore();
		this.intputScore();
		System.out.println("=============================");
		System.out.printf("국어점수 :  %d",intKor );
		System.out.printf("영어점수 :  %d",intEng );
		System.out.printf("수학점수 :  %d",intMath );

	}

	private Integer intputScore() {
		Integer score = 0;
		while (true) {
			System.out.println("점수를 입력하세요( 0~ 100)");
			score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("점수는 0~ 100까지만 입력해야한다");
				continue;
			} // continue명령문은 다시 while에서 시작하게 한다
		break;
		}
		//score변수에 저장된 값을 호출한 곳으로 되돌려주어라
		return score;
		
	}
}