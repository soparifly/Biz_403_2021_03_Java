package com.collar.var;

public class Varriable_03 {

	public static void main(String[] args) {
		/* 
		 * 변수의 성질 1
		 * 코드가 TopDown(위에서 아래로)으로 진행되는 동안
		 * 이전에 변수에 어떤 값이 저장되었던 상관없이 
		 * 출력 시점 바로전 저장된 값만 유효하다
		 * * 
		 * 
		 */
		int intNum1 = 0;
		intNum1 = 30;
		intNum1 = 40;
		intNum1 = 50;
		intNum1 = 40;
		intNum1 = 0;
		
		/*
		 * 변수성질2
		 * 
		 * 젼수에서 값을 읽는 명령들
		 *		intNum1에 저장된 값을 읽어서 
		 * 		Console에 출력하라
		 * 변수에서 값을 읽는 명령이 몇번 수행되던 상관없이
		 * 한번변수에 저장된 값은 그대로 유지된다
		 * 
		 */
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		
		
		/*
		 * 변수 성질2
		 * 
		 * 변수에 값 저장, 할당, 대입
		 * 이때 대입연산자, 할당연산자를 사용한다
		 *  ex) 변수 = 값
		 *  	변수 = 식
		 *  	변수 = 변수
		 *   =  <할당연산자, 대입연산자
		 *   대입연산자가 명령문에 나타나면
		 *   대입연산자 오른쪽이 먼저 실행된다
		 */
		
		intNum1 = 30;
		intNum1 = 30 + 40;
		intNum1 = intNum1;
	
		/*
		 * int Num1에 저장된값 (70)을 cpu로 복사해서 보내기
		 * 어딘가에 저장된 100을 cpu로 복사해서 보내기
		 * 두 수(70,100)를 덧셈하이여 다시 intNum1에 저장
		 * 원래 intNum1는 갱신되어 170이 intNum1에 저장된다
		 */
		intNum1 = intNum1 + 100;
		intNum1 = intNum1 * 2;
		intNum1 = intNum1 - 100;
		intNum1 = intNum1 / 2;
		
//		=>  intNum1 += 100;
			intNum1 *= 2;
			intNum1 -= 100;
			intNum1 /= 2;
		
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;
		
//		==> intNum1 ++;
		
		intNum1 -= 1;
		intNum1 -= 1;
		intNum1 -= 1;
		intNum1 -= 1;
		
//		==> intNum1 --;
		
		
		
//		==>>>>> ++ intNum1;  --intNum1;
	}
}
