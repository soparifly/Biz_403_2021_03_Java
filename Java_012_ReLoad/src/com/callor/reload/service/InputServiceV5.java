package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {
	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {
		while (true) {
			System.out.println("2개의 정수를 입력하세요");

			System.out.print("정수 1 >>  ");
			String strNum1 = scan.nextLine();
			Integer intNum1 = Integer.valueOf(strNum1);
			NumberVO numList = new NumberVO();
			numList.setNum1(intNum1);

			System.out.println("정수 2 >>");
			String strNum2 = scan.nextLine();
			Integer intNum2 = Integer.valueOf(strNum2);
			numList.setNum2(intNum2);
			if (intNum1 < intNum2) {
				System.out.println(intNum1 + " 보다 작은 값으로 입력하세요");
			}

			NumberVO vo = new NumberVO();
			vo.setNum1(intNum1);
			vo.setNum2(intNum2);
			numList.add(vo);
		}
	}

	public void printNum() {
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			System.out.print(vo.getNum1());
			System.out.print("-");
			System.out.print(vo.getNum2());
			System.out.print(" = ");
			System.out.println();
			System.out.println(vo.getNum1() - vo.getNum1());
		}
	}
}
