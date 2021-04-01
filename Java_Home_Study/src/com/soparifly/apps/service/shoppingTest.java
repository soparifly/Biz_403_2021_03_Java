package com.soparifly.apps.service;

public class shoppingTest {
	public static void main(String[] args) {
		ShoppingDate list1 = new ShoppingDate();
		list1.orderNums = 201803120001L;
		list1.orderID = "abc123";
		list1.orderDate = "2018년 3월 12일";
		
			list1.orderName = "홍길";
		list1.orderNo = "PD0345-12";
		list1.Address = "서울시 영등포구 여의도동 20번";
		
		System.out.println(list1.orderID);
	System.out.println(list1.orderDate);
  	System.out.println(list1.orderNo);
	System.out.println(list1.Address);
		
	}
}
