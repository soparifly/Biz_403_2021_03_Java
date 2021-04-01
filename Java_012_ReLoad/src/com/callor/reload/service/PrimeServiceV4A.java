package com.callor.reload.service;

public class PrimeServiceV4A extends PrimeServiceV4 {

	@Override
	public void makeNums() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			int rndNum = rnd.nextInt(51) + 51;
			int index = 0;
			for (index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					break;

				}
			}
			// index <rndNum와 반대 , index >= rndNum
//				index ==rndNum 가능하지만 논리적인 문제로 사용안함

			if (index >= rndNum) {
				primeList.add(rndNum);
			}
		}
	}

}
