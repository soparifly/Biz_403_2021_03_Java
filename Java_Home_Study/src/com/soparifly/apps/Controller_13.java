package com.soparifly.apps;

import java.util.Random;

public class Controller_13 {
	public static void main(String[] args) {

		Random rnd = new Random();
		
		int nums;
		nums = 0;
		int sums;
		sums = 0;
		
		for (int i =0; i < 10; i++) {
			nums = rnd.nextInt(100)+1;
			if ( nums % 2 == 0) {
				sums += nums;
				
			}
			System.out.println("============================");
			System.out.println("합계 : "+ sums);
			System.out.println("============================");
		}
	
	}
}
