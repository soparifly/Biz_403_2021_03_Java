package com.callor.apps;

import java.util.Random;

public class App_03 {
	public static void main(String[] args) {

		Random rnd = new Random(); // 랜덤 임포트
		
		int numsLength = 20; // 길이 20 변수를만듬
	
		int[] intNums = new int[numsLength]; // 배열의 길이를 20이 지정된 변수로 지정함
		// 반복문을 이용하여 1~ 100까지의 난수를 만듬

		for (int i = 0; i < intNums.length; i++) { // for 문의 실행조건은 intNum.저장된 배열길이만큼 반복함
			intNums[i] = rnd.nextInt(100) + 1; // intNum[i] i의 수만큼 난수를 만들어 저장함
		}
		//요소 : 배열의 몇번째 값
		//위치 : 배열의 몇번째
		//첨자 : 배열의 몇번째인가를 알려주는값
		
		for (int i = 0; i <intNums.length; i++) {
			if(intNums[i]%2 == 0) {
			//	System.out.println(i);
			
				System.out.printf("%d 번째 값: %d\n",i,intNums[i]);
			}
		}

	}

}
