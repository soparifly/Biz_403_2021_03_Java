package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {
//continue; //명령어는 반드시 while문이나 for문이잇어야함
	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("0~ 100까지 정수입력");
			System.out.println("QUIT 입력 중단");
			System.out.print(" >> ");

			String strInput = scan.nextLine();
			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {
				// 1. 입력된값이 QUIT가 아니면 일단 정수로 바꿈
				try {
					Integer intNum = Integer.valueOf(strInput);

					// 2. 정수이면 0~ 100까지 인지알아봄
					if (intNum < 0 || intNum > 100) {
						System.out.println("범위를 벗어남 0~ 100까지만입력");
						// 다시입력하는 곳으로 가라
						continue;
					}
					return intNum;
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
//				e.printStackTrace();
					System.out.println("값은 숫자만입력하세요");
					// 다시 입력하는 곳으로 가라
					continue;
				}
			}
		}

//		return null;
	}
}
