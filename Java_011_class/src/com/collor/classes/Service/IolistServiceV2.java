package com.collor.classes.Service;

import com.collor.classes.model.IolistVO;

public class IolistServiceV2 extends IolistServiceV1 {

	/*
	 * V1의 intput method를 재정의한다 매입 단가 , 매출 단가 는 반드시 0이상 이어야 한다 유효성 하도록 코드를 재정의 한다.
	 */
//	@Override
	public void input() {
		System.out.println("=========================================");
		System.out.println("매입 매출 등록");
		System.out.println("---------------------------------------");

		System.out.println("상품명 >> ");
		String pname = scan.next();

		System.out.print("거래일자(yyyy--mm--dd >> ");
		String date = scan.next();
		System.out.print("거래처명 >>");
		String dname = scan.next();
		System.out.print("매입매출 구분 >>");
		String inout = scan.next();
		System.out.print("수량 >>");
		Integer qty = scan.nextInt();
	//매입단가가 0이상이면 다음 항목을 입력받도록
		// while()문을 중단하고
		// 매입단가가 0미만이라면 계속해서 반복문 내에서 입력을 받도록 해야한다.
		Integer iprice = 0;
		while(true) {
			System.out.print("매입단가 >> ");
			iprice = scan.nextInt();
			if (iprice < -1) {
				System.out.println("매입단가는 반드시 0원 이상이여야합니다");
			continue;
			}
				break;
			}

		Integer oprice = 0;
		while(true) {
			System.out.print("매출단가 >>");
			oprice = scan.nextInt();
			if (oprice < -1) {
				System.out.println("매입단가는 반드시 0원 이상이여야합니다");
			} else {
				break;
			}
		}

		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(inout);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);
		iolistVO.setQty(qty);
		// iolistVO에 저장한 데이터를 확인하기
		this.printIolist(iolistVO);
		// 입력된 매입매출 데이터를 데이터리스트에 담기
		ioList.add(iolistVO);
	
	}
	
}