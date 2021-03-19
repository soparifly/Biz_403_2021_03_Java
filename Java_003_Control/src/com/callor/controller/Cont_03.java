package com.callor.controller;

public class Cont_03 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}

		System.out.println("=============================");
		for (int i = 0; i < 10; i++) {
			System.out.println("우리나라");

		}
		System.out.println("=============================");
		for (int i = 0; i < 10; i++) {
			int intSum = i + 1;
			System.out.println("대한민국1");

		}
		for (int i = 0; i < 10; i += 2) {
			System.out.println("대한민국");

		} // i++ ; 와 i++ = +=2

		/*
		 * i++와 +1 차이 1. 변수 i의 저장된 값이 변경 되느냐 아니냐의 차이 i++ :i 에 저장된 값이 1증가하는 값으로 변경
		 * (변경된i값을 다른명령어에서 사용하려고 할때) for() 반복문 내에서 i++를 사용할때는 매우 주의 해야한다. for반복문 횟수가
		 * 변경되어 버린다. 하지만 i + 1 :i에 저장된 값은 변경되지 않는다 (i 변수에 저장된 값에 1을 덧셈하여 임시적으로 다른명령어에서
		 * 사용하려고 할때)
		 * 
		 */
		for (int i = 0; i < 10; i++) {
			i--;
		} // i++; , i--; > 0
		/*
		 * for()반복문 내에서i++를 실행하고{for본문명령문}에서  i--를 실행했다
		 * 이런상황이 되면 i값은 i<10 조건에서 항상 true인 상태가 되어 
		 * 무한반복되는 코드가 되어버린다
		 */
		
	}
}
