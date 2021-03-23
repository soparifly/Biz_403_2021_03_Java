package com.callor.apps;

import java.util.Random;

public class App_03A {
	public static void main(String[] args) {
		/*
		 * 정수배열 intScores 10 개 선언 Random클래스로 50 ~ 100까지 정수를 만들어 intScores에 저장 intScroes의
		 * 점수의 총점 , 평균
		 * 
		 */
		Random rnd = new Random();
		int[] intScores = new int[10];
		
		for (int i = 0; i < 10; i++) {
			intScores[i] = rnd.nextInt(51) + 50;
		}
		int intTotal = 0;
		float floatAvg = 0;
		for (int i = 0; i < 10; i++) {
			intTotal += intScores[i];
		}
		floatAvg =  (float)intTotal /  10;
//평균은 전체 총점을 계산한후에 한번만 계산을 수행하면된다
//평균을 총점과 같이 for()반복문에 계산할 필요는 없다

		System.out.println("==============================");
		System.out.printf("총점 : %d , 평균 : %3.2f\n", intTotal, floatAvg);
	}
}
