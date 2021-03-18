package com.collar.var;

public class Varriable_01A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer
		// 정수값을 저장할 기억장치를 예약하고
		//그곳에 num1,num2이름 을 붙여달라
		//값이 정해지지않았을땐 O을 사용한다
		//정수형  변수 Num1,num2를 선언하고 각각변수에 정수 33,55를 저장하라
		// num1,num2변수는 사용할 준비가 된다
		// => num1,num2변수가 초기화되었다라고 한다
		// => num1,num2변수가 생성되었다라고 한다
		int num1 = 33;
		int num2 = 55;
		
		
		int sum = 0;
		int minus = 0;
		int  times = 0;
		int div = 0;
		
		sum= num1 + num2;
		minus = num2 - num1;
		times = num1 * num2;
		div = num2 / num1;
		
		System.out.println("==================================");
		
		System.out.printf(" %d + %d = %d\n",num1,num2,sum);
		System.out.printf(" %d - %d = %d\n",num1,num2,minus);
		System.out.printf(" %d * %d = %d\n",num1,num2,times);
		System.out.printf(" %d / %d = %d\n",num1,num2,div);
		
		System.out.println("==================================");
	}

}
