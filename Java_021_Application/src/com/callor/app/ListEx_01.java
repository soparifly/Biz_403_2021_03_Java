package com.callor.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListEx_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(100) + 1;
			intList.add(num);
		}
		for (Integer n : intList) {
			System.out.print(n + "\t");
			/*
			 * Collections클래스는 List와 같은 데이터들을 관리하는 클래스이 부모클래스
			 */
		}
		Collections.sort(intList); // List타입의 데이터를 매개변수로 받음
		// return값을 사용하는 것이 아니고
		// 매개변수로전달된 값 자체를 변형한다
		for (Integer n : intList) {
			System.out.print(n + "\t");
		}
		String strNation = "Republic of Korea";
		strNation.replace("Korea", "대한민국");

		System.out.println(strNation);
		/*
		 * intNum1, intNum2의 변수를 add()method는 내부코드에서 매개변수의 값을 임의 변경했다
		 * 하지만 그변경이 add()method 가 끝난 후에는 
		 * 원랴 intNum1, intNum2에는 아무런 영향을 미치지않는다
		 */
		int intNum1 = 50;
		int intNum2 = 30;
		add(intNum1, intNum2);
		System.out.println(intNum1);
		System.out.println(intNum2);
	}

	/*
	 * 매개변수로 선언한 num1, num2 의 값을 method에서 변경하는 코드
	 */
	public static void add(int num1, int num2) {
		num1 = 100;
		num2 = 200;

	}

}
