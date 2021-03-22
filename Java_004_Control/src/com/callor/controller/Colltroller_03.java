package com.callor.controller;

public class Colltroller_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum1 = 30;
		int intNum2 = 40;

		// intNum1 이 20보다 크고 , 50보다 작냐?
		// 50 > intNum1 > 20 (X) 파이썬을 제외한 다른 프로그램에서는 사용할수없음

		boolean bYes = intNum1 > 30 && intNum1 < 50;
		bYes = intNum1 > 20 || intNum1 > 50;

		bYes = 50 > 20 && 20 > 50;

	}
}
