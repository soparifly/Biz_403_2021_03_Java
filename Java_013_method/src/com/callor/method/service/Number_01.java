package com.callor.method.service;

public class Number_01 {

	public static void main(String[] args) {

		String strNum1 = "100";
		// 문자열형 숫자
		String strNum2 = "100.0";

		System.out.println(strNum1 + strNum2);
		// 문자열 연결연산

		// strnum 과 strnum2에 저장된 값으로 4칙 연산을 표현하고싶을때			
		//4칙연산이 가능한 type으로 변환을 시켜야한다,.
		
		/*
		 * Integer 클래스에 정의된 valueOF() static메소드를 호출하여 문자열형 숫자를
		 * 정수형 값으로 변환하고 intNum에 저장하라
		 * 
		 * 
		 * Static 메서드는 클래스를 객체로 생성하지 않고도 호출할수 있다
		 * 단, 함수 방식으로 호출이 불가
		 * 클래스.method()형식으로 호출해야한다.
		 */
		Integer intNum = Integer.valueOf(strNum1);
		Float floatNum = Float.valueOf(strNum2);
		System.out.printf("%d + %f = %f\n",intNum,floatNum,intNum + floatNum);
		System.out.printf("%d - %f = %f\n",intNum,floatNum,intNum - floatNum);
		System.out.printf("%d * %f = %f\n",intNum,floatNum,intNum * floatNum);
		System.out.printf("%d / %f = %f\n",intNum,floatNum,intNum / floatNum);
	}
}
