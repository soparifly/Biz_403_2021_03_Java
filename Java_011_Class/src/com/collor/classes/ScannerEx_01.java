package com.collor.classes;

/* 입력한 데이터의 유형이 잘못됨
 * Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at Java_011_class/com.collor.classes.ScannerEx_01.main(ScannerEx_01.java:15)

 */
import java.util.Scanner;

public class ScannerEx_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);



			System.out.println("숫자 2개를 입력하세요");
			int intNum1 = 0;
			int intNum2 = 0;
			
			/*
			 *try - catch block 명령문
			 *코드가 실행되는 과정에서
			 *어떠한 이유든지 예외가 발생할 것으로 예측이되면
			 *try - catch block을 사용하여 "예외처리"를 수행한다
			 *예외 처리 
			 *exception이 발생하여 코드가 중단되는 것을 방지하는 기법
			 *exception이 발생하면 코드가 중단되면서 
			 *현재 기억장치(변수, 배열에 )저장된 모든데이터는 소멸되어버린다
			 *exception이 발생했을때 사용자에게 exception이 발생했음을 알려주고 그상황을 피해서 다시 코드진행이 계속되도록 하는기법
			 *예외가 발생할것같은 코드들을 try {} block에 작성을 하고 , 실행을 하면 만약 exception이 발생했을때 catch이 exception을 잠시 잡고있는 상황이된다.
			 *catch  { } block exception 발생했을때 사용자에게 알려주는 메시지 등을 보여주거나 다른코드를 사용하여 처리할수 있으면
			 *처리를 하고 코드가 다시진행되도록 한다
			 */
			 try {
			 System.out.print("숫자 >> ");
				intNum1 = scan.nextInt();

//				System.out.print("숫자2 >>");
//				intNum2=scan.nextInt();
//				System.out.printf("%d x %d =%d", intNum1, intNum2, intNum1 * intNum2);
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
			}
			System.out.println("입력된 숫자 "+intNum1);

		

	}
}
