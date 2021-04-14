package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {

	public static void main(String[] args) {

		FileReader fileReader = null;
		BufferedReader buffer = null;

		String fileName = "src/com/callor/score/word.txt";

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			String reader; //문자열 reader초기화
			while (true) {

				try {
					reader = buffer.readLine(); //한줄 읽음
					if (reader == null) {
						break;
					}//더이상 읽을 내용없으면 null 이면 멈춤
					
					String word[] = reader.split(":"); //:기준으로 배열[0],배열[1] 생성함
					System.out.printf("%s %s\n",word[0],word[1]); //스트링 형식 배열[0],배열[1]

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
