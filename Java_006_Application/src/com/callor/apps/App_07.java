package com.callor.apps;

import java.util.Random;

/*
	 * 7, 2, 4, 3, 1 이런값이 저장되어 있을때
	 * 1, 2, 3, 4, 7 과 같이 정렬(Sort)하고자할때
	 * 최초7, 2, 4, 3, 1일때
	 * 0번 요소(7), 1번(2) 두 값을 크기비교 하여
	 * 0번에 2를 저장, 1에 7을 저장하여 자리를 바꿈
	 * 2,7,4,3,1 로 만듦
	 * 0번 요소(2),2(4) 두 값을 비교
	 * 4가 더 큰값이므로 그냥둔다
	 * 2,7.4.3.1 
	 * 0번요소 (2), 3번요소(3) 두값을 크기 비교
	 * 마찬가지로 3이 더크기때문에 그냥둔다
	 * 0번요소(2)와 4번요소(1) 두값을 크기비교
	 * 2가 더 큰값이므로 자리바꿈함
	 * 1,7,4,3,2 로 만듦
	 * 
	 * 1번 요소(7), 2번요소 (4)를 비교
	 * 7이 더 큰값이므로 
	 * 1,4,7,3,2 로 만듦
	 * 1번요소 (4), 3번요소 (3)을 비교
	 * 4이 더 큰값이므로
	 * 1, 3, 7,4 ,2 로 만듦
	 * 
	 * 1번요소 (3), 4번요소 (2) 두값을 비교
	 * 3이 더 큰값이므로 1,2,7,4,3 로 만듦
	 * 2번 요소 (7), 3번 요소 (4) 두값을 크기비교
	 * 7이 더 큰값이므로 
	 * 1,2,4.7.3 로 만듦
	 * 2번 요소 4, 5번요소 (3) 두값을 크기비교
	 * 4가 더 큰값이므로
	 * 1,2,3,7,4 로 만듬
	 * 3번요소7 과 4번요소 4의 크기비교
	 * 1,2,3,4,7
	 * 
	 */

public class App_07 {
public static void main(String[] args) {
	Random rnd = new Random();
	int[] intNums = new int[5];
	for (int i = 0; i < intNums.length ;i++) {
		intNums[i]=rnd.nextInt(100)+1; 
	}
		System.out.println("==========================="
				);
		System.out.println("오름차순 정렬");
		System.out.println("-------------------------");
/*
 * intNums[0]에 저장된 값과
 * intNums[1]에 저장된 값을 교환
 * 
 */
		int t = intNums[0];
		intNums[0]= intNums[1];
		intNums[1] = t;
//두 변수의 값을 서로 바꾸려면
		int num1 = 30;
		int num2 = 40;
		System.out.println(num1);
		System.out.println(num2);
		int temp =num1;
		num1 = num2;
		//제 3의 임시 저장소 변수가 필요하다
		num2 = temp;
		System.out.println(num1);
		System.out.println(num2);
}
}
