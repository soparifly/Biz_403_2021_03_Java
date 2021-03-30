package com.soparifly.apps;

/*
 * 3단부터 7단까지 출력하
 */
public class For_Ex02 {
	public static void main(String[] args) {
		int dan = 0;
		int nCount = 0;

		for (dan = 3; dan <= 7; dan++) {
			for (nCount = 1 ; nCount <=9 ; nCount++ )
			{
				System.out.println(dan +"x"+nCount+"="+(dan*nCount));
			}
		}

	}
}
