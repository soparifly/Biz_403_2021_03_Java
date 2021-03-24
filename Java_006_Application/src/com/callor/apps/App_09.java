package com.callor.apps;

import java.util.Random;


public class App_09 {
	public static void main(String[] args) {
		String[] strNames = {"홍길동","성춘향","이몽룡","장녹수","임꺽정"};

		int[] intNum = new int[ strNames.length];
	
		int[] intKor = new int[strNames.length];
		int[] intEng = new int[strNames.length];
		int[] intMath = new int[ strNames.length];
		
		int[] intTotal = new int[ strNames.length ];
		float[] floatAvg = new float[ strNames.length ];
		
		Random rnd = new Random();
		for (int i = 0; i <strNames.length ; i++) {
			intKor[i]=rnd.nextInt(51)+50;
			intEng[i]=rnd.nextInt(51)+50;
			intMath[i]=rnd.nextInt(51)+50;
		}

		for (int i =0; i <strNames.length ; i++) {
	
			intNum[i]= i + 1; //학번을 1번부터 만듦
			intTotal[i] = intKor[i];
			intTotal[i]+= intEng[i];
			intTotal[i]+= intMath[i];
			//intTotal에 각점수를 누적함
			floatAvg[i]=(float)intTotal[i] /3; //전체과목의 평균을 구함
			
			System.out.println("빛나라 고교 성적처리");
			System.out.println("=======================================");
			System.out.println("학번/t 이름/t 국어/t 영어/t 총점/t 평균/t");
		}
			for(int i= 0; i<strNames.length ; i++) {
				System.out.printf("%3d\t",intNum[i]	);
			System.out.printf("%s\t",strNames[i]);
			
			System.out.printf("%3d\t",intKor[i]);
			System.out.printf("%3d\t",intEng[i]);
			System.out.printf("%3d\t",intMath[i]);
//나머지 저장하고 오류값수정하기
			}
			
			
		}
			
				
				
	}
