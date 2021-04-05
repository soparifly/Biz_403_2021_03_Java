package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2 {

	Scanner scan;
	String strNum;
	Integer intNum2;

	public NumberServiceV2() {

		scan = new Scanner(System.in);

	}

	public Integer intputNum() {
		strNum = "";

		System.out.println("값을 입력하세요 0 ~ 100");
		System.out.print("QUIT입력시 종료>> ");
		/*
		 * 이런 조건에서는 문자열로 입력받는다 다른 TYPE의 데이터를 동시에 취급하기 위해서는 기본 type을 string형으로 설정하는 것이
		 * 편하다
		 */

		strNum = scan.nextLine();

		//

		if (strNum.equals("QUIT")) {

			System.out.println("종료합니다");
			return null;
			// quit 일때 종료하는 화면출력
		} // quit 가 아닌 다른 값이 입력됬으면 일단 입력값을 정수형으로 변환하라
		else {

//													int intANum1 = Integer.valueOf(str); //Integer로 바꿧다가 int로 바꾸는 작업이 일어난다 (과거에 컴퓨터성능이 안좋을때는 영향이컸음)
			try {
				intNum2 = Integer.valueOf(strNum);
			if (intNum2 >= 0 && intNum2 <= 100) {
					System.out.println("입력된 정수 : " + intNum2);
				} else {
					System.out.println(intNum2 + "는 1 ~ 100까지를 벗어났어요!!");
				}

			} catch (NumberFormatException e) {
//				e.printStackTrace();
				System.out.println("정수만 입력하세요");
			}

			return intNum2;
		}

	}
}
