package com.callor.values.var;

public class Varriable_02 {

	public static void main(String[] args) {
		//int = integer = 정수
		
		/*
		 * 변수의 선언
		 * 변수는 사용(저장, 읽기)하기 전에
		 * 반드시 선언 resolve을 해야한다
		 * 선언 키워드 변수명
		 * 어떤 기억장소에 값을 저장할수 있도록
		 * 예약하는 절차
		 * 
		 */ 
		 
		int numbers;
		/* 
		 * 이미 선언된 변수 이름은 같은이름으로 
		 * 또다시 선언할수 없다
		 */
		int num1 = 100;
		int num2 = 200; 	//변수 선언문 선언은 한번만가능하다
		
		
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	
	}

}
