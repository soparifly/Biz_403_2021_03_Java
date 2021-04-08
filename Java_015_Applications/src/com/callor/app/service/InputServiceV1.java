package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan;
	String enter1;
	Integer num;

	public InputServiceV1() {
		scan = new Scanner(System.in);

	}

	public Integer inputValue(String title) {
		while (true) {
			System.out.println(title + "값을 입력하세요");

			enter1 = scan.nextLine();
			try {
				num = Integer.valueOf(enter1);
			} catch (NumberFormatException e) {
//			e.printStackTrace();
				System.out.println("정수 값을 입력하세요");
				continue;
			}
			if (enter1.equals("QUIT")) {
				System.out.println("종료");
				return null;
			}
			return num;
		} // while end
	}// inputvalue1 end

	public Integer inputValue(String title, int start) {
		System.out.printf("%d 값을 입력하세요 (%d )이상 ", title, start);
		Integer retNum = this.inputValue(title);
		
		if (retNum == null) {
			return null;
		} else {
			if (retNum > start) {
			System.out.printf("");
			}
		}
			
		enter1 = scan.nextLine();
		num = Integer.valueOf(enter1);
		if (enter1.equals("QUIT")) {
			System.out.println("종료");
			return null;
		}
		return num;
	}

}
