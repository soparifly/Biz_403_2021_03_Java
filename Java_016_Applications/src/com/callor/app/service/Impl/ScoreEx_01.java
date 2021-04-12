package com.callor.app.service.Impl;

import com.callor.app.service.ScoreService;

public class ScoreEx_01 {
	public static void main(String[] args) {

		/*
		 * 아직 ScoreServiceImplV1 클래스의 메소드들은 코드가 구체적으로 구현되지않았다.(메소드는 만들어져있지만 안에 코드가없다)
		 * 
		 * 이런 상황에 다른 팀원이 ScoreServiceImplV1 클래스의 메소드를 호출하는 코드를 작성했을때, 1. method가 없어서
		 * 발생한느 문법오류는 없고 2. 언젠가는 호출한 메소드 코드가 구현될 것임을 약속 받은 성태이다. 3.
		 * 따라서ScoreServiceImplV1의 메소드를 호출하는 코드는 잠시만들어만 두고 이후의 코드에 집중하여 코딩을 계속 할수 있다.
		 */
		ScoreService sService = new ScoreServiceImplV1();

		sService.inputScore();
		sService.printScore();
		sService.saveScore();
		if (sService.checkScore() == 0) {
			// checkScore()가 0을 return하면 수행할 코드
		} else {
		}
	}
}
