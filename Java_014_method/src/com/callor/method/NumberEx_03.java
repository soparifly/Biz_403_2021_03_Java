package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.ScoreServiceV1;

public class NumberEx_03 {
	public static void main(String[] args) {
		ScoreServiceV1 sc1 = new ScoreServiceV1();
		sc1.intputScore();
		
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		//can.close();
	}
}
