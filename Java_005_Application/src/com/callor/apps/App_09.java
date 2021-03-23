package com.callor.apps;

import java.text.DecimalFormat;

/*
 * 어떤 정수의 단위 자릿수가 얼마인가를 계산하는 코드
 */
public class App_09 {
//정수의 자릿수를 구하는 코드

	public static void main(String[] args) {
		int intNum = 323241;
		DecimalFormat strForm = new DecimalFormat("###,###");
		// format(숫자) 명령을 수행하면
		// 숫자를 3자리 구분기호를 부착하여 문자열로 만들어준다.
		String str = strForm.format(intNum);
		System.out.println(str);
		System.out.println(strForm.format(49497896));

	}
}
