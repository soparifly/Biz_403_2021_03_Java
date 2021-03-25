package com.callor.apps.service;

public class App_09 {
	public static void main(String[] args) {
		
		
		//public ScoreServiceV1()
		//p
		//아래 인스턴스에 (@)에 들어있는 수는 객체를 만들때 생성자에게 전달(보내는 값) argument
		ScoreServiceV2 ssV2 = new ScoreServiceV2(100);
		ssV2.intScore();
		ssV2.intSum();
	}
}