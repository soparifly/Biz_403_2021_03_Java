package com.callor.app;


import com.callor.apps.service.PrimeServiceV1;

public class App_02 {
	
	public static void main(String[] args) {
		

		//PrimeServiceV1 클래스를 사용하여
		//psV1 객체를 선언하고
		// 						생성하여
		//						인스턴스 변수로 만들었다.
		// new PrimeServiceV1 
		//		PrimeServiceV1클래스에 있는 생성자 method를 호출(실행)하여
		// 		psV1객체를 사용할수 있도록 생성, 초기화 준비 하여 달라. 
		PrimeServiceV1 psV1 = new PrimeServiceV1();
		
		//랜덤클래스를 이용해서 rnd라는 객체를 선언하고 랜덤생성자 메서드를 호출해서 rnd를 인스턴스로 만들어줌 
		// void가 없기때문에 항상 new를 붙여줘야함
		
		psV1.makeNums();
		psV1.printPrime();
		
		PrimeServiceV1 psV11 = new PrimeServiceV1();
		psV1.makeNums();
		psV1.printPrime();
		
		int num1 = 30;
		int num2 = 40;
		
		num1 = 50;
		num1 = 60;
		num1 = 0;
		
		System.out.println(num2);
	
	
	}
}
