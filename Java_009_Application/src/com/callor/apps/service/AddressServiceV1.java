package com.callor.apps.service;

import com.callor.apps.model.AddressVO;

public class AddressServiceV1 {

	
	
	public void  printAddress(String name, String email, String phone) {  //매개변수
		/*
		 * name, email, phone 3개의 매개변수를 통해
		 * 문자열을 전달 받고
		 * 전달받은 문자열을 Console에 출력하기
		 * 
		 */
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		
		
	}
	//AddressVO클래스를 매개변수로받는 클래스
		public void printAddress(AddressVO adVO) {
			System.out.println(adVO.name);
			System.out.println(adVO.email);
			System.out.println(adVO.chain);
			System.out.println(adVO.address);
			System.out.println(adVO.cellPhone);
		}
}
