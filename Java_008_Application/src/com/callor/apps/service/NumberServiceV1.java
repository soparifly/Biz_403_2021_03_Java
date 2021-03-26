package com.callor.apps.service;

import java.util.Scanner;

public class NumberServiceV1 {

	int intNum = 0;
	Scanner scan;
	public NumberServiceV1() {
		scan = new Scanner(System.in);
	}
	public void inputNum() {

		System.out.println("정수 1개를 입력합니다");
		System.out.print(">>");
		intNum = scan.nextInt();

		// main() 메서드가 아닌곳에서
		// Scanner 사용하는 경우 사용이 끝나면 close를 하여 닫아주는게 좋다
		// 이제 Scanner 사용이 끝났으니
		// Resource(자원)을 반납하겠다 //다른 어플리케이션을 사용할경우 충돌이 일어날수 있기때문이다.

	}

	public void chechkEven() {

		System.out.println(LinesService.dLines(50));
		if (intNum % 2 == 0) {
			System.out.printf("입력한 정수 %d는 짝수\n",intNum);
		} else {
			System.out.printf("입력한 정수 %d는 짝수가 아님\n",intNum);
		}

	}

	public void checkPrime() {
		System.out.println(LinesService.dLines(50));
		int num = 0;
		for (num = 2; num < intNum; num++) {
			if (intNum % num == 0) {
				break;
			}
			if (num < intNum) {
				System.out.printf("입력한 정수 %d는 소수가아님 \n",intNum);
			} else {
				System.out.printf("입력한 정수 %d는 소수\n",intNum);
			}
		}
	}
}