package com.callor.reload.service;
import java.util.ArrayList;
/*
 * 어디선가  main메서드에서 객체로 선언 생성한 후 method 호출을 통해 명령을 실행하는 클래스
 */
import java.util.List;
import java.util.Scanner;

public class InputServiceV1 { //멤버변수들 : 클래스영역에 선언된 객체들
//	  접근제한자 : private 단독사용
//				 : protected 상속사용
	
	protected Scanner scan;
	//정수형 데이터들을 담을 리스트형 객체
	//Integer wrapper 클래스형 데이터들을 담을 리스트
	protected List<Integer> intList;


	public InputServiceV1() {
		intList = new ArrayList<Integer>();
		scan = new Scanner(System.in);
	}
	// 클래스에 선언하는 기본 타입의 메소드 메소드이름(){}
	public void inputNum() { // { } -> 블래이드, 코드블럭 연산을 수행하는 코드를 작성하고 inputNum라고 하겠다 라고 선언 = 메소드 선언문
						
		
		System.out.println("키보드로 정수를 입력하세요.");
		System.out.println("정수 >>");
		//키보드로 입력받은 값을  InTeger형 데이터 num에 저장
		Integer num = scan.nextInt();
		
		//키보드로 입력받은 정수를 intList에 추가
		intList.add(num);
		}
	public void printNum() {
		for (int i = 0; i <intList.size(); i++)
		{
//			아래의 출력문을 풀어쓰면 다음과같다 
//			Integer num = intList.get(i)
//			System.out.println("정수: " + num);
			System.out.println("정수: " + intList.get(i));
		}
	}
	
}
