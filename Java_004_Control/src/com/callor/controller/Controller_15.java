package com.callor.controller;

import java.util.Random;

public class Controller_15 {
	public static void main(String[] args) {
		Random rnd = new Random();

		int intKor = 0;
		int num = 0;
		int intSum = 0;
		float floatAvg = 0;

		int intKor1 = rnd.nextInt(100)+1;
		int intKor2 = rnd.nextInt(100)+1;
		int intKor3 = rnd.nextInt(100)+1;
		int intKor4 = rnd.nextInt(100)+1;
		int intKor5 = rnd.nextInt(100)+1;
		int intKor6 = rnd.nextInt(100)+1;
		int intKor7 = rnd.nextInt(100)+1;
		int intKor8 = rnd.nextInt(100)+1;
		int intKor9 = rnd.nextInt(100)+1;
		int intKor10 = rnd.nextInt(100)+1;
		/*
		 * num변수하고 intKor이름으로 합하여 intKor1 + intKor5처럼 
		 * 만들수 있을거같지만 안된다
		 */
		intSum = intKor1 ;
		intKor1 += intKor2 ;
		
		System.out.println("==================================");

		floatAvg = intSum / 10;
		System.out.printf("총점 : %d \t 평균 %3.2f", intKor, floatAvg);
	}
}