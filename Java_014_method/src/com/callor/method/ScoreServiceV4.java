package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.InputServiceV2;

public class ScoreServiceV4 {
	Scanner scan;

	public ScoreServiceV4() {
		scan = new Scanner(System.in);
	}

	public void inputScore() {
		InputServiceV2 isV2 = new InputServiceV2();
		Integer sum = 0;
		String[] subject = new String[] { "국어", "영어", "수학" };
		for (int i = 0; i < subject.length; i++) {
			Integer score = isV2.inputValue(subject[i], 0, 100);
			sum += score;
			if (score == null) {
				System.out.println(" 종료 ");
	
				return;
			}
		}
		System.out.println("합계 : " + sum);
		
		float avg = (float) sum / 3;

		System.out.printf("평균 :  %3.2f", avg);

	}
}
