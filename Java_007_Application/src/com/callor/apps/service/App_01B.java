package com.callor.apps.service;

import java.util.Random;

public class App_01B {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intNums = new int[20]; // 배열을 20까지 지정함

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(51) + 50; // 50~ 100까지 난수를 지정함

		}

		for (int arr = 0; arr < intNums.length; arr++) {
			int num = 0; 	//num변수를 만들듦
			int numP = intNums[arr]; //배열을 변수로 지정함
			for (num = 2; num < numP; num++) { //num=2 부터 intNums의 배열까지를 서로 나누었을때 0 이면 멈춘다 반복문을만듬
				if (numP % num == 0) {
					break;
				}
			}
			if (num < numP) { //num가 배열의 수보다 작을때 소수가인지 소수가 아닌지를 출력함
				System.out.println(numP + "는 소수가 아님");
			} else {
				System.out.println(numP + "는 소수");
			}
		}
	}
}