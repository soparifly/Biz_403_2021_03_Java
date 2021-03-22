package com.callor.controller;

public class Controller_01 {
	public static void main(String[] args) {

		// 0 ~ 99 + 1 = > 1~100
		for (int index = 0; index < 100; index++) {
			if (index % 3 == 0) {

				// int ~ 100
				int num = index + 1;

				// 3배수이면

				if (num % 3 == 0) {
					System.out.print(num);
					System.out.println(",");
				}
				// 4의 배수이면
				if (num % 4 == 0) {
					System.out.println(num);
				}
			}
		}
		// 3의 배수의 합, 4의 배수의 합
		// 합을 구하기위해 변수를 선언을 해야한다
		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0;

		for (int index = 0; index < 100; index++) {
			int num = index + 1;

			// num값이 3의 배수이면
			// num값을 intSum3변수에 누적하라

			if (num % 3 == 0) {
				intSum3 += num;
			}
			// 3의 배수이면 4의 배수에서는 합산하지말라

			/*
			 * 여기에서 else if를 사용하면 3의 배수이면서 4의 배수인 경우인 경우 3의 배수에는 합산이 되지만 4의 배수에는 누락된다
			 */
			if (num % 4 == 0) {
				intSum4 += num;

				/*
				 * 3의 배수이면서 5의 배수 num % 3==0 이면서 num % 5 ==0
				 */
				if (num % 3 == 0) {
					if (num % 5 == 0) {
						intSum5 += num;
					}
				}
			}
			System.out.println("============================");
			System.out.printf("3의 배수 :  %d\n", intSum3);
			System.out.printf("4의 배수 :  %d\n", intSum4);
			System.out.printf("5의 배수의 배수이면서 3의배수  :  %d\n", intSum5);

		}

	}
}
