package com.callor.apps;

import java.util.Arrays;
import java.util.Random;

public class App_10 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intNums = new int[10];

		// for등을 사용하지않고
		// Array() 배열을 문자열로만드는 명령문
		// Debuging 코드
		// 코드가 진행되는 동안에
		// 변수, 배열등에 저장된 값을 확인하고 싶을때
		// 사용하는 코드
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(intNums.length);
		}
		String strView = Arrays.toString(intNums);
		System.out.println(strView);
		System.out.println(Arrays.toString(intNums));
		System.out.println("==========================");

//			/* 
//			 * for (i) : 0 ~ (배열개수-1)만큼 반복하라
//			 * for (j) : i값에 따라 반복횟수가 변동
//			 * 
//			 * i 	j
//			 * =================================================
//			 * 0	1
//			 * 1	2
//			 * 2	3
//			 * 3	4
//			 * 4	5
//			 * 5	6
//			 * :	:
//			 * 배열의 오름차순에 따른 정렬코드
//			 */
		for (int i = 0; i < intNums.length; i++) {
			for (int j = i + 1; j < intNums.length; j++) {
				if (intNums[i] > intNums[j]) {

					int temp = intNums[i];
					intNums[i] = intNums[j];
					intNums[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(intNums));
	}
}
