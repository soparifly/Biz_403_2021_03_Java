package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FileWriter_01 {

	
public static void main(String[] args) {
	System.out.println("출력");
	// 메모리에저장된 데이터를 console에 출력할떄
	
	
	
	// 키보드로 데이터를 입력받기위해서
	Scanner scan = new Scanner(System.in);
	// scan.nextLIne();
	
	
	//임으의 숫자를 만들기 위해서 
	Random rnd = new Random();
	rnd.nextInt(100);
	
	
	// 파일에 저장하기
//	1. 어디에 어떤파일로 저장할까
	String fileName = "src/com/callor/app/mydata.txt";
//	2. 무엇을 사용하여,두개의객체를 선언!!
	
	FileWriter fileWriter = null;
	PrintWriter out = null;
	
//	3. 파일에 데이터를 기록하기 위하여 파일을 만들어라
	//새로운파일을생성하라
//	만약 이미 있으면 지우고 다시 만들어라
	try {
		
		fileWriter = new FileWriter(fileName);
		 out = new PrintWriter(fileWriter);
		 
		 out.println("대한민국만세");
		 out.printf("%d x %d = %d\n",3,4, 3*4);
		 out.print("우리나라만세");
		 
		 out.flush();
		 out.close();
		 System.out.println("저장 완료");
		 
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}	

	
	
	
}
