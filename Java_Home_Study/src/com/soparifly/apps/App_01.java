package com.soparifly.apps;

import java.util.Random;

public class App_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int pizzaPcs;
		pizzaPcs = 6;
		int intMembers = rnd.nextInt(26)+25;
		int pizzaBox =0;
		boolean bYes =
			intMembers % (pizzaBox * pizzaPcs) == 0;
		
		if (!bYes) {
			pizzaBox++;
		}
	System.out.println("인원수 "+intMembers);
	System.out.println("피자 박스 : " +pizzaBox);
	System.out.println("전체 조각 : "+pizzaPcs*intMembers );
	}
	
	}

