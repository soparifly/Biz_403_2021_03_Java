//package com.callor.app.service;
//
///*
// * 랜덤클래스를 사용하여 0~ 100까지 난수를 두개
// * 생성한후 4칙연산을 수행한다
// * filewriter , printwriter클래스를 사용하여
// * src/com/callor/app/data.txt 파일에 44칙 연산 결과를 다음과같이 저장한다
// * * 뺄셈과 나눗셈은 큰수 - 작은수, 큰수 / 작은 수로 연산
// */
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Random;
//
//public class FileWriterEx_01 {
//	Random rnd;
//
//	public FileWriterEx_01() {
//		rnd = new Random();
//
//		
//	}
//
//	public static void main(String[] args) {
//
//		String fileName = "src/com/callor/app/data1.txt";
//
//		FileWriter fileWriter = null;
//		PrintWriter out = null;
//
//		try {
//			fileWriter = new FileWriter(fileName);
//			out = new PrintWriter(fileWriter);
//			out.println("=".repeat(50));
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	Integer n1 = rnd.nextInt(100);
//	Integer n2 = rnd.nextInt(100);
//
//	public Integer add() {
//		Integer add = n1 + n2;
//		return add;
//	}// 더하기
//
//	public Integer minus() {
//
//		Integer minus = 0;
//		while (true) {
//			if (n1 > n2) {
//
//				minus = n1 - n2;
//				break;
//			}
//		}
//		return minus;
//	}// 뺄셈
//
//	public Integer multi() {
//		Integer multi = n1 * n2;
//		return multi;
//	}
//
//	public Float division() {
//		Float division = (float) 0;
//		while (true) {
//
//			if (n1 > n2) {
//				division = (float) n1 / n2;
//				return division;
//			}
//			return division;
//		}
//	}
//
//}
