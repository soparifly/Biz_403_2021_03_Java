package com.callor.controller;

import java.util.Random;
/*
* 정수 배열 intScores 10개를 선언
* Random 클래스로 50~ 100까지 정수를들어
* intScores에 저장
* intScores의 점수의 총점과 평
 */
public class Home_Study_005_Array {
	public static void main(String []args) {
	 Random rnd  = new Random();
	 int[]  intScores = new int[10];
	 
	 for (int i = 0; i < 10 ; i++) {
		 intScores[i]=rnd.nextInt(51)+50;
	 }
	 int intTotal = 0;
	 float floatAvg = 0;
	 
	 //평균은 전체의 수에서 i 만큼 나누는계산을 한번만 하기때문에 for(){}반복문에서 계산할 필요가 없음
	 float intAvg = (float) intTotal / 10 ; // float 값으로만들어줘야 결과값도 float값으로 도출해낼수있음
	 
	 System.out.println("======================");
	 System.out.printf("총점 : %d, 평균 : %3.2f\n",intTotal,intAvg);
	 System.out.println("-----------------------");
	 
	}
	 
		

	}

