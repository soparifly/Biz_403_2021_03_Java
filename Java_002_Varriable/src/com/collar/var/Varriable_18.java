package com.collar.var;

public class Varriable_18 {
	public static void main(String[] args) {
		
		//세 과목의 점수를 각각 변수에 저장
		
		int intKor = 90;
		int intEng = 88;
		int intMath = 77;
		
		
		//총점을 저장할 변수를 생성
		int intSum = 0;
		
		// 첫과목의 점수를 총점변수에 대입(할당)
		intSum = intKor ;
		//두번째 과목부터는 총점 변수에 누적한다.
		intSum += intEng;
		intSum += intMath;
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : "
				+ intSum / 3);
		
		intSum = intKor + intEng + intMath;
		
		
		
		
		
	}
}
