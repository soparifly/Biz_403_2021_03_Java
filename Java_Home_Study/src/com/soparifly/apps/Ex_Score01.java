package com.soparifly.apps;

public class Ex_Score01 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';

		if (score > 90) {
			grade = 'A';
			System.out.println(score + "점은 " + grade + "입니다.");
		} else if (score >= 80) {
			grade = 'B';
			System.out.println(score + "점은 " + grade + "입니다.");
		} else if (score >= 70) {
			grade = 'C';
		System.out.println(score + "점은 " + grade + "입니다.");
		} else if (score >= 60) {
			grade = 'D';
		System.out.println(score + "점은 "+ grade+"입니다." );
		} else if (score < 60) { grade = 'F';
		System.out.println(score + "점은 "+ grade+"입니다." );
		}
	}
}
