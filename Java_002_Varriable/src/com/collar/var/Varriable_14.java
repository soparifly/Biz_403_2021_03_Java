package com.collar.var;

public class Varriable_14 {
	public static void main(String[] args) {
		
		int intSum = 0;
		
		int intNum = 0;
		
		intSum += (intNum += 2);
		intSum += (intNum += 5);
		intSum += (intNum += 2);
		
		System.out.printf("Sum :%d, Num : %d" , 
							intSum, intNum);
		
				
		
	}
}
