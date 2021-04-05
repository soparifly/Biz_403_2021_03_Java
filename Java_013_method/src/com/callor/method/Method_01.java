package com.callor.method;

import java.util.Random;

public class Method_01 {
	
	/*
	 * Randon(난수) 1개를 생성하여 3의 배수인가 
	 * 
	 */
	public static void main(String[] args) {
		
		/*
		 * 	Random 클래스 를 사용하여 rnd객체를 선언하고
		 * Random() 생성자 method를 호출하여 
		 * 객체를 생성 (초기화) 하기 
		 * 
		 * 객체를 선언만하고 생성(초기화)을 하지않고
		 * 객체.method()를 호출하면  NullpointException이 발생한다
		 * 
		 * 
		 * NullpointException  : 객체가 아직 실체가 없다.
		 * 
		 */
		Random rnd = null; //rnd 라는 객체를 선언하는데 아직  준비가 안되있다.
		rnd = new Random();
		
		
//		= > Random rnd = new Random();
		
		/*
		 * Scanner 클래스를 사용하여 scan객체를 선언하고 Scanner() 생성자 method를 호출하여 scan객체를 생성한다
		 * Scanner() 생성자는 객체를 생성할때 System.in (키보드 입력장치)를 연결할수 있도록 매개변수에 정보를 전달해주어야한다 .
		 */
		
		String str1 ;  //저장되는 값이  ""
		/*
		 * String 클래스를 사용하여 str1객체를 생성한다
		 * String 클래스는 클래스이면서 변수적인 성질을 갖는 특별한 클래스이다. - > 사용법이 클래스 방식이면서 일반적인 변수처럼 사용할수 있다.
		 * wrapper 클래스들도 그러한 성질을 갖는다 
		 * 
		 */
		String str2 = new String("대한민국"); //저장되는 값이 "대한민국"
		String str3 = "우리나라"  ; // wrapper 클래스의 특징

		
//		INteger int1 = new Integer();
		/*
		 * int형 변수와
		 * Integer wapper를 사용하여 만든 변수 사용하는 기본방법은 동일하다 
		 * Integer 는 클래스적인 특성을 갖고있다보니
		 * new Integer() 생성자를 사용하여 변수를 만들면 다소 엉뚱하게 작동되는 경우가 있다
		 * 지금은 Integer()생성자를 사용하여 변수를 만들지 못하도록 하고있다
		 * 숫자형 변수는 생성자를 사용하여 변수를 만들지말자!!
		 * 
		 */
			
		Integer int2 = 30;
		
		/*
		 * int 에 저장된 정수가 3의 배수인가?
		 */
		Integer intNum = rnd.nextInt(100)+1;
		/*
		 * if 조건문을 사용하여  어떤 조건을 검사했을땨ㅐ
		 * 조건ㅇ에 완전히 일치하는 경우에는
		 * ~~ 하다. ~~ 라고 표현을 하고
		 * 조건에 일치하지 않는 else를 사용하여 표현할때는 딱 맞아떨어지는 어떤 조건을 찾기가 어렵기때문에 ~~가 아니다라고 표현하는 것이 좋다 
		 */
		if (intNum % 3== 0) {
			System.out.println(intNum +"은 3의 배수");
			
		} else {
			System.out.println(intNum + "은 3의 배수가 아니,ㅁ");
		}
		
		/*
		 * 어떤수가 짝수인가를 조건검사하고 짝수이면 짝수이다 라고 표현하고
		 * else이면 홀수이다라고 표현할수 있지만코드를 작성할때 조건으로 명시한 이외에는 가급적~~이 아니다라고 표현하자
		 */
		if (intNum % 2 ==0) {
			System.out.println(intNum + "는 짝수가 아님");
		}
		
		
		
		
		
		
	}
	
	

}
