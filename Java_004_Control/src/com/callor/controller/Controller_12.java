package com.callor.controller;

import java.util.Random;

public class Controller_12 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intSum = 0;

		for (int i = 0; i < 10; i++) {

			int num = rnd.nextInt(100) + 1;

			if (num % 3 == 0) {
				System.out.println(num + " 는(은) 3의 배수");
				intSum += num;
			}

		}
		System.out.println("============================");
		System.out.println("합계 : " + intSum);
	}
}
