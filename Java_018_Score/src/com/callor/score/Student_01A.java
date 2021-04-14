package com.callor.score;

import java.io.BufferedReader;
import java.io.FileReader;

public class Student_01A {
public static void main(String[] args) {
	//선언하는 코드와 생성하는 코드를 분리하자
	//FileWirtier, FileReader :파일을 Open
	//PrintWriter, BufferedReader :내요ㅕㅇ을 쓰고 읽는다
	
	
	
	
	FileReader fileReader =null;
	BufferedReader buffer = null;
	
	String fileName = "src/com/callor/score/student.txt";
	
	try {
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		//파일을 무조건 한라인씩 읽음
		/*
		 * ===================================================
		 * while(true) 반복문의 사용
		 * 1. 조건 없이 무한 반복을 수행하는 코드
		 * 2. 무한반복 코드를 수행하는 과정에서 
		 * 		if ()조건문을 추가하여 반복을 중단하기
		 * 3. 무한 반복문에서는 조건을 부여하여 탈출구를 만들때
		 * 		일반적으로 쉽게 구현할수 있는 코드
		 * 4. 단점 if()조건 문이 필요하고 
		 * 	때로는 추가되는 코드가 필요하기도 한다.
		 * 5. 무한 반복코드가 실행되는 동안에 
		 * 		탈출구를 어떻게 만들지 고민해야하고
		 * 6. 다양한 방법의 다양한 조건의 탈출구가 필요할때 적절하게 구현할수 있다
		 * 
		 */
//		while (true) {
//			String reader = buffer.readLine();
//			//파일의 끝에 다다르면 더이상 읽지마라
//			//EOF(End of File )가 되면 reader변수에 Null이 출력된다
//			//reader에 null값이 담겨있다 == 다 읽음
//			if(reader == null) break;
//			//이후에 다른연산처리를함
//			System.out.println(reader);	
//			
//		}		
//	 =======================================
//		reader 가 null이 아닌 값으로 생성하기
		
 /*
  * 	while(조건식) 무한 반복문
  *  1. 무한 반복 코드가 중단되는 조건이 한개만 있을경우
  *  2. 조건식을 어떻게 만들것인가 잘 구상을 해야한다.
  *  3. while (조건식)이 시작되기전에 
  *   최초의 조건식이 true가 되도록 만들어야된다.
  * 4. 적절하게 탈출을 하려면 코드내에서 조건식이 false가 되도록 연산을 수행해야한다
  * 5. 코드 내에서 조건식이 false가 되더라도 
  *		이후의 명령들이 한번씩 실행되고 나서 
  *		탈출이 이루어진다. 
 *	========================================		
 */
		String reader = new String();
		System.out.println("reader"+ reader);
		//최초의 반복문에서 reader!= null은 true가 된다
		//최초의 와일문에서 
		// reader != buffer.readLine()을 실행하고 reader저장된값이 Null인지 비교한다
		//1.read= buffer.readLine()을 실행하고 
		//2. 위의read에 저장된 값을 마치 메서드가 return하는것 처럼 동작한다
//		 3. ()return 하는 값이 null이 아닌가를 비교한다.
//		 4. 그 결과가 true이면 계속 코드를 진행하고 그 결과가 false이면 즉시 while명령이 끝난다
////		while(reader!=null) {
//			reader = buffer.readLine(); 
//			System.out.println(reader); //실행이되는 이유 sysem이 먼저 실행되고 빠져나오기때문
		          
		while((reader = buffer.readLine())!= null) {
			//student 배열은 :을 기준으로 자동으로 분해된 문자열 갯수만큼 생성이되고 
			
			String student[] = reader.split(":");
			
//			reader = buffer.readLine();
			
			System.out.printf("%s\t%s\n",student[1],student[5]);
			//1번 5번을 출력한다
			
			
			
			
			
		}//break가 필요가 없는카드
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		System.out.println(fileName + "파일이 없습니다");
	}
}
}
