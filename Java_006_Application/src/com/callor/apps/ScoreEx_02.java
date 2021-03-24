package com.callor.apps;

import com.callor.apps.service.ScoreService;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		// 한번 선언하고 코딩된 클래스는
		//어디서든지 인스턴스로 생성하면
		//클래스에 만들어진 코드를 호출하여 명령을 수행할수있다
		ScoreService sService = new ScoreService();
		
		//ScoreService클래스의 makeScore()메서드를 호출하라
		//호출하여 무언가를 실행하라
		sService.makeScore();
		sService.printScore();
		
		ScoreService sSV1 = new ScoreService();
		sSV1.makeScore();
		sSV1.printScore();
//		:
//			얼마든지 사용할수있다
		
	}
}
