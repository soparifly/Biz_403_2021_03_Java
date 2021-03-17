package com.callor.values;

public class Values_07 {
	public static void main(String[] args) {
/*
 * 어떤 수를 3으로 나눈 나머지가 0이면 
 * 그 어떤 수는 당연히 3의 배수이다.
 * 하지만, 나머지가 0이나 아닌 경우는 정확히 이러한 값이다 라고 표현하기가 어렵다
 * 즉, 결정하기가 어렵다
 * 정확히 "결정된 값(3의배수가)아니다"라고 표현
 * 
 */
		System.out.println((33 % 3) == 0 ? "3의 배수" : "3의 배수가 아니다");
		System.out.println((33 % 3) > 0 ? "3의 배수가 아니다" : "3의 배수");
	}
}
