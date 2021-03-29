package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV5 {
	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	Scanner scan;

	// 생성자 메서드 // void가 없고 //클래스 이름과같다
	public ScoreServiceV5(int members) {
		scan = new Scanner(System.in); // TODO Auto-generated constructor stub
		subject = new String[] { "국어", "영어", "수학" };

		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}

	/*
	 * 현재는 학생수 만큼 모든 과목의 점수 입력을 끝내야만 다른 업무로 진행이 된다. 몇명의 학생, 일부 과목 점수만 입력을 마친 상태에서 ,
	 * 잠시 업무를 멈추고 싶을때 현재 코드는 불가능하다 => 일부만 입력하고도 업무를 중단하는 기능을 넣자
	 */
	public void makeScores() {
		// 과목의 갯수만큼 점수를 담을 임시배열선언
		Integer[] scores = new Integer[subject.length];
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d번 학생의 성적입력\n ", i + 1);
			for (int j = 0; j < subject.length; j++) {
				scores[j] = this.inputScore(subject[j]);
				if (scores[j] == -1) {
					
					/*
					 * 입력 업무중에 -1을 입력했을때는 입력업무를 중단하는 main() 으로 되돌아 가고싶다. 이때 break를 사용하면 for가 겹쳐있기때문에 원하는 코드가 작동되지않는다.
					 * 이럴경우 return type이 void이지만 return명령을 실행하여 method코드를 중단할수 있다
					 * 
					 */
					return; //break;를 사용하면 다음 코드로 진행하지만 return문을 사용하면 진행을 중단한다
				}
			}
			intKor[i] = scores[0];
			intEng[i] = scores[1];
			intMath[i] = scores[2];
		}

	}

	private Integer inputScore(String sub) {
		Integer score = 0;
		while (true) {
			System.out.println(sub + " 점수를 입력하세요(QUIT : -1");
			System.out.println(" > > ");
			score = scan.nextInt();
			// 점수 입력을 하는 중에 -1 을 입력하면
			// 입력하는 업무를 중단하자
			if (score == -1) {
				return -1;
			}
			if (score < 0 || score > 100) {
				System.out.println(sub + "점수는 0~ 100까지 입력하세요");
//			continue; //명령을 사용하는 대신
				// else 를 사용하여 코드를 작성
			} else {
				break;
			}
		}
		return score; // 오류를 막기위해서 메서드를 생성수 바로 return값을 입력해준다 //while 입력시는 의미가 없다
	}
	
	public static String dLine() {
		return"=============================================================";
	}
}
