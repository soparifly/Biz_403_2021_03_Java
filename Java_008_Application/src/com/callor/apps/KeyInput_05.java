package com.callor.apps;

/*
 * 키보드를 통해서 정수 한개를 입력받습니다
 * 입력한 정수가 짝수 인가 판별하여 출력합니다
 * 입력한 정수가 Prime (소수인지)판별하여 출력합니다
 */
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int length = 30;
		int nums = 0;
		int nums1 = 0;

		System.out.println("정수를 입력하세요");
		LinesService.dLines(length);

		nums = num.nextInt();
		if (nums % 2 == 0) {
			System.out.printf("입력한 %d는 짝수입니다 \n", nums);
			System.out.printf("입력한 %d는 소수도 아닙니다", nums);
		} else {
			System.out.printf("입력한 %d는 짝수가 아닙니다");
		}
	}
}
