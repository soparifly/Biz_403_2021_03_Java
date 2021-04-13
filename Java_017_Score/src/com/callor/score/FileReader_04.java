package com.callor.score;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader_04 {
	public static void main(String[] args) {

		String fileName = "src/com/callor/score/sample_score.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				System.out.println(reader);
			}
			buffer.close(); //끝난다음에는 항상 close
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
