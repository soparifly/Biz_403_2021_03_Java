package com.callor.controller;

/*
 * 명령어
 * 코딩을 할때 반드시 정확한 스펠링으로 사용해야하는 
 * 중요한  keyword 키워드 들
 * ex) public class ,static,void
 * 명령문
 *  명령어와 명령어가 조합되고, 다른 어떤 단어들이 
 *  조합되어 문장을 이루는 형태 
 *  => statement = 명령 구문
 *  
 *  보통 명령문 끝에 (;)이 있다
 *  -한줄에 끝나는 명령문
 *  명령문이 그룹으로 설정되는 경우는 {}가 있다.
 *  -다른명령문들을 포함하는 명령문
 */

public class Cont_02 {
	public static void main(String[] args) {

		int num = 0;
		for (num = 0; num < 10; num++) {
			System.out.println(num);
		}
		for (int index = 0; index < 10; index++) {
			System.out.println(index);
		}
		for (int i = 0; i < 10; i++)
			System.out.println(i);

		// 컴퓨터에서는 0부터 출력한다
		// 결과값은 9가 나오지만 10으로 만들고싶다면 결과값에 + 1 을 해주어도된다

		/*
		 * 반복 비교하기 위하여 사용하는 변수를 i 로 선언 및 초기화하고 조건문을 설정하는 일반적인 반복(구)문
		 */
	}
}
