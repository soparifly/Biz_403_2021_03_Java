package com.callor.method.service;

import java.util.Scanner;

/*
 * NumberServiceV5 클래스 선언
 * 2.inputNum(String title)method를 선언
 * 3.title 변수에 담긴 문자열을 연결하여 다음과같은 prompt를 보여준다
 * **값을 입력하세요 
 * >>
 * 
 * 
 * 4. NumberServiceV4 클래스의 inputNum()method를 참조하여
 * 5. 입력 오류에 대한 예외처리
 * 
 * 정수 0~100 범위의 유효성 검사를 수행하고 정수 return
 * 입력중 QUIT를 입력하면 null을 리턴함
 */
public class NumberServiceV5 {
//
//	Scanner scan;
//	NumberServiceV4 nsv4;
//	
//	public NumberServiceV5() {
//	
//		scan = new Scanner(System.in);
//		nsv4 = new NumberServiceV4();
//		
//	}
//	
//	
//	public String intputNum(String title) {
//		
//	 System.out.println(title + " 값을 입력하세요 \t" 
//			 + nsv4.inputNum());
//	 System.out.print(" >> ");
//	 
//		return title;	
//	}
//	

	public Integer IntputNum(String title) {
		Scanner scan = new Scanner(System.in);

		String strNum = "";
		Integer intNum = 0;
		System.out.println(" 0~ 100 정수 또는 QUIT 만 입력하세요");
		try {
			strNum = scan.nextLine();
			intNum = Integer.valueOf(strNum);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("숫자만 입력하세요!!");
		}
	
		if (strNum.equals("QUIT")) {
			
			return null;
		}
		return intNum;

	}

}
