package com.callor.values;

public class Values_06 {

	public static void main(String[] args) {
		System.out.println(33 % 2);
		// 33을 2로 나눈 나머지가 1인가 ?
		System.out.println( (33 % 2) == 1);
		
		//33을 2로 나눈 나머지가 0인가 ? 
		System.out.println( (33 % 2) == 0);
		
		//어떤 수를 2로 나누어서 나머지가 0이면
		// 그 어떤 수는 짝수이고
		//그렇지 않으면 그 수는 홀수 있다
		
		System.out.println((33 % 2) == 0 
	        			? "짝수" : "홀수");
		System.out.println(33 % 2); //결과표시
		
		//비교연산자
		System.out.println((33 % 2) == 0);
		
		//연산 ? -> true 일때 : false 일때
		System.out.println((33 % 2) == 0 ? "짝수":"홀수");

		System.out.println( 33 > 0 ? "33은 10보다 크다": "33은 10보다 작다");
		
		//3항 연산자 -> 비교 ? true : false 와 같이 항목 3가지가 구분되어 있는 연산
		System.out.println( 3 == 3 ?  "맞다":"틀리다");

		System.out.print("3 == 3 연산이 true 이냐 ? : ");
		System.out.println(3 == 3 ? "맞다" : "아니다");
	}
}
