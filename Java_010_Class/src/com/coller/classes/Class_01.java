package com.coller.classes;

import java.util.Arrays;
import java.util.Random;

/*
 * 1. 랜덤클래스를 이용하여 50~100까지 중 난수 1개를 생성한다
 * 2.2~난수-1까지 수 중에서 생성된 난수의 약수들을 찾아 배열에 저장한다
 * #난수의 약수 = 난수 % i ==0 인 값
 * 3. 배열에 저장된 리스트를 출력한다.
 *
 */
public class Class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();

		int randomnums = rnd.nextInt(51) + 50; // 난수 만듬

//		int[] num = new int[randomnums]; //난수의 수만큼 배열을 만듬
		System.out.println("생성된 난수 : " + randomnums);
		
		int nCount = 0;

		//int[] nums = new int[]; // 배열을 nums의 갯수만큼
		// i 값이 0에서 시작하여 1 씩 증가하면서 100 미만일경우.
		// i 값은 0~99(100-1)
		// i값은 2~ (randomnums-1)까지 연속으로 생성
		// randomnum의 약수가 몇개인가 구하기

		for (int i = 2; i < randomnums; i++) {

			if (randomnums % i == 0) {
				nCount++;
			}
		}
																	// nCount값을 1씩증가시키면서 약수인지 확인한다
		System.out.println("약수의 개수 : " + nCount);
																	// 약수의 갯수만큼 배열을 만듬
		int[] divisor = new int[nCount];

		
		
		int index = 0;
																	// 2~ 난수의 -1 만큼 반복함

		for (int i = 2; i < randomnums; i++) {
			if (randomnums % i == 0) {
				divisor[index++] = i;
			}
		}
		System.out.println(Arrays.toString(divisor));
	}
}
