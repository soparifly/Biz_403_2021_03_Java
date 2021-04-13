package com.callor.score;

import java.io.FileReader;

public class FileReader_02 {
	public static void main(String[] args) {

		String fileName = "src/com/callor/score/sample_score.txt";

		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			for(;;) {
				/*
				 * read() method는
				 * fileReader로 열린 파일에서
				 * 한 byte씩 데이터를 읽어서
				 * ASCII코드 값으로 return한다.
				 */
				int result = fileReader.read();
				System.out.printf("%c",result);
				
			}
//			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
