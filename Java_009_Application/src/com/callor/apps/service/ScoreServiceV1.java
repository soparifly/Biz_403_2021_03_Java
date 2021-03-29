package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;
	int lengths;

	Scanner enter1 = new Scanner(System.in);

	public ScoreServiceV1() {
		lengths = 5;
		intKor = new int[lengths];
		intEng = new int[lengths];
		intMath = new int[lengths];
		intTotal = new int[lengths];
	}

	public void enterScore() {
		
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d 번 학생의 점수를 입력하세요\n", i + 1);

			System.out.printf(" 국어의 점수를 입력하세요(0 ~ 100) ->");
			intKor[i] = enter1.nextInt();
			System.out.printf(" 영어의 점수를 입력하세요(0 ~ 100) ->");
			intEng[i] = enter1.nextInt();
			System.out.printf(" 수학의 점수를 입력하세요(0 ~ 100) ->");
			intMath[i] = enter1.nextInt();
			
			
			intTotal[i] =intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			System.out.println("합계 : " +intTotal[i]);
			
			
			if (intMath[i] > 100) {
				System.out.println("점수는 100점 이하만 입력가능합니다.");
				break;
			}
		}
	}
	
//	public void makeTotal() {
//	
//			for (int i = 0; i < intKor.length; i++) {
//				int nums = intTotal[i];
//				nums += intEng[i];
//				nums += intMath[i];
//				System.out.printf("%d 합계",nums);
//				
//			}
//	}
//	
//	public void makeAvg() {
//		for (int i = 0; i <intKor.length ; i++)
//			floatAvg[i] = intTotal[i] / 3 ;
//			
//		System.out.println("평균 : "+floatAvg);
//	}
}
