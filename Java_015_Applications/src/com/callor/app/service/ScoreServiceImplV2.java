package com.callor.app.service;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{

	/*
	 * ScoreServiceImplV1을 상속받고	
	 * inputScore() 메소드를 재정의
	 * 학생의학번을 입력받을때
	 * 
	 */
	public ScoreServiceImplV2() {
		
		// TODO Auto-generated constructor stub
	}
	public void inputScore() {
		Integer intNum = inService.inputValue("학번", 1);
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(intNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		scoreList.add(intNum);
		
		

	}
}
