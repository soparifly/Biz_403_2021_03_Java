package com.callor.apps;

import java.util.Random;

public class App_01A {
	public static void main(String[] args) {
		Random rnd = new Random();

		/*
		 * 25~ 50명 인원이 있는 각 반에 pizza 간식을 지급하려고 한다 각 반의 학생들에게 1조각 pizza를 지급하려고한다 학생수보다
		 * 부족하거나 6조각 이상 남지 않도록 피자를 주문해야한다 몇 박스의 피자를 주문해야되는지 코드로 작성하라.
		 */
		int intMembers = rnd.nextInt(26) + 25; // (25~50의 )수 중에서 1개를 만들어라
		int pizzaPcs = 6;
		int pizzaBox = 0;

		pizzaBox = intMembers / pizzaPcs;
		boolean bYes = intMembers % (pizzaBox * pizzaPcs) == 0;

		if (!bYes) {
			pizzaBox++;
		}

		// 정수 / 정수 ==> 몫이 몇개인가
		// 필요한 box 수와 같거나 1작은 값이 만들어진다

		System.out.println("=========================");

		System.out.println("인원수:" + intMembers);
		System.out.println("피자 판수 :" + pizzaBox);
		System.out.println("전체조각" + pizzaBox * 6);

	}
}
