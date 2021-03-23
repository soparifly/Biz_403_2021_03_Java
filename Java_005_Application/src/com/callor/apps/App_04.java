package com.callor.apps;

import java.util.Random;

public class App_04 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intScores = new int[5];

		int pizzaSum = 0;

		int pizzaBox = 0;

		int pizzapull = 0;
		
		int pizzaPcs = 6; 
		System.out.println("=================================");
		System.out.println("인원수\t 피자주문\t 전체 조각수");
		System.out.println("----------------------------------");

		for (int i = 0; i < 5; i++) {

			intScores[i] = rnd.nextInt(10) + 50 ;
			
			pizzaBox = (intScores[i] / 6) ;
			pizzaSum = pizzaBox * pizzaPcs;

			System.out.printf("%d\t %d\t %d\n", intScores[i], pizzaBox, pizzaSum);
		
			pizzapull += pizzaSum;
			
		}
		System.out.println("===========================================");
		
		
		System.out.println("전체주문 박스수량 : "+pizzapull);

	}
}
