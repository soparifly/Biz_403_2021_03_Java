package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV2 {
	protected Scanner scan;

	public InputServiceV2() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title, int start) {
		String msgTitle = String.format("%s (%d이상의 )", title, start);

		while (true) {
			Integer intNum = this.inputValue(msgTitle);

			if (intNum != null) {

				if (intNum < start) {

					System.out.printf("입력값은 %d 이상이어야 합니다\n ", start);
					continue;

				}

			}
			return null;
		}
	}
	/*
	 * 정수 범위에 대한 유효성검사를 수행하는 method 이미 만들어진 iputValue(String title)method와 연동하여
	 * 사용하겠다.
	 */
	/*
	 * <전통적(구조적)인 프로그래밍 기법
	 * 
	 * 한클래스 내에 같은 이름의 메소드는 원칙적으로 중복하여 작성할 수 없다. 그러나,
	 * 
	 * 호출시 intputValue1("새우깡"; inputValue("새우깡"); inputValue("새우깡",100);
	 * inputValue("새우깡",100 , 1000); //매개변수 오류 발생
	 * 
	 * 객체.inputValue ("새우깡",100); // 자동으로 2번 메소드가 연결, 호출함 객체. inputValue (100,
	 * "새우깡 ") //매개변수 오류남
	 * 
	 * public Integer inputValue 1(String title); public Integer inputValue
	 * 2(String, int start); public Integer inputValue 3(String, int start, int
	 * end);
	 * 
	 * 
	 * 객체 지향 개발방법에서는
	 * 
	 * 매개변수의 다르거나, 타입, 순서가 다르면 같은 이름의 메소드를 중복하여 작성할 수 있다.
	 * 
	 * 
	 * 
	 */

	public Integer inputValue(String title, int start, int end) {

		// 유효성 검사를 수행하겠다는 메시지를 미리 작성한다

		String msgTitle = String.format("%s (%d ~ %d 범위의)", title, start, end);

		while (true) {
			// this.inputValue(String title) 메소드가
			// return 해준 값이 null이 아니면 유효성 검사 수행

			Integer intNum = this.inputValue(msgTitle);
			// this. inputValue(String title)mehtod가
			// return 해준 값이 null 이 아니면 유효성검사수행

			if (intNum != null) {

				if (intNum < start || intNum > end) {
					// 메시지를 보여주고
					System.out.printf("입력값은 %d ~ %d 까지 입력하세요\n ", start, end);
					// 다시 inputvalue(String title)을 호출하여 입력받아라
					continue;
				}
			}
			// intputValue(String title)이 null을 return했거나 유효한 범위의 점수를 return 했으면
			// 그 값이 담겨있다.그 값을 return하라.
			return intNum;
		}
	}

	public Integer inputValue(String title) {
		/*
		 * exception이 발생했을때 사용자에게 안내 메시지를 보여주고 다시 입력 받을수 있도록 하기위한 선 조치
		 */
		while (true) {
			System.out.println(title + " 값을 입력하세요(QUIT)");
			
			System.out.println(">>");
			
			String strInput = scan.nextLine();
			
			if (strInput.equals("QUIT")) {
				
				return null;
				
			} // if 조건문이 종료됨 이후에는 false일경우 실행됨 굳이 else를 사용하지 않아도됨
			Integer intNum = null;
			
			try {
				intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("입력 값 오류!!");
				System.out.println("정수나 QUIT 문자열만 입력합니다");
				continue;
			}
			return intNum;
			// try - catch block의 코드가 정상적으로 완료되었을때
			// 실행하는 부분 입력한 값이 정상적변수 데이터로 변환되어 intNum변수에 담겨있다.

		}
	}
}
