package com.callor.values.var;

public class Varriable_06 {
	public static void main(String[] args) {
		
		//정수형 변수 선언과 clear
		int num1 = 0;
		Integer num2 = 0;
		
		//int & Integer로 선언된 변수는 정수값만 저장할수 있다
		// 최대 -2 의 31승 ~ 2의 31승 -1까지 범위만 저장할수 있다.
		num1 = 30;
		num2 = 30;
		
		// -2의 63승 ~ 2의 63승 -1까지 저장가능
		long numLong1 = 30L;
		Long numLong2 = 30L;
		
		
		// 실수의 16번째 소수점까지 저장가능
		float num3 = 30.0F;
		Float num4 = 30.0F;

		//Float 보다 더정밀함
		double num5 = 30.0;
		Double num6 = 30.0;
		
	}
}
