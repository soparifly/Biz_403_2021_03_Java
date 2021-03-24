package com.callor.app;

/*
 * {}내에  있는 코드는 최소화하자
 * 작은일들로 분해하기
 */
import java.util.Random;

public class App_01 {
	public static void main(String[] args) {
		/*
		 * 1.정수형 배열 20개를 선언 
		 * 2. Random클래스를 사용하여 1 ~ 100까지 난수를 생성하여 저장 
		 * 3. 배열된 정수증 짝수들의
		 * 리스트를 출력하고 짝수들의 합을계산하여 출력합니다
		 * 
		 */
		//랜덤수를 사용할 명령어 지정하기
		Random rnd = new Random();
		
		/*
		 * 배열의 크기를 변수에 설정해 두고 코드내에서 공통으로 사용하기
		 */
		int numsLength = 20; //배열의 길이는 20이다

		int[] intNum = new int[numsLength]; //int는 정수의 형태고 float 나 double형도 사용할수 있다

		// int[] intNum = new int[20];

		//짝수의 합을 정할 변수를 지정하기
		int intSum = 0;
		
		// 먼저 선언되어있는 배열에 값을저장하기
		//포문을 이용해 반복의 횟수와 배열에 들어갈 값의 난수를 만들어줌
		for (int i = 0; i < 20; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			
			// 배열에 저장된 값을 읽기
			// 읽은 값에 짝수인지 계산
			if (intNum[i] % 2 == 0) {

				// 짝수일때 출력하기
				System.out.println(intNum[i]);
			}
		}

//		intSum에 이전 코드에서 어떤 값이 저장되어 있을지도 모르기때문에 clear하고 시작
		intSum = 0;

		for (int i = 0; i < 20; i++) {
			if (intNum[i] % 2 == 0) {

				// 짝수 이면 intSum에 합산(누적하라)
				intSum += intNum[i];

			}
		}
		System.out.println("=====================");
		System.out.println("합계 " + intSum);
		System.out.println("========================");
	}

}
