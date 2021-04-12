package com.collor.classes;

import java.util.Scanner;

public class ScannerEx_06 {

	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);// 스캔 임포트

		while (true) {
			Integer intNum1 = 0;
			Integer intNum2 = 0;

			System.out.println("=".repeat(50)); // = 문구를 50개 출력함

			System.out.println("숫자 2개를 입력하세요");

			System.out.print("숫자 1 > >   (QUIT:중단하기) "); 
			String strNum1 = scan.nextLine(); // 키보드로 입력받아 strNum1에 저장함
			if (strNum1.endsWith("QUIT")) {
				return; //main() 메서드에서 return 이 실행되면 코드 진행을 종료하겠다라는 뜻임 모든 변수가 클리어됨
			}
				
			try {
				intNum1 = Integer.valueOf(strNum1); // 숫자로 변경한다 //문자열을 숫자로 변형하여 intNum1에 저장하기때문에 오류(exception)이 발생할수있다.
			} catch (Exception e) { // 예외(Exception) 상황발생
				System.out.println("숫자로만 입력하세요"); // 안내문 출력
				continue; // while문으로 점프함
			}

			System.out.print("숫자 2 > >    ");
			String strNum2 = scan.nextLine();
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				System.out.println("숫자로만 입력하세요");//
				continue;
			}

			System.out.printf("%d  x  %d  =  %d\n", intNum1, intNum2, intNum1 * intNum2);
		}

	}

}
