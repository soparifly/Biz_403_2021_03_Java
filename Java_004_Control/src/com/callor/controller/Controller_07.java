package com.callor.controller;

import java.util.Random;

public class Controller_07 {
	public static void main(String[] args) {

//					    ┌> : 초기화, 생성부 Random클래스를 사용하여 선언된 rnd 변수를 사용하기 위한 생성
		Random rnd = new Random();
//	      └>선언부  Random클래스를 사용하여 어떤 명령을 수행하기위한 예약       

//	Random 클래스에서 제공하는 nextInt()명령을 수행하라
//	그리고 그명령을 수행한 결과를  num변수에 저장하라

//**어떤 임의의 정수를 만들어서 num변수에 저장해 달라
		int num = rnd.nextInt();

//	대입연산자 (=) 오른쪽에는 값, 연산식, 변수가 올수있다
//	왼쪽에 변수에 값, 연산식의 결과를 변수에 담기 /값을 저장한다

		int num1 = 3;
		num1 = 3 + 3;

		// -2^31~ 2^31 -1) 범위에 포함되는 임의의 난수를 만들어서 num변수에 저정해달라
		// 난수 : 예츨할수 없는 무작위의 숫자들
		num = rnd.nextInt();
		System.out.println(num);
	}
}
