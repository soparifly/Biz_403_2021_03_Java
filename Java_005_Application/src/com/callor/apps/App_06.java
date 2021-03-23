package com.callor.apps;

public class App_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 3723560;
		int A = money / 50000;
		System.out.println("50000원권" + A + "매");

		int B = (money - (50000 * A));
		B = B / 10000;
		System.out.println("10000원권" + B + "매");

		int C = A - (10000 * B);
		C = C / 5000;

		if (C > 0) {
			System.out.println("5000원권" + "매");
		} else {
			System.out.println("5000원권" + C + "0매");
		}

		int D = money - (50000 * A) - (10000 * B) - (5000 * C);
		D = D / 1000;
		if (D > 0) {
			System.out.println("1000원권" + D + "매");
		} else {
			System.out.println("1000원권" + D + "0매");
		}
		 int E = money - (50000 * A) - (10000 * B) - (5000 * C) - (1000 * D);
		if (C > 0) {
			System.out.println("500원권" + C + "매");
		} else {
			System.out.println("500원권" + C + "0매");
		}

	}
}