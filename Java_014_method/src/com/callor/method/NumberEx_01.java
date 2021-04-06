package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class NumberEx_01 {

	public static void main(String[] args) {
		NumberServiceV1 nsv1 = new NumberServiceV1();

		/*
		 * 두개의 매개변수를 갖는 addNum() method에게 정수 30과 31을 전달하고 그결과를 retrNum 변수에 담아라
		 */
		Integer printn1 = nsv1.addNum(30, 31);

		if (printn1 == null) {
			System.out.println("결과는 짝수가 아님");

		} else {

			System.out.printf("결과 [%d] 는 짝수", printn1);
		}
		
		
//		nsv1.addNum(30.2, 44.2);//이렇게 작성하면 오류가난다  입력한 매개 변수를 더블형으로 인식한다는 뜻이다 플로트 값으로 인식시켜주기위해서 매개변수에 f를 입력해야한다
		nsv1.addNum(30.2f, 44.2f);
/*
 * 
 * 		nsv1.addNum(30.2f, 44.2f); method는 return type	이 float이기때문에 retrun 되는 결과값을 저장하는 변수 printn1도 반드시
 * 									float, Float형이여야한다
 * 
 */
		Float num = nsv1.addNum(30.2f, 0.32f);
//		float num2 = nsv1.addNum(30.2f, 0.32f); // return 값이 null값이기때문에  java.lang.NullPointerException 이 발생한다
		/*
		 * 변수를 선언하는 방식에서 primitive방식과 wrapper class 방식이 있다
		 * 특히 숫자를 다루는 경우에 항상 숫자값만 저장된다는 보장이 있을 경우에는
		 * primitive방식으로 선언해도 아무런 문제가 없다
		 *  java나 DB(dataBase)와 연동되는 프로젝트를 구현할때는 null(널) 이라는 특별한 값을 항상 인식해야한다,
		 *  	어떤 결과가 null값을 갖게 되는 경우 primitive 방식에서는 취급이 불가능하다
		 *  
		 *  
		 *  이럴때는 변수를 선언할때 wrapper class 방식을 사용하는 것이 바람직하다.,
		 *  
		 */
		//객체지향 특징중 다형성
		//method의 중복선언 이라고도한다.
		//같은 이름의 method가 한개의 클래스에 중복되어있어도
		//전달하는 값에 type에 따라 java는 자동으로  매개변수 형식과 일치하는 method를 찾아서 연결해준다
		//public Integer addNum(int num1, int num2)가 호출
		nsv1.addNum(30, 40);
		
		//public Float addNum(float num1, float num2)가 호출
		nsv1.addNum(30f, 40f);
		

	}
}
