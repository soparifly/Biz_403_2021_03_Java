package com.coller.classes;
/*
 * Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at Java_010_Class/com.coller.classes.service.Values_02.main(Values_02.java:10)

 */
import java.util.Scanner;

public class Values_02 {
public static void main(String[] args) {
/*
 * null값
 * 프로그래밍, 정보처리에서는 어떤 항복의 데이터가 있는가 없는가를 판단해야하는 경우가 있다.
 * 
 * 문자열의 경우는 값이 없는 경우를 ""으로 표현할수 있다
 * 숫자일 경우 일반적으로 0이라는 값을 없는 값으로 표현하기도한다
 * 
 * if (변수 == 0 ): 없다 라는 표현을 사용할수 있다.
 * 실제로 어떤 값이 0인 값을 갖는지, 
 * 아니면 아무것도 없어서, 0인지 구별을 할수 없다
 *  
 *  null 값을 사용하여 실제로 아무것도 없는 상태를 표현한다.
 *  
 *  	java primitive type의 변수들은 null 을 저장할수 없다
 *  wrapper class를 사용하여 선언된 변수는 null값을 저장할수있다.
 *  
 *  
 *  
 */
	Scanner scan = new Scanner(System.in);
//	키보드에서 숫자를 입력하고 Enter를 누르면 값이 num변수에 저장되고 다음코드가 실행됨
//	Integer num = scan.nextInt();
//	System.out.println(num);
	
//	키보드에서 문자열을 입력하고 Enter를 누르면 값이 str변수에 저장되고 다음코드가실행
//	그냥 Enter키만 입력해도 종료하고 다음코드가 실행된다 (begu
	System.out.println("숫자1>>");
	String str1 = scan.nextLine();
	if(str1 == "") {//""문자열 변수의 null값과 유사한 성격을 갖는 값
		System.out.println("아무것도 없는값 입력");
	}
	System.out.println("숫자2>>");
	String str2 = scan.nextLine();
	
	Integer num1 = Integer.valueOf(str1);
	Integer num2 = Integer.valueOf(str2);
	
	System.out.println(num1 + num2);
	
	if(num1 ==0 ) {
		System.out.println("num1 변수에 0이라는 값이 담겨있다");
		
	}
	if (num1== null) {
		System.out.println("num1 변수에 값이 없다");
	}
	
	
	
	
}
}
