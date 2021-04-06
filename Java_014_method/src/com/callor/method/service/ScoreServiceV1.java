package com.callor.method.service;

import java.util.Scanner;

/*
 * 1.inputSocer() method를 선언하고
 * 2. IntputService1의 inputValue() method에 
 * 3."국어",0,100값을 전달한후
 * 3.리턴된값을 변수에 저장
 * 4. 리턴된 값이 널이면 "종료"를 출력하고
 * 5. 변수에 저장된 값이 정수이면 "점수:??"형식으로 출력
 */
public class ScoreServiceV1 {

	protected Scanner scan;
	InputNumberV1 inv1;
	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		inv1 = new InputNumberV1();

	}
	public Integer intputScore() {
		Integer intNum = inv1.inputValue("국어",0,100);
		
		if (intNum == null) {
			System.out.println("종료");
			
		}  else {
			
			System.out.println("점수 : " +intNum);
		}
		
		return intNum;
		
	}


}
