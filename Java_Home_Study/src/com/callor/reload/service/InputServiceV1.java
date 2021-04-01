package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV1 {
	Scanner scan;
	List<Integer> intList;

	public InputServiceV1() {

		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();

	}

	public void inputNum() {
		int num = 0;
		try {

			System.out.println("정수를 입력하세");
			System.out.print(" >> ");
			num = scan.nextInt();
			intList.add(num);

		} catch (Exception e) {
			System.out.println("정수만 입력하세");

		}
	}

	public void printNum() {
		for (int i = 0; i < intList.size(); i++) {
			System.out.println("입력한수의 목록.." + intList.get(i));

		}
	}
}
