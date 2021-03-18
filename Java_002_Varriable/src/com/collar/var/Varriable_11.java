package com.collar.var;

public class Varriable_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 100000;
		int intSum = 0;  //결과를 저장할 변수를 생성
		intNum = 1; //시작값을 1로지정함 
		System.out.println("=========================");
		System.out.printf("intNum : %d, intsum : %d\n",intNum, intSum);
		intSum = intSum + intNum ;
		System.out.printf("intNum : %d, intsum : %d\n",++intNum, intSum);
		System.out.printf("intNum : %d, intsum : %d\n",++intNum, intSum);
		System.out.printf("intNum : %d, intsum : %d\n",++intNum, intSum);
		
		intNum = intNum+ 1;
		intSum = intSum + intNum;
		System.out.printf("intNum : %d, intSum :%d",intNum,intSum);
		

	}
				
	}
