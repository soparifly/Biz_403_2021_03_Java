package com.callor.controller;

import java.util.Random;

/* JDK에는 수없이 많은 도구들이 포함되어 있다,.
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
		 */
		Random rnd = null; // 선언
		rnd = new Random(); // 초기화

	}
}
