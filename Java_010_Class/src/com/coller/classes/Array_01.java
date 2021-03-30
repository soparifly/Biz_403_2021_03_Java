package com.coller.classes;

import java.util.Arrays;

/*
 * 배열
 * 다수의 변수를 묶어서 하나의 그룹처럼 다루는 방법
 *  몇개의 배열을 생성할 것인가를 먼저 결정하고
 *==> 배열을 사용할때 가장 큰 단점
 *
 * 각 배열의 첨자를 사용하여 위치를 정한후 값을 저장하거나 , 읽기를 할수 있다
 * 배열의 첨자는 절대 생성된 배열의 개수보다 큰값을 사용할수 없다
 * 생성된 배열을 다시 생성을 하면
 * 	이미 저장된 모든 값이 사라진다.
 */
public class Array_01 {

	public static void main(String[] args) {
		
		int[] intNums = new int[3];
		intNums[0] =10;
		intNums[1] =20;
		intNums[2] =30;
//		intNums[3] =40; 
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//		at Java_010_Class/com.coller.classes.Array_01.main(Array_01.java:20)
//		intNums 배열의 첨자는 항상 (크기 -1) 이내의 값만 사용할수 있다.
		for(int i =0; i < intNums.length ; i++) {
			System.out.print(intNums[i] +"\t ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------");
//		이미 값이 저장되어있는 배열의 크기를 변경하기위해 새로운 배열을 생성하면 이미저장된 모든 값이 초기화(clear) 되어버린다
//		배열의 크기를 코드 중간에 변경하는 경우는 거의 사용하지않는다
		
		intNums = new int[5];
		intNums[3]= 99;
		intNums[4]=	100;
		
		System.out.println(Arrays.toString(intNums)); //for문을 사용하지않고 배열의 리스트를 출력함
	}
}
