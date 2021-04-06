package com.callor.method.service;

public class NumberServiceV1A {
	/*
	 * method의 이름은 addnum() 두개의 정수를 매개변수로 받는다 누구나 어디선가, addNum()를 호출할때는 객체.addNum()
	 * 2 개의 정수를 전달하게 하겠다 라는 의미이다 객체.add(100,200)
	 * 
	 * 2개의 정수를 전달 받기위해서는 method가 준비를 해야한다. method의 ()안에 변수를 선언한다. 두개의 변수를 선언하자
	 * 
	 * 두수의 합을 계산하여 결과가 짝수이면 그합을 return 하라 return합 ; 형식의 명령이 있어야한다 그렇지 않으면 null을
	 * return하라 return null ; 형식의 명령이 있어야한다.
	 * 
	 * 
	 * 단순히 정수만 return 을 해야하는 int type으로 하면되는데 여기에서는 어떤 조건에 따라 null값을 return해야하는
	 * 경우도있기때문에 int type이 아니고 Integer type으로 설정해야한다 return 값 형식이 있으려면 void가 아닌
	 * return type을 지정해주어야한다 이때 중요한것은 호출하는 변수도 형식이 Integer형식이여야 null을 받을수 있다는것이다.
	 *
	 */

	public Integer addNum(int num1, int num2) {
		//다른방법이있다 관습적인 면에서 return문은 한번만써야한다는 것이 있는데
		//굳이 사용하지 않아도 사용할수있다.
		//C언어 와 같은 함수형 언어에서는 함수를 끝내는 return 문은 한번만쓰자 라는 규칙이있다
		
		Integer sum = null;
		if ((num1 + num2)%2 == 0) {
			sum = num1 + num2;
		}
		return sum;

	}
}
