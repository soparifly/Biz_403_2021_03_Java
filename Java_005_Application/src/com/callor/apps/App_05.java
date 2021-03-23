package com.callor.apps;

import java.util.Random;

public class App_05 {
	public static void main(String[] args) {
		Random rnd = new Random();

		int[] students = new int[5];

		int intSum = 0;
		float floatAvg = 0;

		for (int i = 0; i < 5; i++) {

			int intKor = rnd.nextInt(49) + 50;
			int intEng = rnd.nextInt(49) + 50;
			int intMath = rnd.nextInt(49) + 50;
			students[i] = intKor;
			students[i] = intEng;
			students[i] = intMath;
			intSum = intKor + intMath + intEng;
			floatAvg = intSum / 3;
			System.out.printf("%d\t %d\t %d\t %d\t %d\t %3.2f\n",(i+1),intKor,intMath,intEng,intSum,floatAvg);
		
	
		}

		

		// students[i] = intKor;
//			students[i] = intEng;
//			students[i] = intMath;
//			
//			intKor = rnd.nextInt(99) + 50;
//			intEng = rnd.nextInt(99) + 50;
//			intMath = rnd.nextInt(99) + 50;
//			
//			intSum = intKor;
//			intKor += intEng;
//			intEng += intMath;
//			
//			floatAvg = intSum / 3;
//		}
//		System.out.println("====================================");
//		System.out.print("학번\t 국어\t 영어\t 수학\t 총점\t 평균");

	}
}
