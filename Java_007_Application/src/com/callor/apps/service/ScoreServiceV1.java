package com.callor.apps.service;

/*
 * 10명 학생의 국어, 영어, 수학 점수를 배열에 저장하고
 * 
 * 2. 학생들의 총점, 평균을 계산하여
 * 3, 성적 리스트를 출력합니다
 * 4, ScoreServiceV1에 method를 구현하고
 * App_08 클래스의 main() method 에서 호출하여 구현합니다
 */
import java.util.Random;

public class ScoreServiceV1 {

	Random rnd = new Random();

	int intSu = 10;
	int nCount = 0;

	int[] intKor = new int[intSu];
	int[] intEng = new int[intSu];
	int[] intMath = new int[intSu];

	int[] intSum = new int[intSu];
	float[] floatAvg = new float[intSu];

	public void intScore() {
		for (int i = 0; i < 10; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
	}

	public void intSum() {
		for (int i = 0; i < 10; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
			floatAvg[i] = (float) intSum[i] / 3;
			System.out.print("합계 : " + intSum);
		}
	}

	public void floatAvg() {
		for (int i = 0; i < 10; i++) {
			floatAvg[i] = (float) intSum[i] / 3;

		}
	}

	public void printScore() {
		System.out.println("===========================================");
		System.out.println("빛나라 고교 성적리스트");
		System.out.println("--------------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");

		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			System.out.printf("%3d\t", intSum[i]);
			System.out.printf("%3.2f\t", floatAvg[i]);
		}
		System.out.println("==============================================");
	}
}
