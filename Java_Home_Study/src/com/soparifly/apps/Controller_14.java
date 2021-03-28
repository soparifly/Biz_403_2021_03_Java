package com.soparifly.apps;

import java.util.Random;

public class Controller_14 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int kors;
		int engs;
		int math;
		int sums;
		float floatAvg;
		
		kors = rnd.nextInt(100)+1;
		engs = rnd.nextInt(100)+1;
		math = rnd.nextInt(100)+1;
		
		
		sums = kors;
		sums += engs;
		sums += math;
		
		floatAvg = (float)sums / 3;
		
		System.out.println("===========================");
		System.out.println("국어 :  "+kors);
		System.out.println("영어 :  "+engs);
		System.out.println("수학 :  "+math);
		System.out.println("----------------------------");
		System.out.printf("총점 : %d \t 평균 :  %3.2f",sums,floatAvg );
		
		
		
	}
}
