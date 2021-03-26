package com.callor.apps;

import java.util.Scanner;

/*
 *  실제 app을 사용하여 업무를 수행할때는
 *  데이터 값을 입력하고 입력된 데이터를 연산수행 하는 코드가 대부분이다.
 *  랜덤수는 편안하게 계산하기위해서 사용했던것임
 *  입력된 데이터를 변수(배열)에 저장을 하고 ; 
 * 변수에 저장된 데이터를 연산하는 코드가 대부분이었음
 */
public class keyInput_01 {
	
	 public static void main(String[] args) {
		
		System.out.println("Hello Korea"); //system; out ; println;각각 메서드임
		//키보드를 스캔함 컨트롤 쉬프트 O
		
		// 1.키보드에서 데이터를 입력 받기 위하여 
		// Scanner 클래스를 사용하여 객체 생성
		
		Scanner scan = null; //객체선언
		
		//객체를 생서앟여 초기화하여 인스턴스로 만듬
		scan = new Scanner( System.in);					//생성자를 호출함 그리고 ()안에 system.in하라  
		
		//경고문 -> leak 메모리 관리 잘못되고있다는 경고
		
		
		
		//객체를 선언 및 생성하고 사용할 준비를 하라 분리하지않고 한번에 사용하기
		Scanner scan1 = new Scanner(System.in);
		
		//Scanner 객체(Scanner 클래스를 사용하여 만든 객체)를 사용하여 키보드로 부터 무언가를 입력받도록 대기를 한다.
		//
		//가 . 이 명령이 실행되면 앱은 멈춰있는것처럼 보인다 = > 이상태를 코드 흐름이 blocking 되었다 라고 한다.
		//나 . 정수값을 입력을 하고 Enter키를 누를때까지 마냥 blocking 상태로 대기한다
		//다 .  정수를 입력하고 Enter 를 누르면 입력한 정수 값만 num 변수에 저장해준다 
		int num = scan.nextInt();
		 System.out.println("키보드로 입력한 값 : " +num);
	}
	

}
