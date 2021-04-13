package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/sample_score.txt";	
		
		
		//파일을 읽기 위해서 open하는 클래스
		//OS에게 파일을 읽을 수 있도록 허락해달라는 요청을한다.
		FileReader fileReader = null;
		
		//FileReadr가 open해놓은 파일에서 
		//데이터를 읽어서 버퍼라고 하는 임시기억장소에 저장해놓는다.
		BufferedReader buffer = null;
		
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
//			파일에 저장된 데이터의 라인수를 알때는 
//			for문을 사용하여 읽어낼수 있다 
//			for (int i = 0; i < 30 ; i++) {
			/*
			 * buffereredReader.readLise()mehtod를 실행하면 buffer에 저장된 데이터를 한 라인씩
			 * 읽어서 String 에 저장할수 있다.
			 * 
			 * 매번 호출될때마다 자동으로 다음라인을 읽어서
			 * String 로 리턴을 한다.
			 * 만약 readline메서드를 데이터 샛수만큼 반복하면 모든 데이터를 읽을수 있다.
			 * 하지만 이방법은 데이터의 갯수를 정확히 알아야만 실행할수 있다.
			 * 
			 * 데이터의 갯수를 정확하게 모를때는 어쩔수 없이 
			 * while문을 이용해야할텐데 읽을 내용이없을때는 null값만 호출한다
			 * 
			 * while문을 실행할때는 중간에 탈출구를 고려해야한다.
			 * 
			 * 마찬가지로 readLine()로 탈출할수 있는 방법을 알려주는데
			 *  만약 더이상 읽을 데이터가 없을때는 readLine()이 null값을 return한다.,			 */
			while(true) {
				
				String str = buffer.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
				
//			}
//			System.out.println(buffer.readLine());
//			System.out.println(buffer.readLine());
//			System.out.println(buffer.readLine());

//			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	}
	
}
