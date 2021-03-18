package com.collar.var;

public class Varriable_02 {

	public static void main(String[] args) {

		
		/*
		 * -변수 명명법-
		 * 
		 * 첫글자는 반드시 영문소문자
		 * 		
		 * 이어서 영문대소문자, 숫자 Under Bar(_)사용가능
		 * 2개 이상의 단어를 조합하여 사용권장
		 * 단어를 조합할경우
		 *  두번째단어 부터는 첫글자 대문자
		 *   또는 단어와 단어사이를 Under bar로 구분한다
		 *   
		 *   EX) ★intNum1 = Camel case 카멜케이스☆
		 *   	 int_num_1 = snake case 스네이크 케이스
		 *   	 int_num1
		 *   
		 *   변수의 접두사로 변수의 타입을 설정하는것을 권장
		 *   	
		 *   ★intNum : 헝가리언 표기법 ☆
		 *   
		 *   
		 */
//		*키워드로 시작하는 변수이름
//		*변수이름은 첫글자가 소문자여야한다
//		가급적 두개이상의 단어를 조합해서 이름을 짓는다
		
//		정수형 변수 선언 과 clear
//		정수형 변수 intNum1,intNum2 생성
		int intNum1 = 0; //기본형
		Integer intNum2 = 0; //확장형

//		정수형 변수  longNum1, longNum2 생성
//		int, Integer형보다 기억장치 소모 용량이크다
//		int 형은 최대 2의 32승만큼 공간
//		long 형은 최대 2의 64승만큼 공간
//		수의 뒤에 l,L을 붙여준다
		long longNum1 = 0l;
		Long longNum2 = 0L;
		
//		실수형 변수 선언과 clear
//		실수형 변수 douNum1, douNum2 생성
		double douNum1 = 0.0;
		Double douNum2 = 0.0;
		
//		실수형 변수 floatNum1,floatNum2 생성
//		기억장치를 소모하는 용량이 보다작다
//		대신 정밀도는 낮다
//		값뒤에는 f를 붙여준다
		float floatNum1 = 0.0f;
		Float floatNum2 = 0.0f;
	
//		문자열형 변수를 선언하고 clear
//		문자 " 열 "형 변수  strName을 생성
		String strName1 = ""; //"(띄어쓰기")완전틀림
		String strName2 = null;
		
		intNum1 = 30;
		intNum2 = 40;

		floatNum1 = 30.0F;
		floatNum2 = 40.0F;
		
		longNum1 = 30l;
		longNum2 = 40L;
		
		douNum1 = 45.0;
		douNum2 = 55.0;
		
		strName1 = "홍길동";
		strName2 = "이몽룡";
		
	}
}
