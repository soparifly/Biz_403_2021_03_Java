package com.callor.app;
import com.collar.model.ScoreVO;

public class MainEx_02 {

	
	public static void main(String[] arg) {
		ScoreVO[] scoreVO = new ScoreVO[10];
		
		
		int index = 3;
		scoreVO[index].setNum("0001");
		scoreVO[index].setKor(90);
		scoreVO[index].setEng(90);
		scoreVO[index].setMath(90);
//		System.out.println("학번 :" + scoreVO.getNum());
		
	}
}
