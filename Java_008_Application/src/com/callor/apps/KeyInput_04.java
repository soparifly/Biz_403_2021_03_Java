package com.callor.apps;
/*
 * 1. 정수형 배열 5개를 생성
 * 2. 키보드를 통해서 정수 5개를 입력받아 배열에 저장
 * 3. 배열에 입력된 정수들의 리스트와 합을 계산하여 출력
 * 4. 입력 Prompt와 출력문의 UI를 만들어서 출력
 */

import java.util.Arrays;
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {

		Scanner enter1 = new Scanner(System.in);
		int lineLength = 30;
		int numsLength = 5;
		int[] nums = new int[numsLength];
		System.out.println("5가지 정수를 입력하세요 ");
		System.out.println(LinesService.dLines(lineLength));

		for (int i = 0; i < nums.length; i++) {
			int num = i + 1;
			System.out.printf("정수%d번 >> \n",num);
			nums[i]=enter1.nextInt();
		
		}
		System.out.println(LinesService.dLines(40));
		System.out.println("입력한 숫자들");
		
		System.out.println(Arrays.toString(nums));
		
		int intSum = 0;
		for(int i =0; i <nums.length; i ++) {
			intSum += nums[i];
		}
		System.out.println("리스트 합계 :  "
				+ intSum);
	}
}
