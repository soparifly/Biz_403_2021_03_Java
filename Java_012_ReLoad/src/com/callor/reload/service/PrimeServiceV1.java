package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {
	protected static Random rnd;
	protected int rndnum1;

	public PrimeServiceV1() {
		rnd = new Random();

	}

	public void makenum() {
		rndnum1 = rnd.nextInt(51) + 50;

		boolean notPrime = false;

		/*
		 * for()반복문이 실행되거나 끝나는 경우 비교문 i < rndnum ture인 동안만 반복하라 for() 반복문이 종료되면 i값은
		 * 얼마인가여? i값이 조건문에 만족하면 {}내의 코드를 실행한다 실행한후 i++ 실행한다 i가 9가 되었을때 {}을 실행하면 다시
		 * 한번I++를 실행한다 때문에 for()반복문이 중단되지않고 모두 정상수행이되면 i값은 rndnum값과 같아진다 ; i == rndnum인데
		 * i < rndnum 냐고 묻는것 만약 for문이 중간에 break를 만나면 i값은 항상 rndnum보다 작다 한버닝라도 rndNum을
		 * i값으로 나머지 연산을 했을때 한번이라도 o이나오면 그수는 소수가 아니다 그렇다면 그이후에는 연산을 할필요가 없기때문에 break를 걸어서
		 * 건너뛴다
		 */
		for (int i = 2; i < rndnum1; i++) {
			if (rndnum1 % i == 0) {
				notPrime = true;
			}
			break;

		}
		if (notPrime == true) {
			System.out.println(rndnum1 + "소수가 아님");

		} else {
			System.out.println(rndnum1 + "소수임");

		}

	}
}