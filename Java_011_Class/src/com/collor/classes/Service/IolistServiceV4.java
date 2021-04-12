package com.collor.classes.Service;

import com.collor.classes.model.IolistVO;

public class IolistServiceV4 extends IolistServiceV1 {

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("=========================================");
		System.out.println("매입 매출 등록");
		System.out.println("---------------------------------------");

		String pname = null;
		while (true) {

			System.out.println("상품명(QUIT:입력중단) >> ");
			pname = scan.nextLine();
			if (pname.equals("QUIT")) {
				return;
			} else if (pname.equals("")) {
				System.out.println("상품 명은 반드시 입력하세요");
				continue; // 상품명을 입력하지 않으면 while문이 반복됨
			}
			break;
		}

		System.out.print("거래일자(yyyy--mm--dd >> ");
		String date = scan.next();
		System.out.print("거래처명 >>");
		String dname = scan.next();
		System.out.print("매입매출 구분 >>");
		String inout = scan.next();
		System.out.print("수량 >>");
		Integer qty = scan.nextInt();

		Integer iprice = this.inputPrice("매입");
		if (iprice == null) {
			return;
		}
		Integer oprice = this.inputPrice("매출");
		if (oprice == null) {
			return;
		}

		IolistVO vo = new IolistVO();
		vo.setPname(pname);
		vo.setDate(date);
		vo.setDname(dname);
		vo.setQty(qty);
		vo.setIprice(iprice);
		vo.setOprice(oprice);
		ioList.add(vo);

	}

	private Integer inputPrice(String title) {
		while (true) {

			System.out.println(title + "단가를 입력하세요");
			System.out.println(title + "단가는 0이상 입력하세요");
			System.out.println("-1 을 입력하면 입력 중단");

			System.out.print(title + "단가 >> ");
			Integer price = scan.nextInt();
			if (price < -1) {
				return null;
			} else if (price < 0) {
				System.out.println(title + "단가는 0이상 입력하세요");
			} else {
				return price;
			}
		}
	}

}
