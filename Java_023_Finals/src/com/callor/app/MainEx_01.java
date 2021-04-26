package com.callor.app;

import java.util.Random;

public class MainEx_01 {
	
	public static void main(String[] args) {


	int num1 = 0;
	int num2 = 0;
	

	num1= 30;
	num2= 40;
	
	int sum = num1 + num2;
	// 변수를 선언하고 초기화하지않으면 익셉션이발생한다
//	System.out.println(num);
	//num 이나는 이유
	
	int num;
	System.out.println(num);
	
	Random rnd = new Random();
	int rndNum = rnd.nextInt(100)+1;
	
	if(rndNum% 2 == 0) {
		System.out.println(rndNum+ "는 2의 배수이다" );
		System.out.println(rndNum+ "는 짝수이다");
		
	} else {
		System.out.println( rndNum + " 는 2의 배수가 아니다");
		System.out.println(rndNum + "는 짝수가 아니다");
		System.out.println(rndNum + "는 홀수이다");
	}
	 int intSum =0;
	  for(int i =0 ; i < 100; i++) {
		  int intNum = i+1;
		  intSum += intNum;
	  }
	  System.out.println("1 ~ 100까지 덧셈결과 :" + intSum);
	
	  intSum =0;
	for(int j = 0; j =< 100 ; j++) {
		intSum += i;
		System.out.println("1~ 100 까지 덧셈결과 "+ intSum);

	
	}
	
	}
}
