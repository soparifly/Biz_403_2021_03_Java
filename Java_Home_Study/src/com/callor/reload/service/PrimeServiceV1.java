package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {
	Random rnd;

	public PrimeServiceV1() {
		rnd = new Random();

	}

	public void primeNum() {
		int num = 0;
		num = rnd.nextInt(51) + 50;

		boolean notPrime = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				notPrime = true;
				System.out.println(num + "는 소수아님.");
				break;
			}
			if (!notPrime ){
				System.out.println(num + "는 소수.");

			}

		}
	}
}
