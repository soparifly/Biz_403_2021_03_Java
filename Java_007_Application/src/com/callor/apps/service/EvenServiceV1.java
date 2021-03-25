package com.callor.apps.service;

import java.util.Random;

//클래스를 시작하는곳
public class EvenServiceV1 {
	// 아래와 동일함 int[] intNums1 = new int[100];
	int[] intNums; //여기서 선언만한다
	
	
	
	//생성자 method
	//클래스를 선언하면
	//자동으로만들어진 method
	//별도의 코드가 피룡없으면 만들지않아도 된다
	 //newEventService()코드 에서 호출되는 method
	
	// 			┌> 생성자 method에는 클래스 영역의 변수들을 초기화 생성하기 위한 코드들이 작성된다
	public EvenServiceV1() {
		intNums = new int[100]; //생성은 생선자코드안에서
	}

	public void makeNums() {
		//rnd 라는 랜덤객체를 만들고쓸수잇게 예약함
		Random rnd = new Random();
		
		//int Nums 배열의 갯수만큼 코드를 반복실행하라
		for(int i =0 ; i <intNums.length ; i++) {
			//intNums. i 번째 위치에  1~100까지의 숫자를 저장하라
			intNums[i] =rnd.nextInt(100) + 1;
			
		}
	}
	
	/*
	 * 짝수 Even 홀스 Odd 
	 */
	public void printEven() {
		int nCount =0;
		System.out.println("=====================================");
		System.out.println("짝수들의 리스트");
		System.out.println("---------------------------------");
		//배열전체를 뒤져서 짝수가 있으면 찾아서 출력하라
		for (int i = 0; i <intNums.length; i++){
			 if(intNums[i] % 2 ==0) {
				 System.out.println(intNums[i]);
				 nCount++;
			 }
		}
		System.out.println("짝수들의 개수:"+ nCount);
		System.out.println("============================");
	}
	public void sumEven() {
		int intSum = 0;
		for(int i =0; i <intNums.length; i++) {
			if(intNums[i]% 2 ==0) {
				intSum += intNums[i];
				
			}
		}
			System.out.println("================================ ");
			System.out.println("총합 :" +intSum);
			
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// intNums의 배열을 선언함
//	Random rnd = new Random(); // 난수 임포트
//
//	public EvenServiceV1() { // 퍼블릭 클래스를 선언함
//		intNums = new int[100]; // intNums 배열을 100개 지정함
//	}
//
//	public void makeNums() {
//		for (int i = 0; i < intNums.length; i++) {
//			if (intNums[i] % 2 == 0) {
//				System.out.println(intNums[i]);
//			}
//		}
//	}
//
//	public void intSum() {
//
//		int intSum = 0;
//		for (int i = 0; i < intNums.length; i++) {
//			if (intNums[i] % 2 == 0) {
//				intSum += intNums[i];
//
//				System.out.println("합계" + intSum);
//				
//			}
//		}
//	}
//}
