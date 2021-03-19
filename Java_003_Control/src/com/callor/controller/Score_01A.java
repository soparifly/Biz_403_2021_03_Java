package com.callor.controller;

public class Score_01A {

	
	public static void main(String[] args) {
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		int intSum = 0;
		int intAvg = 0;
		
		intKor= 80;
		intEng= 77;
		intMath = 65;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		intAvg = intSum / 3;
	
		System.out.println("===========================");
		System.out.printf("국어 : %d\n",intKor);
		System.out.printf("영어 : %d\n",intEng);
		System.out.printf("수학 : %d\n",intMath);
		System.out.println("---------------------------");
		System.out.printf("총점 : %d\t 평균 : %d",intSum,intAvg);
		
		/*
		 * printf()사용하여 출력할때 
		 * %d :정수(십진수)
		 * %f :실수(float)
		 * 	%3.2f 소수점이하 2째짜리까지 표시
		 * %s :문자열
		 * \n :Enter 누른것처럼 줄바꿈 실행
		 * \t :Tap키를 누른것처럼 사이띄기를 일정하게 맞추어라
		 */
		
	}
}
