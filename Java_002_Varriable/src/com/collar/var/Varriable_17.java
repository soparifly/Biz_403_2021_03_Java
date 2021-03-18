package com.collar.var;

public class Varriable_17 {

	public static void main(String[] args) {
		
		/*
		 * 변수를 어떤값으로 시작할까
		 * 변수 (저장된) 값이 어떻게 변화할까
		 * 변수가 변하는 값을 출력할때 무시되더라도 항상관심을 가지고봐야함
		 *  
		 */
		
		int num1 = 0;
		
		num1 = 100;
		num1 = 200;
		num1 = 300;
		
		
		
		num1++;
		++num1;
		 
		System.out.println(num1);
		
		num1 += 50;
		System.out.println(num1);
		
		
		//.1 num2+= 10 : num2 == 13저장
		// 2. num1에 13을 저장하라
		
		int num2 = 3;
		num1=(num2 += 10);
		 System.out.println(num1);
		 
	}
	
	
}
