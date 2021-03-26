package com.callor.app;

import com.callor.apps.service.PrimeServiceV1;

public class App_03 {

	public static void main(String[] args) {

		PrimeServiceV1 psV1 = new PrimeServiceV1();
		PrimeServiceV1 psVA = new PrimeServiceV1();
		PrimeServiceV1 psVB = new PrimeServiceV1();
		//┌>객체가 다르면 똑가튼 메서드를 소환해도 서로 다른 명령이 실행된다
		psV1.makeNums();
		psVA.makeNums();
		psVB.makeNums();
		System.out.println("============================");
		System.out.println("psV1");
		System.out.println("----------------------------");
		psV1.printPrime();
		System.out.println("============================");
		System.out.println("psV1");
		System.out.println("----------------------------");
		psVA.printPrime();

	}
}
