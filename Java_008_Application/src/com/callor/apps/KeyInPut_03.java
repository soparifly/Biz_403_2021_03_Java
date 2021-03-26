package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInPut_03 {

	public static void main(String[] args) {

		Scanner intNums = new Scanner(System.in);

		System.out.println("두가지 수로 4칙연산 수행하기");
		System.out.println(LinesService.dLines(30));
		System.out.print("첫번째 수 입력 >>");
		int nums1 = intNums.nextInt();

		System.out.print("두번째 수 입력 >>");
		int nums2 = intNums.nextInt();
		
		int  lineLength= 30;
		System.out.println(LinesService.dLines(lineLength));
		System.out.printf("%d + %d = %d \n", nums1, nums2, nums1 + nums2);
		System.out.println(LinesService.sLines(lineLength));
		System.out.printf("%d x %d = %d \n", nums1, nums2, nums1 * nums2);
		System.out.println(LinesService.sLines(lineLength));
		System.out.printf("%d - %d = %d \n", nums1, nums2, nums1 - nums2);
		System.out.println(LinesService.sLines(lineLength));
		System.out.printf("%d / %d = %3.2f \n", nums1, nums2, (float)nums1 / nums2);
		System.out.println(LinesService.sLines(lineLength));
		System.out.println(nums1 +" % " + nums2 + " = " + (nums1 % nums2));
		System.out.println(LinesService.dLines(lineLength));
	}
}
