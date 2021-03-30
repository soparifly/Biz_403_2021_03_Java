package com.coller.classes;

public class Value_03 {

	public static void main(String[] args) {

		int num1 = getInt();
		Integer num2 = getInteger();

	}

	private static int getInt() {
		return 100; //method의 return type int형 일 경우
	}				 //리턴할 값이없을때 0을 리턴한다 . 

	private static Integer getInteger() {
		return 100;
		//mehtod의 return type이 Integer형일 경우
		//아직 return할 값이 정해지지않으면
	}// 리턴할 값이 없을때 null값을 리턴한다
}
