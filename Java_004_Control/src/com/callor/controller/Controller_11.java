package com.callor.controller;

import java.util.Random;

public class Controller_11 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int num = 0;

		for (int i = 0; i < 5; i++) {

			num = rnd.nextInt(100) + 1;
//0~99까지 만들고
//int rndNum = rnd.nextInt(100);
//거기에 1을 더하여 num에 저장하라
//num = rndNum +1;

			if (num % 3 == 0) {
				System.out.println(num + "3의 배수");
			} else {
				System.out.println(num + "3의 배수가 아님");
			}
		}
	}

}
