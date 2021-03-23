package com.callor.apps;

import java.util.Random;

public class App_04B {
	public static void main(String[] args) {

		Random rnd = new Random();
		int pizzaPcs = 6;
		
		
		// 5학급의 인원수를 저장할 배
		int[] intClasses = new int[5];

		for (int i = 0; i < 5; i++) {
			
			// 0~ (??-1) + @@
			// @@ : 시작값을 지정하는 형태
			// 50 ~ 59 중의 임의의 수를 생성함
			int classMembers = rnd.nextInt(10) + 50;
			
			
			intClasses[i] = classMembers;
		}
		
		// 학급 별 주문 수량을 계산하는 부분과
		// 리스트를 출력하는 부분을 분리
		// 1. 계산된 주문수량을 담아둘 장소를 생성
		// 2. 저장된 주문수량을 사용하여 출력

		// 학급별 주문수량을 계산하여 저장할 배열
		int[] intOrders = new int[5];
		
		for (int i = 0; i < 5; i++) {
			
			int order = intClasses[i] / pizzaPcs;
			if (intClasses[i] % (order * pizzaPcs) > 0) {
				order++;
			}
			// 계산하는 부분

			intOrders[i] = order;

		}
		System.out.println("피자주문서");
		System.out.println("순번\t 인원\t Box\t");
		System.out.println("---------------------------");

		int intTotalOrder = 0;

		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + "\t");
			System.out.print(intClasses[i] + "\t");
			System.out.print(intOrders[i] + "\t");
			System.out.println(intOrders[i] * pizzaPcs);
			intTotalOrder += intOrders[i];
		}
		System.out.println("===========================");
		System.out.printf("w전체 주문 BOX 수량 : %d\n", intTotalOrder);
		System.out.println("===========================");

	}
}
