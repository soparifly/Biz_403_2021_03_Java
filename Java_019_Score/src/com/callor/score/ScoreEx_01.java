package com.callor.score;

import com.callor.score.service.ScoresService;
import com.callor.score.service.impl.ScoreServiceImplV1A;


public class ScoreEx_01 {
	public static void main(String[] args) {
		ScoresService sService = new ScoreServiceImplV1A();
		sService.insertScore();
	}
}
