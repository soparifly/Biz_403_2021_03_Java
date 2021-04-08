package com.callor.app;

import com.callor.app.model.ScoreVO;

public class ScoreEx_01 extends Object {
	
	public static void main(String[] args) {
		ScoreVO scoreVO = new ScoreVO();
		
		scoreVO.setNum("001");
		scoreVO.setName("홍길동");
		scoreVO.setKor(90);
		scoreVO.setEng(88);
		scoreVO.setMath(77);
		
//		@Override //재정의 // 상속받을 클래스에있는 메소드를 내맘대로쓰기
		
		System.out.println(scoreVO.toString() );
		
		
		
	}

}
