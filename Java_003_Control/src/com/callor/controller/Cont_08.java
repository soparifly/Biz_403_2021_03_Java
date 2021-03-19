package com.callor.controller;

public class Cont_08 {
	public static void main(String[] args) {
		
		
		
		/*
		 * 임의의 수를 변수에 담고
		 * 2 ~ (임의의수 -1)을 반복하면서 나머지 연산을 수행해본다
		 * 
		 * 나머지 연산결과가 0인경우가 있는가 확인하고 나머지 연산결과가 한번이라도 '0'인경우가 있으면 
		 * 그 수는 소수가 아니다 라고 출력한다
		 */
		
		
		int intNum = 78;
		for (int i = 2; i < intNum; i++) { // 2부터 9전까지 수를 intNum을 나눴을때

			boolean bYes = intNum % i == 0; // 나머지가 0 인가
			if (bYes) {
				System.out.println(intNum + "소수가 아님: " + i); //bYes 변수를 실행했을때 true라면 출력함 "소수가 아님 : "+i
				// 만약 반복문이 진행되는 동안에 나머지가 0인 경우가 나타나면 그 수는 소수가 아니므로
				//"소수가 아님"메시지를 보여주고
				//for ()반복문을 중단(break)하라
				break;
				 //반복문을 반복하다가 한번이라도 소수가 아닌경우가 있다면 작동을 멈추어라 //반복문내에서만 사용할수있는 명령문
				
			}
		}

		intNum = 77;
		for (int i = 2 ; i < intNum ; i++){
		boolean bYes = intNum % i == 0 ;
		if (bYes) {
			System.out.println("소수가 아님");
			break;
		}
		}
	}
}
