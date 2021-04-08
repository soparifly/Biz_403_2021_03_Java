package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. 과목명을  subject = {" 국어" ,"영어", "수학"} 배열에선언
 * 2. 과목점수를 담을 3개의 List를 선언
 *	3.InputServiceV2 의 
 */
public class ScoreServiceV5 {
	List<Integer> korList;
	List<Integer> engList;
	List<Integer> mathList;
	InputServiceV2 isV2;
	String[] subject;
	int student;

	public ScoreServiceV5() {
		korList = new ArrayList<Integer>();
		engList = new ArrayList<Integer>();
		mathList = new ArrayList<Integer>();
		isV2 = new InputServiceV2();
		subject = new String[] { "국어", "영어", "수학" };
		student = 5;
	}

	public void inputScore() {
		for(int st = 0; st < 5 ; st++) {
			Integer[] scores = new Integer[subject.length];
			for(int sb = 0; sb <subject.length; sb++) {
				scores[sb] = isV2.inputValue(subject[sb], 0, 100);
			}
			korList.add(scores[0]);
			engList.add(scores[1]);
			mathList.add(scores[2]);
		}
	}
	public void inputScore2() {
		
		
		for (int i =0 ; i <5 ; i++) {
			Integer score = isV2.inputValue(subject[i], 0, 100);
			if(score == null) {
				return;
			}else if(subject[i].equals("국어")){
				korList.add(score);
			}else if(subject[i].equals("영어")) {
				engList.add(score);
			}else if(subject[i].equals("수학")) {
				
			}
		}
	}
	
//	public void inputScore() {
//		Integer korScore;
//		Integer engScore;
//		Integer mathsScore;
//		int[] sum = new int[student];
//		float[] avg = new float[student];
//		
//
//		for (int i = 0; i < student; i++) {
//			korScore = isV2.inputValue(subject[0], 0, 100);
//			korList.add(korScore);
//
//			if (korScore == null) {
//				System.out.println("종료");
//				return;
//			}
//
//		}
//		for (int i = 0; i < student; i++) {
//			engScore = isV2.inputValue(subject[1], 0, 100);
//			engList.add(engScore);
//
//			if (engScore == null) {
//				System.out.println("종료");
//				return;
//			}
//		}
//		for (int i=0; i<student; i++) {
//			mathsScore = isV2.inputValue(subject[2], 0, 100);
//			mathList.add(mathsScore);
//			
//			if (mathsScore == null) {
//				System.out.println("종료");
//				return;
//				}
//		}
//		
//		

//			korScore = isV2.inputValue(subject[0], 0, 100);
//			kors.add(korScore);
//			
//			engScore = isV2.inputValue(subject[1], 0, 100);
//			engs.add(engScore);
//
//			mathsScore = isV2.inputValue(subject[2], 0, 100);
//			maths.add(mathsScore);
//		
//			sum[i] = korScore + engScore + mathsScore;
//			avg[i] = (float) sum[i] / 3;
//			

	// korScore = isV2.inputValue(subject[0],0,100);
	// 세개의 각과목의 점수를 입력하는 것을 받고, 그것을 다섯명만큼 반복한 값을 저장하여 출력함

	// 저장한 점수입력들을 5명만큼 수행하여 어레이리스트에 추가함
	// 각과목으로 어떻게 나누어 표현할것인가
	// 방법 1 과목은 배열의 숫자로 표현이 가능하다

	// 아니면
	// 각 과목의 배열첨자를 각과목의 어레이리스트에 담아서 학생수가 다섯명이니 이를 표현하고

	// korScore = score

//	} // for문이 끝나나는 부분
//
//	public void inputScore2() {
//		for(int i=0 ; i <student ; i++) {
//			Integer scroe = inService.inputValue(subject[i],0,100){
//				
//			}
//		}
//	}
	public void inputScore3() {

		for (int i = 0; i < student; i++) {

			Integer[] scores = new Integer[subject.length]; // 과목의 갯수만큼 점수배열을 만듬

			for (int sb = 0; sb < subject.length; sb++) { // sb는 과목의 배열내에서 과목의 순서

				scores[sb] = isV2.inputValue(subject[sb], 0, 100);
			}
			// 반복문에 저장된 각과목을 과목의순서에맞는 점수를 리스트에 추가한다
			korList.add(scores[0]);
			engList.add(scores[1]);
			mathList.add(scores[2]);

		}

		// score에는 한 학생의 국어 , 영어 , 수학 점수가 저장되어있다.
	}

	public void printScore() {

		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");

		System.out.println("=".repeat(50));
		for (int index = 0; index < korList.size(); index++) {
			System.out.print(korList.get(index) + "\t");
			System.out.print(engList.get(index) + "\t");
			System.out.print(mathList.get(index) + "\n");

		}
		System.out.println("=".repeat(50));
	}

}
/*
 * Array리스트를 사용하는 방법
 * 
 * 객체.add(추가할변수) //내용추가 객체.get() //내용호출
 */
