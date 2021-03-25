package com.callor.apps.service;

import java.util.Random;
/*
 * 자바프로그래밍에서 상속
 * V2클래스에서 V1클래스를 상속했다
 * 
 * V1에서 작성한(선언한)변수, method코드를 그대로 이어받아서 사용하겠다
 * V1에 작성된 method들의 코드를 그대로 사용하면서 일부 method의 코드를 변경, 확장, 기능 개선을 하여 내프로젝트르 적용하겠다.
 */
public class PrimeServiceV2 {

	int[] intNum;

	public PrimeServiceV2() {
		intNum = new int[20];
	}

	public void makeNums() {
		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(51) + 50;
		}
	}

	public void printPrime() {

		for (int num : intNum) {

			int index = 0;
			
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			}
			// 중간에 break를 만났다.
			//(index==num) 을 사용할수있지만 아래와같이사용해줌으로써 논리적인 오류를 막을수 있다.
			
			if (index >= num) {
				System.out.println(num + "는 소수");
			}

		}

	}
}