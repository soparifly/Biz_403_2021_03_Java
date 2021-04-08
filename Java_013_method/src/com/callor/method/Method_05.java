package com.callor.method;

import com.callor.method.service.NumberServiceV2A;

public class Method_05 {
	public static void main(String[] args) {
		NumberServiceV2A nsv2 = new NumberServiceV2A();
		Integer retNum = nsv2.inputNum();
		nsv2.inputNum();
		if (retNum == null) {
			System.out.println("업무종료");
			
		} else {
			System.out.println("입력된 정수 : " + retNum);
		}
	}
}
