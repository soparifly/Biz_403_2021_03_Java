package com.soparifly.apps;

public class FunctionTest {
	/*
	 * 두 수의 값을 더하는 매서드를 만들고 간단하게 구현해보
	 */
	public static void main(String[] args) {
		int num1;
		int num2;
		num1 = 10;
		num2 = 20;

		int sum = add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + sum);
	}

	public static int add(int n1, int n2) {

		int result = n1 + n2;

		return result;
	}

}
