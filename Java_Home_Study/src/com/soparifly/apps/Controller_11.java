package com.soparifly.apps;

import java.util.Random;

public class Controller_11 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		for (int i = 0; i < 100 ; i++) {
			int nums = rnd.nextInt(100)+1;
			if (nums % 3 ==0) {
				System.out.printf("%d 는 3의 배수 임 \n",nums );
			
			} else {
				System.out.printf("%d 는 3의 배수가 아님 \n",nums);
			}
	}
		
	}
}
