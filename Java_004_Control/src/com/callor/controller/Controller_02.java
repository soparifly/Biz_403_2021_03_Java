package com.callor.controller;

public class Controller_02 {
	public static void main(String[] args) {
		/*
		 * boolean(boolean) true, false 2가지 경우의 값을 갖는 특별한 형태 대입연산자 (=)오른쪽의 연산을 먼저 수행하여 3
		 * == 3 (== : 동등연산자,일치연산자) 결과를 bYes 변수에 담아라 동등 연산자는 두 값이 같냐? 결과는 true 또는 false가
		 * 된다. bYes는 15 % 3 == 0 ;
		 * 
		 * 
		 */
		boolean bYes = 3 == 3;// true
		bYes = 15 % 3 == 0;
		int intNum = 15;
		System.out.println(intNum % 3 == 0); // intNum에 담긴 값이 3의 배수이냐
		System.out.println(intNum % 5 == 0); // intNum에 담긴 값이 5의 배수이냐

		// intNum에 담긴 값이 3의 배수이면서, 5의 배수이냐
		// %3 == 0 AND %5 == 0 이냐
		bYes = intNum % 3 == 0 && intNum % 5 == 0;
		// && : AND관계 관계연산자
		intNum = 12;
		// intNum에 담긴 값이 3의 배수이거나 또는
		// 5의 배수인가

		bYes = intNum % 3 == 0 || intNum % 5 == 0; // || : or관계연산자
		// || 관계연산자
		/*
		 * 2가지 이상의 비교연산 (==,<,>,<=,>=, !=)을 동시에 수행하기위한 연산
		 * 
		 */

		// &&는 true : 1, false 0으로 하는 곱셈 연산을 기억하면된다
//			 bYes = true && true // true
		bYes = true && false; // false
		bYes = false && true;// false
		bYes = false && false;// false

		// filer 기호 ||
		// true, 1, false를 0 으로 하여 덧셈연산을 기억하면된다
//			 
//			 bYes = true || true //1 + 1 = 1잇다					 
//			 bYes = true || false;// 1 + 0 =1
//			 bYes = false || true;// 0 + 1 =1
//			 bYes = false || false; // 0 + 0 = 0
	}
}
