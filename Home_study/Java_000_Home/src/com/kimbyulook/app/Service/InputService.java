package com.kimbyulook.app.Service;

import java.util.Scanner;

public class InputService {
	protected Scanner scan;

	public InputService() {
		scan = new Scanner(System.in);
	}

	public Integer InputValue(String title, int start, int end) {
		// title 변수 값을 title ( start ~ end ) 문자열로 다시생성하는 명령어
		title = String.format("%s (%d ~ %d", title, start, end);
		while (true) {

			Integer retNum = this.InputValue(title);
			if (retNum == null) {
				return null;
			} else if (retNum < start || retNum > end) {
				System.out.printf("입력값은 %d~ %d" + "범위 이여야합니다\n", start, end);
				continue;
			}
			return retNum;
		}
	}

	/*
	 * String title 매개변수를 받고 정수값이나 quit 가 입력되는지 확인을 하고 잘못입력된 값이 있으면 다시 입력받도록 하는 메서드
	 * 
	 *
	 */
	public Integer InputValue(String title, int start) {
		String msgTitle = String.format("%s( %d이상의 )", title, start);
		while (true) {
			Integer intNum = this.InputValue(msgTitle);
			if (intNum != null) {
				if (intNum < start) {
					System.out.printf("입력값은 %d이상이어야 합니다\n", start);
					continue;
				}
			}

			return intNum;
		}
	}

	public Integer InputValue(String title) {

		while (true) {

			System.out.println(title + " 값을 입력하세요");
			System.out.print(" >>   ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				return null; // break사용가능
			}
			Integer num = null;
			try {
				num = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
//			e.printStackTrace();
				System.out.println("정수나 QUIT값을 입력하세요");
				continue;
			}
			return num;
		} // while end
	}
}
