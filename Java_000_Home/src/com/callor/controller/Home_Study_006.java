package com.callor.controller;

import java.util.Random;

/*
 * 5개의 반에 국어,영어,수학 점수를 임의로 50~100까지 정한후
 * 각각의 점수와 총점,평균을 코드로 표현하
 */
public class Home_Study_006 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		// 가상의 점수생성

		int intScore = 0;
		int intSum = 0;
		
		int[] intTotal = new int[5];
		float[] floatAvg = new float[5];

		for (int i = 0; i < 5; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
		}

			for(int i= 0; i <5 ; i++)
			{ intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			}
			floatAvg = intTotal[i] / 3; 
			
			System.out.println("i");

		}
	}
}
