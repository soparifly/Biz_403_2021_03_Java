package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV4 {
	Scanner scan;
	protected String[] subject;
	InputServiceV2 inService;

	/*
	 * 생성자 메서드 ScoreServiceV4 클래스를 사용하여 객체를 생성할때 호출할 method
	 * 
	 */

	public ScoreServiceV4() {
		// 생성자에 작서되는 코드
		// 맴버변수 영역에 선언된 변수 , 객체를 생성하는 코드

		subject = new String[] { "국어", " 영어", "수학" };
		scan = new Scanner(System.in);
		inService = new InputServiceV2();

	}
	/*
	 * 과목의 이름이 저장될 배열을 클래스 영역에 선언 과목 점수 입력 , 성적 리스트 출력등에서 사용하기때문에 멤버변수 영역 = 클래스 영역 에
	 * 선언
	 * 
	 */

	// 키보드를 사용하여 3과목의 점수를 입력받는데
	// InputServiceV2에 선언된 메서드를 사용할 예정이므로
	// 여기에서는 키보드 등의 클래스 객체를 사용할 필요가 없다.

	public void inputScore() {

		/*
		 * 과목명을 배열로 선언한 이유는 점수를 입력받는 메소드 호출 코드를 한번만 작성하고 for반복문으로 처리할수있다
		 * 
		 */

		// 배열의 성질을 이용해서 과목의 점수를 저장할 score배열을 생성한다
		int[] scores = new int[subject.length];
		for (int i = 0; i < subject.length; i++) {

			Integer score = inService.inputValue(subject[i], 0, 100);

			if (score == null) { // V2 에서 QUIT를 입력하면 null값을 반환하는 명령문이 설정되어있다.
				System.out.println("종료");

				// break; 를 사용하면 for가 끝나는 곳으로 점프를 한다 for가 끝나고 이후 다른 연산 또는 수행할 어떤 명령문이나 과정이 필요할경우
				// break;를 사용한다

				return; // return은 이for문이 소속되어있는 메소드를 종료시킨다.그리곤 이 메소들 호출했던 코드로 되돌아간다 .
			}

			scores[i] = score;

			// return받은 점수를scores배열의 i번째 위치에 저장하라

		} // for end 세과목의 점수를 subject[i]에 담는다

		// socres배열에 담긴 점수를 총점계산

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];

		}
		float avg = (float) sum / subject.length;
		System.out.println("총점:   " + sum);
		System.out.println("평균:   " + avg);
		
//		Integer sum = 0;

//		for (int i = 0; i < subject.length; i++) {

//			Integer score = inService.inputValue(subject[i], 0, 100);
		
//			sum += score;

//			if (score == null) {
		
//				System.out.println(" 종료 ");
//
//				return;
//			}
//		}
//		System.out.println("합계 : " + sum);
//
//		float avg = (float) sum / 3;
//
//		System.out.printf("평균 :  %3.2f", avg);

	}
}
