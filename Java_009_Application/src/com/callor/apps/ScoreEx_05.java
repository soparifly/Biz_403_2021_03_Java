package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_05 {

	public static void main(String[] args) {
		/*
		 * 변수는 배열로 생성하면
		 * 개별요소 들이 모두 자동으로 초기화된다
		 * 
		 */
		int[] nums = new int [10];
		/* 
		 * 클래스를 사용한 객체 배열은 
		 * 생성을 하여도 개별 요소들이 자동으로 초기화 되지않는다
		 */
		ScoreVO[] score = new ScoreVO[5];
		//객체배열은 사용 (저장,읽기)를 시도하기전
		//개별요소를 반드시 생성(초기화)시켜주어야한다.
		score[0] =new ScoreVO();
		score[0].name = "홍길동";
		score[0].kor = 90;
		score[0].eng = 80;
		score[0].math = 100;
		System.out.println(score[0].getTotal());  
		System.out.println(score[0].getAvg());  
		System.out.println(score[0].kor);
		for (int i = 0;i<score.length; i++) {
			score[i] = new ScoreVO();
		}
		System.out.println(score[0].kor);
	}
}
