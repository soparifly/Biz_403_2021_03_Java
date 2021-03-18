package com.collar.var;

public class Varriable_07 {
	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
			
		
		//intNum = intNum + 1 
		//intSum = intSum + intNum
		intSum += ++intNum; //0+1
		intSum += ++intNum; //1+2
		intSum += ++intNum; //3+3
		intSum += ++intNum; //6+4
		intSum += ++intNum; //10+5
		intSum += ++intNum; //15+6
		intSum += ++intNum; //21+7
		intSum += ++intNum; //28+8
		
	 System.out.println(intSum);
		
	}
}
