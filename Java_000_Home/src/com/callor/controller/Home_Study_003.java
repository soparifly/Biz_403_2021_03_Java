package com.callor.controller;

public class Home_Study_003 {

	public static void main(String[] args) {

		// intNum에 짝수를 대입하고 합을 구하라
		int intNum = 0;
		int intSum = 0;
		intNum += 2;
		intNum += (intSum += 2); //   2 + (0 + 2) = 4
		intNum += (intSum += 2); //   4 + (2 + 2) = 8
		intNum += (intSum += 2); //   8 + (4 + 2) = 14
 		intNum += (intSum += 2); //   14 +(6 + 2) = 22
 		intNum += (intSum += 2); //   22 + (8 + 10) =32
 		
		//2,4,6,8,10
		System.out.println(intNum);
		
		

	}
}