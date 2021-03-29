package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_03 {
	public static void main(String[] args) {
		ScoreVO 홍길동 = new ScoreVO();
		홍길동.kor = 90;
		홍길동.eng = 90;
		홍길동.math = 100;

		int total = 홍길동.getTotal();
//		홍길동.total=900; //초기에 public연산자였을때는 사용가능했지만 
						  //private으로 다시 선언했기때문에
						// 연결연산자를 통해 total멤버 변수에 값을 직접저장할 수없게 바뀌었다
						// 이를 정보의 은닉 이라고하며
						// 맴버변수의 값이 원치않게 변경되는것을 방지하는것을 말한다.
		
		
		
		
		
//		메서드 이름을지을때 get으로 시작된 method 는 
//		private으로 선언된 멤버변수의 값을 읽을때 사용하는 method선언 접두사를 말한다
		System.out.println("홍길동 총점 : " + total);
		System.out.println("홍길동 평균	 : " + 홍길동.getAvg());

	}
}
