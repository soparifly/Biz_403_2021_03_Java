package com.callor.controller;

import java.util.Random;

/* 
 * JDK에는 수없이 많은 도구들이 포함되어 있다,.
 * Lego 블럭을 이용해서 작품을 만드는 것처럼
 * JDK 에 있는 도구들을 사용하여 프로젝트를 만들 수 있다. 
 * JDK 에 있는 도구는 워낙 종류가 , 갯수가 많아서 한꺼번에 프로젝트에 포함하면 
 * 프로젝트가 너무 무거워 질것이다,
 * 이러한 문제를 방지하기 위하여 JAVA에서는 가장 기본적인 도구 외에는
 * 모두 파일로 제공하고 필요에 따라
 * 연결(import)하여 사용할 수 있도록 하고있다.
 * 
 * import java.util.Random;
 * 
 * 지금부터 Controller_06 클래스에서
 * java.util패키지의 Random클래스라는 도구를 사용하여 코딩을 하겠다라는 선언
 *  사용법 밑줄그어진 키워드 위에 안내 상자가 나타나면 import선택함
 *   eclipse 에서 도구를 사용하기 위해서 import하고자 할때는
 *   Ctrl + shift + 0를 눌러주면된다
 *   
 *   코드의 모양정렬
 *   Ctrl + shift + F 
 */

public class Controller_06 {

	public static void main(String[] args) {

		/*
		 * 프로젝트에서 JDK의 도구를 사용하는 방법 변수를 선언하고 초기화 하는 것과 유사함 명령어 + 변수명 = 초기화
		 * 
		 * int 키워드는 정수형 변수를 선언 integer 키워드는 정수형 변수를 선언 실체는 키워드가 아니고 class이다
		 * 
		 * 키워드는 java처음 탄생될때부터 만들어진 명령어 class는 키워드처럼 사용되지만 java가 탄생하고 이후에 필요에 따라 추가, 확장된
		 * 명령
		 * 
		 */
		Random rnd = null; // 선언
		rnd = new Random(); // 초기화

		Random rnd1 = new Random();

		Integer num2 = 0;
//		Integer num3 = integer(0);

		String str1 = "";
		str1 = "홍길동";

		String str2 = null;
		str2 = "이몽룡";

		String str3 = new String();
		/*
		 * wrapper클래스 =클래스이지만 변수선언처럼 사용할수 있는 도구들 integer, Long, Float, Double, Boolean,
		 * Charactor.
		 * 
		 * int, long, float, double, boolean, char키워드에 확장된 기능을 할수있도록 만들어진 class이다 기본 기능은
		 * 값을 저장하는 변수를 선언한다. 기본기능에 별도로 확장된 추가 명령을 수행할수 있도록 만들어진 도구들이다
		 * 
		 */

	}
}
