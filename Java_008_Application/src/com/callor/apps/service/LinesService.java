package com.callor.apps.service;

public class LinesService {
/*
 * 누군가 LinesService.dLines(10)
 * 	형식으로 호출하면
 *  = 문자열을 10개 생성하여 
 *  return하라
 *  또는 LinesService.sLine(20)
 *  -문자열을 20개 생성하여 return하라는 이야기임
 */
	public static String dLines(int length){
	
		String dLines = "";
		for (int i = 0; i <length ; i++) {
			dLines += "=";
	}
		return dLines; //호출하는 곳으로 다시 되돌려 보내라 , 
	}

	public static String sLines(int length) {
		String sLines = "";
		for (int i =0 ; i < length ; i++) {
			sLines += "-";
		}
		return sLines;
	}
}
