package com.callor.score;

import java.io.FileReader;

public class FileReader_01 {
	public static void main(String[] args) {

		String fileName = "src/com/callor/score/sample_score.txt";

		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			/*
			 * read() method 를 실행하면 어떤 값을 읽어서
			 * int 형의 데이터를 return하도록 만들어져있다.
			 */
			int result = fileReader.read();
			//정수 값에 해당하는 ascII코드를 갖는 문자로 바꾸어서 보여달라
			// 현재 열린 파일에서 1byte를 읽어서 
//			ASCII코드로 retrun하는 method
			
			System.out.println(result);
			
			fileReader.close();
			
			System.out.printf("%c",result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
