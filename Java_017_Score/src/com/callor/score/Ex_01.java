package com.callor.score;

import com.callor.app.service.Impl.ScoreServiceImplV2;
import com.callor.score.service.ScoreService;

public class Ex_01 {

	public static void main(String[] args) {
		ScoreService v1 = new ScoreServiceImplV2();
		v1.selectMenu();

	}
}
