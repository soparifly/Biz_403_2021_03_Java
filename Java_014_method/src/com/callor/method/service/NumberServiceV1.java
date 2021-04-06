package com.callor.method.service;
public class NumberServiceV1 {
	public NumberServiceV1() {
	}
/*
 * 함수형 프로그래밍 언어(또는 구조적 프로그래밍 언어)에서는
 * 한개의 모듈(파일) 또는 한 프로젝트에서 같은 이름의 함수를 선언할수 없다.
 * 
 * 
 * 객체지향 프로그래밍 언어(Java에서는)
 * 한개의 클래스 (파일)내에서 같은 이름의 함수/method를 중복하여 선언할수 있다.
 * 한개의 클래스에서 method	를 중복선언할수 있다. 
 * (다형성)단, 조건이 있는데 매개변수가 달라야한다.
 * 		매개변수의 type, 개수, 순서가 다르면 같은 이름의 method	를 중복선언할수 있다.
 */
	public Integer addNum(int n1, int n2) {
		// TODO 두정수의 합이 짝수인가, 판별하는 method
		
		/*
		 * 1. NumberServiceV1 클래스를 선언
		 *  2. addNum() method 는 두개의 정수를 매개변수로 받는다
		 *  3. 매개변수로 받은 2개의 정수의합을 계산하고
		 *  합의 결과가 짝수이면 계산결과를  return 하고 그렇지 않으면null 을 retrun한다
		 *  
		 */

		// 어떤연산을 수행하고 연산 결과에따라 return등을 수행해야 하는 경우
		// 연산된 결과를 변수에 담아놓고 이후 코드를 진행하자

		int intSum = n1 + n2;

		if (intSum % 2 == 0) {

			return intSum;

		} else {

			return null;

		} // addNum(int num1, int num2 )가 끝나는곳

	}

	/*
	 * java 의 method는 매개변수에 따라 호출하는 방식이 달라진다 만약 addNum(정수, 정수)방식으로 호출하려면 addNum(int
	 * num1, int num2) 형식으로 method를 선언해야한다 만약 addNum(실수, 실수)방식으로 호출하려면 addNum(float
	 * num1, float num2) 형식으로 method를 선언해야한다
	 * 
	 * method를 호출할때 전달하는 데이터의 type에 맞도록 method가 미리 만들어져있어야한다.
	 */
	public Float addNum(float num1, float num2) {
		// TODO 두 실수를 전달받아 짝수인가 판별하는 코드

		float sum = num1 + num2;
		if (sum % 2 == 0) {
			return sum;
		}
		// method 코드가 아직 작성되지않았을때
		// 문법 오류가 나는것을 방지하는 임시코드

		return null;

	}
	public Float addNum(int num1, float num2) {
		return null;
		
	}
	public Float addNum(float num1, int num2) {
		return null;
	}

}
