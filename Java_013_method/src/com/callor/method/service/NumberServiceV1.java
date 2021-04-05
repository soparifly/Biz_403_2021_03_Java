package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {
	public static void main(String[] args) {
		int intNum;
		Random rnd = new Random();

		while (true) {

			intNum = rnd.nextInt(100) + 1;

			if (intNum % 3 == 0) {
				System.out.println(intNum + " 는 3의 배수");
			} else {
				return;
			}
		}

	}

}
