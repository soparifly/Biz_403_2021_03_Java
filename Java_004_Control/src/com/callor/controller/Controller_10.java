package com.callor.controller;

import java.util.Random;

public class Controller_10 {
	public static void main(String[] args) {
		/*
		 * 임의의 정수 0~ 100까지 중의 정수 5개를 만들어서 그 수가 짝수 인지 아닌지를 출력하라
		 * 
		 * 
		 */
		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		int num3 = rnd.nextInt(100);
		int num4 = rnd.nextInt(100);
		int num5 = rnd.nextInt(100);

		if (num1 % 2 == 0) {
			System.out.println(num1 + "는짝수");
		} else {
			System.out.println(num1 + "는 짝수아님");
		}
		if (num2 % 2 == 0) {
			System.out.println(num2 + "는짝수");
		} else {
			System.out.println(num2 + "는 짝수아님");
		}
		if (num3 % 2 == 0) {
			System.out.println(num3 + "는짝수");
		} else {
			System.out.println(num3 + "는 짝수아님");
		}
		System.out.println("=============================");
		
		
		//반복문을 사용하여 임의 정수 5개를 만들고 그수가 짝수인지 아닌지를 판별하는 코드
		for (int i = 0; i < 5; i++) {
			
			int num = rnd.nextInt(100);
			
			if (num % 2 == 0) {
				System.out.println(num + "는짝수");
			} else {
				System.out.println(num + "는 짝수 아님");

			}

		}
	}

}
