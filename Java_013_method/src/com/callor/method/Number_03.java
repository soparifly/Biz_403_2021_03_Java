package com.callor.method;

import java.util.Scanner;

public class Number_03 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("정수를 입력하세요");
	System.out.println("QUIT 는 종료하기" );
	System.out.println(" >> ");
	String strInput = scan.nextLine();
	
	//trim(): 문자열 앞, 뒤에 붙은 whitespace를 제거하는 method
	//strInput의 내부에 whitespace를 제거함
	//객체의 chaining
	//입력된 문자열에 혹시 있을지 모를 whiteSpace를 제거하고 입력 문자열이 QUIT인가를 검사하는 코드
	strInput = strInput.trim();
	strInput.equals("QUIT");
	if(strInput.trim().equals("QUIT")){
		System.out.println("종료 합니다.");
	}//위의 문장을 풀어서 쓸경우 
	else {
		
		
		try {
			
			/*
			 * <예외처리>
			 * Integer.valueOf(문자열) 코드가 실행되는동안
			 * NumberFormatException이 발생하면 코드가 중단되는데
			 * 코드를 중단하지않고, 사용자에게 메시지등을 전달하고 적절한
			 * 연산 코드를 추가하여 코드가 계속 진행되도록 조치  
			 * 예외 처리 코드는 개발자에게 상당히 불필요한 코드를 추가하여 부담을 주는 것일수 있다
			 * 하지만 , 적절한 예외처리를 해준 코드는 EndUser(실제 사용자)에게에게 
			 * 불편함을 최소한으로 주는 적절한 방법이다
			 * 
			 *  End User에게 좋은 코드를 작성하는 개발자는
			 *  결국 좋은 개발자가 된다.
			 */
			int intNum = Integer.valueOf(strInput);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(); //원래라면 이명령문의 값을 출력하고 종료가되야하나
			// 아래와같은 문자열을
			System.out.println("숫자가 아닌값을 입력하였음");
			System.out.println("숫자로 변환하는 동안 오류");
		}
		
	}
	
}
}
