package com.callor.controller;

public class Controller_05 {
	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 4;

		boolean bYes = num1 % 3 == 0 //true
				&& num2++ % 4 == 0; //ture
		
		// 후위 연산자의 경우에는 명령문이 끝나고나서 연산이된다.

		bYes = num1 % 3 == 0 //ture
				&& (++num2) % 4 == 0; //false 

		// num1이 3이라도 num2의 값 6이므로 false이다

		bYes = num1 % 3 == 0 //true
				&& (++num2) % 3 == 0; //false

		/*
		 * && 연산의 경우 왼쪽에서 오른쪽으로 코드 실행이 진행되면서 
		 * 한번이라도 
		 * false결과가 나오면 그 이후 코드는 연산수행을 하지않는다,
		 * 
		 */
		bYes = num1 > 4 //false 
				&& ++num2 > 5; //false

		/*
		 * ||(or)연산의경우 왼쪽에서 오른쪽으로 코드 실행이 진행되면서 
		 * 한번이라도
		 *  true 인결과가 나타나면 그이후 코드는 연산수행을 하지않는다
		 * 
		 */

		bYes = num1 < 4 || ++num2 < 5;
		// num1 는 3이므로 true 이다

		/*
		 * 선행되는 코드가 결과가 뚜렷하여 이후 코드가 실행될 필요가 없으면 
		 * 코드실행을 멈추는 기능
		 * 
		 * 이러한 기능때문에 ++ 연산 += (*=, -=..)연산에서 원하는 결과가 이후에 반영이; 안되는 경우가 있기 때문에 사용하는데 상당히
		 * 주의를 기울여야한다
		 */

	}
}
