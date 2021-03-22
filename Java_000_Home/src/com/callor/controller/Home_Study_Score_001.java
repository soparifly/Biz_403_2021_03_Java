package com.callor.controller;

public class Home_Study_Score_001 {

	public static void main(String[] args) {

		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intSum = 0;
		int intAvg = 0;
		
		intKor = 80;
		intEng = 77;
		intMath = 65;
		
//		intSum = intKor + intEng + intMath;
		intSum = intKor;
		intSum +=intEng;
		intSum +=intMath;
	
		intAvg = intSum / 3;
		
		
		System.out.println("=====================");
		System.out.printf(
				"국어 : %d\n" 
				+"영어 : %d\n" 
				+"수학 : %d\n",
				intKor,intEng,intMath);
		System.out.println("=====================");
		System.out.printf("총점 : %d \t 평균 : %d" ,intSum,intAvg);
		
		
	}

}
