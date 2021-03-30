package com.coller.classes.service;

public class Lines {

	public static String dLine(int nCount) {
//		printf()는 화면에 출력하는 form을 만드는 출력명령문
//		출력 method
//		String.format(null, null)은 화면에 출력하는대신 문자열로 만들어 return하는 method
//		만들어진 문자열을 dLine 변수에 담는다
		
//		ncount 값이 50이라면 
//		%050d 형식의 format문자열이 생성될 것이다
		String dLine = String.format("%0"+
											nCount +"d", 0).replace("0", "=");
		
		return dLine;
	}
	
	public static String sLine(int nCount) {
		
		return String .format("%0" + nCount + "d", 0)
					  .replace("0", "-");
	}
}
