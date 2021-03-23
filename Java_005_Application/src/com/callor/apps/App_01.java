package com.callor.apps;

import java.util.Random;

public class App_01 {
	public static void main(String[] args) {

		Random rnd = new Random();
		
		int intMembers = rnd.nextInt(50)+25; //(x)
		
		int i = 0;
		
		if (25 < intMembers && intMembers < 50) {
			i = intMembers * 6;
		}
		
		if ( i % 6 == 0) {
			System.out.println(i / 6);
		}
	}

}
