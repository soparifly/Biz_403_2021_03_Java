package com.callor.apps;

public class String_01 {
	public static void main(String[] args) {
		//	문자는 알파벳으로 읽히지만
		// 변수에저장될때는 정수형 ASCII 코드 값으로 저장된다
		// 그래서 정수와 사칙연산이가능하다
		char char1 = 'A';	// 문자를 저장하는 저장하는 변수
		// '';로 감싼다

		String str1 = "대한민국 만세"; // 문자열(문자들의 묶음)을 저장하는 변수
		// "";로 감싼다

		System.out.println(char1);
		System.out.printf("%d\n", (int) char1);
		System.out.println(char1 + 1);
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println((char) i);
		}
		//str1  변수에 담긴 문자열의 길이를 세어서
		//strLength 변수에 담아달라
		int strLength = str1.length();
		System.out.println(strLength);
		System.out.println(str1.length());
		System.out.println("Republic of Korea".length());
		str1 = "Republic of Korea";
		String str2 = str1.substring(5,6);

		//str1에 담긴 문자열에서
		//앞에서 부터 12번째 부터 앞에서 17번째까지
		//추출하여 str2에 저장하라
		str2 = str1.substring(12,17);
		System.out.println(str2);
		
		//str1 에 담긴 문자열을 한글자씩 잘라서출력하라
		for(int i = 0; i < str1.length();i++) {
			str2= str1.substring(i , i + 1);
			System.out.println(str2);
		}
		
		//str1에 담긴 문자열을 space (" ")를 기준으로
		// 잘라서 str3 배열에 저장하라
		String[] str3 = str1.split("");
		for(int i = 0; i<str3.length;i++) {
			System.out.println(str3[i]);
		}
		
		//str1에 담긴 문자열을 알파벳단위로 잘라서
		//배열로 만들어라
		 str3 = str1.split("");
		 for(int i =0; i <str3.length;i++) {
			 System.out.println(str3[i]);
		 }
		 
	}
}
