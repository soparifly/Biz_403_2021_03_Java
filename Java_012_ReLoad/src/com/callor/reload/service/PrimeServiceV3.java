package com.callor.reload.service;

public class PrimeServiceV3 extends PrimeServiceV1 {


	// for () 반복문이 중단되었느냐 break
	// 아니면 모두 수행했느냐
	public static void main(String[] args) {
		int rndNum = rnd.nextInt(51) + 50;

		int index = 0;
		// i라고 사할수 있으나 이런경우에는 의미있는 변수를 사용해주는게 좋다
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		if (index < rndNum) {
			System.out.println(rndNum + "는 소수가 아님");
		} else {
			System.out.println(rndNum + "는 소수임");
		}
	}
}
// for문이 끝났을때 break되었을때와 항상index <rndNum 그렇지 않는 경ㅇ두를 확인하여 코드진행
