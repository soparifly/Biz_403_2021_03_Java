package com.callor.controller;

public class Score_01 {
public static void main(String[] args) {
	
	int intKor = 80;
	int intEng = 77;
	int intMath = 65;
	
	int intSum = 0;
	intSum = intMath+intKor+intEng;
	
	int intAvg = 0;
	intAvg = intSum / 3 ;
	
	System.out.println("============================");
	System.out.printf("%s\n%s\n%s\n","국어 : "+intKor, "영어 : "+intEng, "수학 : "+intMath);
	System.out.println("----------------------------");
	System.out.print("총점 :"+ intSum);
	System.out.println("  평균 :" +intAvg);
	System.out.println("============================");
	
			
}
}
