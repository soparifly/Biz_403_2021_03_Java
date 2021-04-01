package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {
	protected Scanner scan;
	protected List<Integer> inputList;
	
//클래스 영역에 선언된변수는 맴버변수라고 하고
	//맴버변수는 이클래스의 어떤 메소드에서든지
	//자유롭게 접근하여 저장 읽기가 가능하다
	//데이터형이 다른 맴버변수는 이름이같아도 다르게 인식된다
	
	
	public InputServiceV2() {

		scan = new Scanner(System.in);
		inputList = new ArrayList<Integer>();
		//메소드의 중괄호에 선언된 변수는 지역변수라고 한다
		//지역변수는 {} 를 벗어나면 소멸되어버린다
		//{} 이 서로다르면 이름은 같아도 절대 접근이 불가능하다 
		//맴버변수에 같은 이름의 변수가 있는데
		//지역변수에 같은 이름으로 변수를 또 선언하면 
		//맴버변수는 감춰져서 접근이 불가능하다
		
	}

	public void inputNum() {
		int num = 0; //굳이 생성자안에 선언할필요없는 변수
		
		while (true) {
			System.out.println("50보다 크고 150보다 작은 수를 입력하세요");
			System.out.print(" >> ");
			num = scan.nextInt();
			if (num > 50) {
				if (num < 150) {
					inputList.add(num);
				System.out.println(" 입력한 수 "+ num);
				return;
				}
				else if ( 50 < num || num > 150) {
					System.out.println("잘못된 수입니다.다시입력하세요");
					continue;
				}
			} 

		}
	}

}
