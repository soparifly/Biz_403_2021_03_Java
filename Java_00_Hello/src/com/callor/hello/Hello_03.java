package com.callor.hello;


/*
 * 숫자 연산
 * java 에서는 수학의 4칙연산과 나머지 연산을 수행할수 있다.
 * 
 * 숫자가 정수형일때는 
 * 4칙 연산의 결과가 모두 정수이다
 * 
 * 정수 / 정수 연산을 수행했을때 결과는 나눗셈의 몫을 구하는 연산이된다.
 * 정수 % 정수 연상을 수행하면
 * 결과는 나머지를 구하는 연산이된다.
 * 
 */
public class Hello_03 {

	public static void main(String[] args) {
	
		System.out.println(30 + 40);
		System.out.println(30 - 40);
		System.out.println(30 * 40);
		System.out.println(30 / 40);
		System.out.println(30 % 40);
		System.out.println("========================");
		// 40을 30으로 나누면 일반적 수학 연산에서는 소수점 이하값이 나타나지만
		//java에서 정수/ 정수 는 몫을 구하기때문에 결과는 1만나타난다
		System.out.println(40/30);
	
		//java에서 실수의 표현 1
		//java 는 실수를 표현할때 10의  -16승까지 표현한다
		//소수점 이하 16자리 까지 표현하고 이후값은 무시 or 반올림등을 수행한다
		System.out.println(40.0 / 30.0);
		//정수와 실수의 연산
		//정수와 실수가 섞여있는 연산 식에서는
		//모든 숫자를 실수로 변경하여 연산이 수행된다
		System.out.println(40 / 30.0);
		System.out.println(40.0 / 30);
		System.out.println(40F / 30f);
		//숫자뒤에 F(f)를 부착하면 단축형 실수가 된다.
		//소수점 이하 7째 자리까지만 인식한다.
		//(f/F = floating)	
		//단정도 실수 :
		//	소수 이하 7(6)째 자리까지 표현하는 실수
		//배정도 실수 :
		//	단정도 실수의 2배이상 자리까지 표현한 실수
		//고정 소수점 연산 (값)
		// 	정수는 소수점 이하 0번째 자리에서 
		//	반올림을 한다.
		/*
		 * 정수와 정수를 연산하면 결과도 정수
		 * 실수와 실수를 연산하면 결과도 실수
		 * 정수와 실수를 연산하면 결과는 실수
		 * 	단, 결과의 정확도는 예측할 수 없는 경우가 많다.
		 * 정수와 실수를 연산하면 먼저 정수를 실수로 변환한 후에 연산이 수행된다
		 * 
		 * 		 
		 */
System.out.println(40.0 * 20.0);
System.out.println(40.0 * 20.1);
	}

}
