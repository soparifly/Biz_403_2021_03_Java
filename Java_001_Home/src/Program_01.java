import java.util.Scanner;
/*
 * 계산기 만들
 * 
 * 계산기에 숫자를 입력하때는 초기값을 숫자로만 받고
 * 이후에 받은 숫자값을 문자열 값으로 형변환하여 계산식에 대입한다
 * 이유는 입력후 enter를 쳤을때 enter친것까지 모두문자열로 인식하기때문
 * 인셉션이 발생한다.
 * 
 * 
 *
 */
public class Program_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int num1 = 0;
		String strNum1 ="";
		
		int num2 = 0; 
		String strNum2 = "";
		
		Integer intEnter = 0;
		String strEnter = "";
		
		
		System.out.println("숫자를 입력하세요");
		System.out.print( " >>  ");
		strNum1 = scan.nextLine();
		num1 = Integer.valueOf(strNum1);
		
	
		System.out.println("연산식 ? : + , - , * , /"); 
		System.out.println(" >> ");
		strEnter = scan.nextLine();
		try {
			intEnter = Integer.valueOf(strEnter);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		System.out.println("사칙연산의 값만 입력해주세요");
		}
		
				
		
		
		System.out.println("두번째 숫자를 입력하세요");
		System.out.print(" >>  ");
		strNum2 = scan.nextLine();
		num2 = Integer.valueOf(strNum1);

		System.out.println("결과값은 ?");
		System.out.print("     --->    ");
		if(strEnter.equals("+")) {
			int sum = num1 + num2;
			System.out.println(sum);
		} else if(strEnter.equals("-")) {
			int minus = num1 - num2;
			System.out.println(minus);
		} else if(strEnter.equals("*")) {
			int multi = num1 * num2; 
			System.out.println(multi);
		}else if(strEnter.equals("/")) {
			Float division = (float)num1 / num2;
			System.out.println(division);
		}
		
		 
		
	}
}
