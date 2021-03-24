package com.callor.apps;

public class App_06 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			// for()중첩하기
			// 외부 for(int i )가 한번 반복할때마다
			// 내부 for(int j)가 5번 반복하라
			int nCount = 0; // 숫자를 저장하는 변수에는 n 접두사를 사용함
			for (int j = 0; j < 5; j++) {
				System.out.println(++nCount);
			}
			System.out.println("===========================");
			for (int j = 0; j < i + 1; i++) {
				for (int J = i ; j < 5; j++)
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
	}
}
