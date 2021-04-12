package com.collor.classes;

import java.util.Scanner;

public class ScannerEx_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" >> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 :" + str);

		if (str .equals("END")) {
			System.out.println("안녕");
		} else {
			System.out.println("반가워!!!");
		}
		//문자열 비교를 할때는 절대 == 을 사용하지않는다
		//그래서 문자열을 담은 변수.equals(비교할문자열) 을 사용한다
		
	}
}
