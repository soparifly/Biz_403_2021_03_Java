package com.collar.var;

public class Varriable_13 {
	public static void main(String[] args) {
		int intNum = 0;
		int intSum = 0;
		
		// 1. intNum변수에 2를 추가할
		// 	intNum==2
				
		intSum += (intNum += 2);
		System.out.println(intSum);
		
		intSum += (intNum += 5);
		System.out.println(intSum);
		//??intsum
		
		intSum += (intNum += 2);
		System.out.println(intSum);
		//?
		
	
	}
}
