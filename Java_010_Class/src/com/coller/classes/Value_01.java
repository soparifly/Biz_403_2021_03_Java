package com.coller.classes;

import java.util.Random;

public class Value_01 {
	public static void main(String[] args) {

		/*
		 * 자바에는 Keyword이면서 값인 경우가 있다. true, false는 boolean형의 값이다 참,거짓을 나타내는 java언어의 고유한값
		 * 비교연산문의 결과를 표현하기위한 독특한 값
		 * 
		 */
		boolean bYes = true;

		bYes = false;
		// 30: 정수값, 리터럴
		int num = 30;

		/*
		 * null값(널값) : 아무것도 아닌값
		 */
		Integer num1 = 0;

		/*
		 * //-1 을 입력했을때 코드를 종료하고싶다 이러한 코드를 작성했었다. 이경우에 num1에 -1값이 어떤 의미없는 값이기때문에 가능한
		 * 코드이다 만약에 -1이 실제값으로 존재를 하는 필요한 값이라면 이러한 코드는 사용이 어려워진다 이럴때, 사용할수 있는 값을
		 * null값이라고한다.
		 */
		if (num1 == -1) {
			// 코드종료
		}
		num1 = method(); // <메소드 진행 순서>method코드를 호출함 -> 아래 private 코드값이 실행됨 -> return값이 num1값에 전달됨
		if(num1 == null) {
			System.out.println("3의 배수도 아니고 "+"4의 배수도 아니다");
		}
		
		num1 = 0;
	}

//	0~99까지 중에 난수 1개를 생성하여 return하는 method이다.
	private static Integer method() {

		Random rnd = new Random();
		Integer num = rnd.nextInt(100);
		if (num % 3 == 0) {
			return 1;
		} else if (num % 4 == 0) {
			return -1;
		} else {
			return null;
		}
	}

}
