package com.soparifly.apps;

import java.util.Random;

public class Controller_15 {
	public static void main(String[] args) {
		Random rnd = new Random();

		int kor;
		kor = 0;
		int num;
		num = 0;
		int nCount=0;
		System.out.println("=====================================");
		for (int i = 0; i < 10; i++) {
			kor = rnd.nextInt(100) + 1;
			num += kor;
			
			System.out.printf("%d 번 학생: %d\n",++nCount,kor);
		}
		System.out.println("---------------------------------------");
		float intAvg = num / 10 ;

		System.out.println("총점 :"+num);
		System.out.println("평균" + intAvg);
		System.out.println("=====================================");
	}
}
