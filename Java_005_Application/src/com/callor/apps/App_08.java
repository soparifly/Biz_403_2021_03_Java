package com.callor.apps;
/*
 * 어떤 정수의 단위 자릿수가 얼마인가를 계산하는 코드
 */
public class App_08 {
//정수의 자릿수를 구하는 코드

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 74864564;
		int nCount = 0;
		System.out.printf("정수%d 는 ", intNum);
		while (intNum > 0) {

			nCount++;

			intNum /= 10;
		}
		System.out.printf("%d 자릿수의 숫자", nCount);

	}
}
