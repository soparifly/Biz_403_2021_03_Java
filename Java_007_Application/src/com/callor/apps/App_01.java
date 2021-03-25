package com.callor.apps;

import java.util.Random;

public class App_01 {
	public static void main(String[] args) {

		int num1 = 9;
		int num2 = 11;

//for (int index = 2; index < num; index++) {
//	if (num1 % index == 0) {
//		System.out.println(num1 + "은 소수가 아님");
//		
//	} else {
//		//num1 이 소수가 아닌것을 계속해서 반복해서 출력된다
//	}
// 11이 소수인것을 판별하라
		boolean notPrime = false; // 플래그 flag변수
		for (int index = 2; index < num2; index++) {
			// num 2 가 소수가 아닌것이 발견되면
			// notPrime변수에 true를 설정
			notPrime = true; // 플러그 변수 셋팅
			break;
		}
		// 셋팅 되거나 그렇지 않은 경우를 판단하여 결과를 출력하기

		if (notPrime) { // notprime
			// num2 가 소수가 아닌경우
			System.out.println(num2 + "는 소수가 아님");
		} else {

			System.out.println(num2 + "는 소수임");

			// for 반복문이 모두 완료되었거나 중간에 Break를 만나서 모두 중단되었거나 하는 경우임
		}
		System.out.println("=====================================");
		int num = 3;
		for (num = 2; num < num2; num++) {
			if (num2 % num == 0) {
				break;
			}
		}
		System.out.printf("num2 : %d, num : %d ", num2, num);
		/*
		 * for()반복문에서 사용할 num(index변수)를 for()반복문 시작전에 선언을 하고 실행을 하면 for() 반복문이 종료된 num값을
		 * 읽을수 있다 (==참조한다) 이때 1. 만약 중간에 break를 만나서 for()가 중단되거나 2.break없이 for()반복문이 모두
		 * 완료되거나 할텐데 1,2,의 경우에 num변수 상태가 다르다
		 * 
		 * num 변수의 값은 조건문에 최대 값과 같다 1.break가 되면 num값은 num2보다 항상작다 2번의 경우 num값은 num2보다
		 * 크거나 같은상황이된다 if (num == num2) 이라는 비교문을 사용하는 것보단 if (num < num2) 조건문을 사용하는 것이
		 * 논리적인 문제를 최소화할수 있다
		 * 
		 */

		// 조건문에서 값이 애매하게 만들어져 논리적 오류를 일으킬 가능성이 있다
		if (num == num2) {
			System.out.println(num2 + "소수이다");

		} else {
			System.out.println(num2 + "는 소수가 아님");
		}
		// 논리적인 오류를 최소화하기 위하여 비교연산자를 1개만 사용하여 검사할수 있는 코드를 사용하는 것이 좋다
		if (num < num2) {
			System.out.println(num2 + "는 소수가 아님");
		} else {
			System.out.println(num2 + "는 소수");
		}
	}
}
