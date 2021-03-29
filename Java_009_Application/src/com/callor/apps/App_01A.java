package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1A;

public class App_01A {

	public static void main(String[] args) {
	
		//ScoreServiceV1클래스를 사용하여
		//객체를 생성할때 , 정수 5를 전달해주고 5만큼의 배열을 생성하도록 코드를 변경 intMembers<<<<
		
		ScoreServiceV1A ssV1 =new ScoreServiceV1A ( 5 );
		/* 
		 * <method를 호출하여 명령실행하기>
		 * ssV1.makeScores()명령을 한줄 실행하므로써 
		 * ScoreServiceV1A 클래스에 정의되어있는
		 * "어떤"코드가 실행되는 효과를 만들어낸다
		 */
		ssV1.makeScores();
		ssV1.addNum();
	
		/*
		 * intputScore() method 는 private으로 선언되어있기때문에 객체.intputScore()형식으로 사용할수 없다.
		 */
		//ssV1.intputScore();
		
				
	}
}
