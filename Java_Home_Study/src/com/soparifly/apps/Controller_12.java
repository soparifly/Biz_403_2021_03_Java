package com.soparifly.apps;

import java.util.Random;

/*
 * 1~100ㄲ자ㅣ 범위의 랜덤수 10개를 만들고 ; 
 * 그 수가 3의 배수인지 출력한 후 
 * 3의 배수들의 합계를 계산하여
 */
public class Controller_12 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int nums = 0;
		int sums = 0;
		for (int i =0 ; i <10;i++) {
			nums=rnd.nextInt(100)+1;
			if (nums %3 == 0) {
				System.out.printf("%d 는 3의 배수..\n", nums);
				sums += nums;
			}
			else {System.out.printf("%d  는 3의 배수가 아님\n",nums);
			}
			
		}
		System.out.println("=========================");
		System.out.println("3의 배수 합계 : \n"+sums);
	}
}
