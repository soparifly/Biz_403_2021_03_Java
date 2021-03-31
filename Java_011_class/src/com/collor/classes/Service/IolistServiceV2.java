package com.collor.classes.Service;

public class IolistServiceV2 extends IolistServiceV1 {

	/*
	 * V1의 intput method를 재정의한다
	 * 매입 단가 , 매출 단가 는 반드시 0이상 이어야 한다
	 * 유효성 하도록 코드를 재정의 한다.
	 */
	@Override
	public void input() {
		
	while (true) {

	public static Integer inprice() {
			
		int intputerror = scan.nextInt();
			if (intputerror == 0) {
				System.out.println("매출 단가는 0이상이여야 합니다");
				break;
			}
		}
		// TODO 매입 매출 등록
	}
	}

}
