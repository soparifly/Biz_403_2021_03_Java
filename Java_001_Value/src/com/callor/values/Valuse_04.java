package com.callor.values;

public class Valuse_04 {

	public static void main(String []args) {
	
		/*
		 * %f 실수를 출력할때
		 * 소수점 이하 자릿수를 지정할수 있다.
		 * EX_) %3.2f:  소수점 이하 3번째에서 반올림하고 
		 * 둘째 자리까지 표시하라 
		 */
		System.out.printf("%3.1f\n",34.25678);
		System.out.printf("%3.2f\n",34.25678);
		System.out.printf("%3.3f\n",34.25678);
		System.out.printf("%3.5f\n",34.25678);
		System.out.printf("%3.6f\n",34.25678);
		System.out.printf("%3.7f\n",34.25678);
		System.out.printf("%3.8f\n",34.25678);
		
		System.out.printf("%d + %d = %3d\n" , 33,2,33+2);
		System.out.printf("%d x %d = %3d\n" , 33,2,33*2);
		System.out.printf("%d - %d = %3d\n" , 33,2,33-2);
		System.out.printf("%d / %d = %3d\n" , 33,2,33/2);
		System.out.printf("%d MOD %d = %3d\n" , 33,2,33%2);
		//%d 출력식에서는 %기호를 사용할수없어서 대신에 MOD를 사용한다.
		System.out.printf("%d / %d = %3.2f\n" , 33,2,33/2.0);
		//결과값이 실수여야하는데 정수폼인 d를 사용했을경우 오류발생함
		// 결과값의 D를 F로 변경해주어야함 추가로*소숫점 자리 표현도 정해주어야함
		
		
		
	}
}
