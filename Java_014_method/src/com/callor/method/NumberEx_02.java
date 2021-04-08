package com.callor.method;

import com.callor.method.service.InputNumberV1;

public class NumberEx_02 {

public static void main(String[] args) {
	
	InputNumberV1 inService = new InputNumberV1();
	//문자열 1개만 전달하여 method호출
//	inService.inputValue("신라면");
	
	//문자열 1개와 정수 두개를 전달하여 method호출
	//2개의 정수 범위 내의 값이 입력됬는지 유효성검사하기
	inService.inputValue("새우깡", 0, 100);
	
}	
	

}
