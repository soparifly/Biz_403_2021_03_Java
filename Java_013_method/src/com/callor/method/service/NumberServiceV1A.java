package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1A {
	/*
	 * 난수를 생성하여 3의 배수이면 그수를 ☆ 아니면 null을 return하라
	 * 
	 * ==> 반드시 어떤 값을 return 하라
	 * 
	 * 대표값으로 어떤 타입의 값을 return 할것이낙 생성한 수가 1~ 100 까지 정수인 난수
	 * 
	 * 3의 배수 이면서 정수인 값을 return하라 = 정수형 3의 배수를 return하라
	 * 
	 * return type을 void가 아닌 정수형 type으로 지정해야한다 int와 Integer 가 있다 // null 값을 리턴해야하기
	 * 때문에 int값을 사용할수 없다
	 * 
	 * 
	 * 
	 * return의 두번째 조건에 "아니면 null 값을 return"하라는 지시가 잇으므로 int형은 사용할수없다.
	 * 
	 * //일반적인 도출에는 int을 사용하면 좋지만 null값이 필요하기때문에 Integer를 사용한다
	 * 
	 * 이매서드는 정수형 3의ㅏ 배수또는 null값을 return 해야하기때문에 Integer형 return type을 설정해야한다
	 * 
	 * void대신 Integer를 사용한다
	 * 
	 * 
	 * 
	 * void 키워드 method에 return 명령이 꼭 없어도 되는 method
	 *
	 * void 대신 Integer 를 사용하면 return 명령문과 return 할 값(대상)이 ☆반드시★ 코드에 있어야한다 아직 method에
	 * return문에 없기때문에 오류가 발생했다 method에 오류가 난것을 없애기 위해 return문을 추가한다
	 *
	 * ★★★★이 메소드는 return 명령문만으로 처리가 도지ㅣ않고 반드시 return값(대상) 이 있어야한다. primitive type 중에
	 * 숫자형인 경우는 0을 ★★★★★wrapper 클래스 type을 사용하는 경우는 null을 보통 사용한다★★★★★
	 * 
	 * 오류가 있으면 자동완성기능이 안되기때문에 임시적인 return값을 입력해놓고 코딩을 한다
	 * 
	 */

	public Integer inputNum() {
		Random rnd = new Random();

		Integer num1 = rnd.nextInt(100) + 1; //wrapper 클래스 속성
		int num2 = rnd.nextInt(100) + 1; //primitive 속성 내부에서 int에서 Integer형식으로 바꾸는 작업이 이루어진다

		if (num1 % 3 == 0) {
			return num1;
			
		}
		if (num2 % 3 == 0) {
			
			
			/*
			 * 현재 inputNum() method의 return type은 Integer 이다
			 * 그런데 여기에서 return하는  num2변수의 type은 int형이다
			 * 별다른 문제를 일으키거나 하지는 않지만.
			 * 실제 코드가 작동될때는 
			 * int형을 Integer wrapper클래스 형으로 변환하는 과정이 일어난다
			 * 
			 */
			return num2;
			
		}
		return null;
	}
}
