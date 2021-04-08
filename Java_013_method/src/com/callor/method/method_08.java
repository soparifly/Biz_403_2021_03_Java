package com.callor.method;

import com.callor.method.service.NumberServiceV6;

public class method_08 {
	/* 
	 * Method_08.main() 에서
	 * NumberServiceV6.inpNum()를 호출하고 
	 * 	InputService.inpValue(String title)을 호출하고 QUIT : return null;
	 *  아니면 :  reuturn 정수값
	 *  retNum 에 되돌려받기
	 *  null이면 return null
	 *  아니면 : 0~ 100까지 인지검사
	 *  아니면 다시 InputService.inpValue(sTring title)
	 *  아니면 return retNum
	 *  reNum에 되돌려 받아 화면에 출력
	 */
public static void main(String[] args) {
	NumberServiceV6 nsV6 = new NumberServiceV6();
	nsV6.inputNum();
	Integer retNum =nsV6.inputNum();
	System.out.println("입력한 값 :"+ retNum);
	
}
}
