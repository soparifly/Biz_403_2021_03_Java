package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_02 {

	/*
	 * ScoreVO 클래스를 디자인하고
	 * 클래스를 사용하여 객체를 생성한후 사용하기
	 * 
	 */
	
	public static void main(String[] args) {
		//객체 이름을 홍길동"으로 하여 "객체 생성"
		ScoreVO 홍길동 = new ScoreVO();
		
		//객체.멤버변수
//			  └>점(Dot  . )연결 연산자
//				객체연결연산자
//				클래스(객체)안에 선언된 변수나, method에 접근하기위한 연산자이다
		
		홍길동.name ="홍길동"; //홍길동을 멤버변수에 저장한다 라는 의미이다
		홍길동.kor =90;
		홍길동.eng =88;
		홍길동.math=77;
		
//		객체.method();
//		객체 연결 연산자를 통해서
//		getTotal() method를 호출(실행)하고
//		return된 결과를 total변수에 담아라
		int total = 홍길동.getTotal();
		float avg = 홍길동.getAvg();
		
		ScoreVO 이몽룡 = new ScoreVO();
		이몽룡.kor = 90;
		이몽룡.eng = 99;
		이몽룡.math=100;
		
		total = 이몽룡.getTotal();
		avg = 홍길동.getAvg();
		
//		객체 연결 연산자를 통하여 멤버변수나, method에 접근을 하면 오타 동으로 발생하는 오류를 최소화 할수 있다
//		코딩의 자동완성 기능을 충분히 활용할 수 있다.
		이몽룡.kor =10;
		
				
	}
}
