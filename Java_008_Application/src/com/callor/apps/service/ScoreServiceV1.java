package com.callor.apps.service;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreServiceV1 {
	Scanner score1 = new Scanner(System.in);

	int kor[];
	int eng[];
	int math[];

	int numsLength = 5;
	int nCount = 0;
	int intSum = 0;
	float floatAvg = 0;

	public ScoreServiceV1() {
		kor = new int[numsLength];
		eng = new int[numsLength];
		math = new int[numsLength];
	}

	public void kor() {

		for (int i = 0; i < kor.length; i++) {
			System.out.println();
			System.out.println(LinesService.dLines(30));
			System.out.printf("%d번학생의 점수를 입력하세요\n", i);
			System.out.print("국어 : >>");
			kor[i] = score1.nextInt();
			System.out.println(LinesService.dLines(30));
		}
	}


	}
}
