package com.callor.app.service;

import java.util.Scanner;

import com.kimbyulook.standard.InputService;
import com.kimbyulook.standard.impl.InputServiceImplV1;

public class ScoreServiceV1{
	// TODO InputService interface를 활용 하여 한 학생의 국어, 영어, 수학점수를 입력받고
	// 총점과 평균을 계산하여 출력
	// 단 , 점수는 0~ 100점까지만 입력할수 있음
	InputService isV1;
	Scanner scan;
	String[] subject;
	public ScoreServiceV1() {
		isV1 = new InputServiceImplV1();
		scan = new Scanner(System.in);
		subject = new String[] {"국어", "영어", "수학"};
		
		
	}
	public void score() {
		
		int sum = 0; 
		float avg = 0;
		Integer num = 0;
		int st[] = new int[5];
		for(int i = 0; i < st.length ; i++) {
			
			for (int sb = 0; sb < subject.length; sb++) {
			
				num = isV1.inputValue(subject[sb], 0, 100);
				
				
				if (num == null) {
				
					System.out.println("종료");
					return;
				}
				sum += num;
				
			}
			avg = (float)sum / subject.length;
			System.out.println("합계 :" + sum);
			System.out.println(avg);
		}
		
	}
	
}
