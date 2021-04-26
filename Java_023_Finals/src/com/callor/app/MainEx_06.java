package com.callor.app;

import java.util.List;

import com.collar.model.ScoreVO;

public class MainEx_06 {

	
	public static void main(String[] args) {
		List<ScoreVO> scoreList = null;
		
		
		for (int i = 0; i < 10; i ++) {
			
			//익셉션이 나는이유
			ScoreVO scoreVO = null;
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
			
			scoreList.add(scoreVO);
			
			//나머지코드완성하는 문제
			
		}
	}
}
