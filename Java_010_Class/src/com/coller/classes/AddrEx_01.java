package com.coller.classes;

import com.coller.classes.model.AddressVO;

public class AddrEx_01 {

	
	
	
	
	public static void main(String[] args) {
		AddressVO aVO = new AddressVO();
		aVO.setName("홍길동");
		aVO.setAddr("서울식");
		aVO.setTel("010-000-9999");
		aVO.setAge(200);
		System.out.println(aVO.getname() + "의 나이는? : " + aVO.getAge());
	}
}
