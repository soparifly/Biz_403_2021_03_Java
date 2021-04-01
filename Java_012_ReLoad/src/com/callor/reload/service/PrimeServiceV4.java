package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;

public class PrimeServiceV4 extends PrimeServiceV1 {

	int[] rndNum;
	List<Integer> primeList;

	public PrimeServiceV4() {

		rndNum = new int[50];

		primeList = new ArrayList<Integer>();

	}

	public void makeNums() {
		System.out.println("난수 목록 ");
		for (int i = 0; i < rndNum.length; i++) {
			rndNum[i] = rnd.nextInt(51) + 50;
			System.out.print(rndNum[i] + "\t");
		}

		boolean notPrime = false;
		for (int i = 2; i < rndNum.length; i++) {

			int index = 0;
			for (index = 2; index < rndNum[i]; index++) {
				if (rndNum[i] % index == 0) {
					notPrime = true;
					break;
				}
				if (!notPrime) {
					primeList.add(rndNum[i]);

				}
			} // end prime Num;
		}
	}

	public void printPrime() {
		// 배열, List구조의 데이터들을
		// 전체를 반복하여 읽기 처리할경우
		for (Integer prime : primeList) {
			System.out.println(prime);
		}
	}

//	public void printNum() {
//		for (int i = 0; i < primeList.size(); i++) {
//			System.out.println("소수 목록 " + primeList.get(i));
//		}
//		
//	}
}
