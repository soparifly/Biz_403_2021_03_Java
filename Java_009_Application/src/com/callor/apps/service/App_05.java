package com.callor.apps.service;

public class App_05 {

	public static void main(String[] args) {
		
		ScoreServiceV5 ssV5 = new ScoreServiceV5(10);
		ssV5.makeScores();
		/*
		 * ssV5.makeScores()명령이 실행되면 ScoreV5 클래스의 makeScores() method의 코드가 실행된다.
		 * 코드가 모두 정상종료되고나
		 * 아니면 중간에 return명령문을 만나면
		 * System.out.println("입력");명령문이 이어서 실행된다
		 * 
		 */
		System.out.println("입력업무중단!!");
		System.out.println(ScoreServiceV5.dLine());
	}
}
