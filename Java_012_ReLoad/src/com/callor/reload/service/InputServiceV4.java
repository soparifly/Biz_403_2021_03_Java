package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV4() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();

	}

	public void inputNum() {

		System.out.println("2개의 정수를 입력하세요");
		System.out.println("정수 1 > >");
		String strNum1 = scan.nextLine();
		Integer intNum1 = Integer.valueOf(strNum1);
//		System.out.println(" 숫자 1을 입력하세요 ");
//		System.out.print( ">>>>>");
//		int num1 = scan.nextInt();

					
//		System.out.println(" 숫자 2을 입력하세요 ");
//		System.out.print( ">>>>>");
//		int num2 = scan.nextInt();
		
		System.out.println("2개의 정수를 입력하세요");
		System.out.println("정수 1 > >");
		String strNum2 = scan.nextLine();
		Integer intNum2 = Integer.valueOf(strNum2);
		
//		NumberVO vo = new NumberVO();
//		vo.setNum1(num1);
//		vo.setNum2(num2);
		NumberVO vo = new NumberVO();
		vo.setNum1(intNum1);
		vo.setNum2(intNum2);
		numList.add(vo);
	}

	public void printNum() {
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			System.out.println(vo.getNum1());
			System.out.println(vo.getNum2());
		}
//	public void printlist(NumberVO vo) {
//		System.out.println("=".repeat(30));
//		System.out.println(vo.getNum1());
//		System.out.println(vo.getNum2());
//		System.out.println("=".repeat(30));
//		this.printlist(vo);

	}

}
