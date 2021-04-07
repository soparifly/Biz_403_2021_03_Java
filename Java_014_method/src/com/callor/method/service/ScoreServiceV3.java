package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV3 {
	/*
	 * 1.inputScore() method를 선언하고 
	 * 2.InputSerciveV2 클래스를 사용하여
	 * 3. 국어 영어 수학 점수를 입력 받고
	 * 4. 각각 intKor, intEng, intMath변수에 저장 
	 * 5.각 점수는 0~ 100 점 번위 내에서 입력
	 * 6. 입력받은 3과목의 총점과 평균을 계산하여 출력
	 * 
	 */
	Scanner scan;

	public ScoreServiceV3() {
		scan = new Scanner(System.in);

	}

	public void inputScore() {
		
		
		InputServiceV2 iSV2 = new InputServiceV2();
		
		
		Integer intKor = iSV2.inputValue("국어", 0, 100);
		if (intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = iSV2.inputValue("영어", 0, 100);
		if (intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = iSV2.inputValue("수학", 0, 100);
		if (intMath == null) {
			System.out.println("종료");
			return;
		}

		
		System.out.println("=".repeat(40));
		System.out.printf("국어 : %d 영어 : %d 수학 : %d\n", intKor, intEng, intMath);
		System.out.println("=".repeat(40));
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;

		System.out.println("총점 : " + intSum);

		Float floatAvg = (float) intSum / 3;
		System.out.printf("평균 : %3.2f",floatAvg);


	}
}
