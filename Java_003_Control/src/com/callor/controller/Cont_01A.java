package com.callor.controller;

public class Cont_01A {
	public static void main(String[] args) {
		int intNum = 0;

		System.out.println("============================");

		intNum++; // 증감연산자를 독립으로사용할경우는 증감연산자의 위치는 어디든 상관없다

		// 변수만을 이용한 출력
		System.out.println(++intNum + ".우리나라 만세");
		System.out.println(++intNum + ".우리나라 만세");
		System.out.println(++intNum + ".우리나라 만세");
		System.out.println(++intNum + ".우리나라 만세");
		System.out.println(++intNum + ".우리나라 만세");
		System.out.println(++intNum + ".우리나라 만세");
		System.out.println(++intNum + ".우리나라 만세");
		System.out.println(++intNum + ".우리나라 만세");
		// ++가 다른 명령문과 함께 사용될때는 변수의 앞, 뒤에 따라 결과가 달라진다

		// 반복문 for를 이용한 출력
		intNum = 0;
		for (; intNum < 10;) {
			// 조건문에서 가급적 증감연산자를 사용하지않아야한다
			// 메인 메서드는 위에서 아래로 흐르는
			//
		}
		++intNum;
		System.out.println(intNum + ". 우리나라 만세");

		// => ++intNum;을 for문에 넣을때
		intNum = 0;
		for (; intNum < 10; intNum++)
			System.out.println(intNum + ".우리나라 만세");

		// => 클리어 하는 명령문을 for문에 넣을때
		for (intNum = 0; intNum < 10; intNum++) {
			System.out.println(intNum); //java실행순서 선언확인 / 조건확인 / 변수확인 / 증감연산자 대입	
/*
 * for ()명령을 만나면 
 * (선언문)intNum = 0을 실행한다
 * 이명령은 반복 횟수와 관계없이 최초에 1회만 실행된다
 * ;(반복);
 * 
 *intNum <10을 실행하여 조건을 검사 결과가 true 이면 {}의 내부명령을 실행한다
 *
 *명령 실행이 끝나면, 다시 for()명령문 시작으로 되돌아온다 
 *intNum++ 명령을 실행
 *조건 검사 :intNum <10
 *
 *증가, 조건검사를 반복하면서 조건의 검사결과가 false가 될때까지 반복하여 {}의 명령을 실행한다
 *
 */
		}
}
