package com.callor.apps.service;

import java.util.Random;

public class EvenServiceV2 extends EvenServiceV1 {
	/*
	 * 자바프로그래밍에서 상속 V2 클래스에서는 V1클래스를 상속했다 V1에서 작성한 (선언한)변수. method코드를 그대로 이어받아서
	 * 사용하겠다
	 */
	public EvenServiceV2() {
		intNums = new int[100];

	}

	public void printEven() {
		int nCount = 0;
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 2 == 0) {
				System.out.printf("%4d", intNums[i]);
				nCount++;
				if (nCount % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
	}
}
