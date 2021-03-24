package com.callor.apps;

import java.util.Random;

public class App_05 {
public static void main(String[] args) {
	Random rnd = new Random();
	int numsLength = 50 ; 
	int[] intNums=new int[numsLength];
	
	for(int i =0 ; i <intNums.length; i++) {
		intNums[i]=rnd.nextInt(100)+1;
		}
	for(int i =0; i <intNums.length; i++) {
		System.out.print(intNums[i]+"\t");  //리스트를 한줄에 출력함
		
		//5번째 요소를 출력한후 Enter를 눌러서 다음요소에서 줄바꿈
		if( (i+1)% 5 ==0 ) {
			 System.out.println();}
		}
}
}
