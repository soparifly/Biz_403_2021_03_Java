package com.collar.var;

public class Varriable_12 {
	public static void main(String[] args) {
		
		int intSum= 0;
		int intNum= 0;
		
		intNum+=100;
		System.out.println(intNum); //100
		intNum+= 33;
		System.out.println(intNum); //133
		
		intSum += intNum; // 133+ 133
		intSum += intNum; // 133 + 133 +133
		intSum += intNum; //133 + 133 + 133 +133
	
		
		intSum = 0;
		intSum = intSum +1 +2 +3 +4 +5;
		
		intSum = 0;
		intSum = intSum + 1; //A
		intSum = intSum + 2; //B
		intSum = intSum + 3;
		intSum = intSum + 4;
		intSum = intSum + 5;
		
		intSum = 0;
		intNum = 1;
		intSum = intSum+intNum; //A와 같은 코드
		intSum = intSum + (intNum + 1); //B
		intSum = intSum + (++intNum); //C와
	}
}