package com.callor.controller;

public class Cont_08 {
	public static void main(String[] args) {
		int intNum = 9;
		for (int i = 2; i < intNum; i++) { // 2부터 9전까지 수를 intNum을 나눴을때

			boolean bYes = intNum % i == 0; // 나머지가 0 인가
			if (bYes) {
				System.out.println(intNum + "소수가 아님"); //bYes 변수를 실행했을때 true라면 출력함 "소수가 아님"
			}
		}

	}
}
