package com.callor.apps.service;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreServiceV1 {

	Scanner score1 = new Scanner(System.in);

	int kor[];
	int eng[];
	int math[];
	int intTotal[];
	float floatAvg[];

	public ScoreServiceV1() {

		int numsLength = 5;

		kor = new int[numsLength];
		eng = new int[numsLength];
		math = new int[numsLength];
		intTotal = new int[numsLength];
		floatAvg = new float[numsLength];
	}

	public void nums() {

		for (int i = 0; i < kor.length; i++) {
			System.out.println(LinesService.dLines(30));
			System.out.printf("%d번학생의 점수를 입력하세요\n", i + 1);
			System.out.print("국어 : >>");
			kor[i] = score1.nextInt();
			System.out.print("영어 : >>");
			eng[i] = score1.nextInt();
			System.out.print("수학 : >>");
			math[i] = score1.nextInt();
		}
	}

	public void makeSum() {
		for (int i = 0; i < kor.length; i++) {
			intTotal[i] = kor[i];
			intTotal[i] += eng[i];
			intTotal[i] += math[i];
			floatAvg[i] = (float) intTotal[i] / 3;
		}
	}

	public void printScore() {
		System.out.println("성적리스트");
		System.out.println(LinesService.dLines(70));
		for (int i = 0; i < kor.length; i++) {
			System.out.println(LinesService.dLines(70));
			System.out.printf("%d  번 학생의 성적표\n",i+1);
			System.out.printf("국어 점수 : %d |",kor[i]);
			System.out.printf("영어 점수 : %d |",eng[i]);
			System.out.printf("수학 점수 : %d |",math[i]);

			System.out.printf("합계 : %d |", intTotal[i]);
			System.out.printf("평균 : %3.2f\n", floatAvg[i]);
			System.out.println(LinesService.dLines(70));
		}
	}
}
