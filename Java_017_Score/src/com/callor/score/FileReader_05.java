package com.callor.score;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader_05 {
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
				/*
				 * 문자열.split("기준문자열")
				 * 문자열에 저장된 값을 기준문자열로 나누어 문자열 배열로 만들어주는 method
				 */
				String[] score = reader.split(":");
				System.out.printf("학번 :%s, 국어:%s, 영어%s, 수학%s\n",
				score[0],score[1],score[2],score[3]);
				
				
				int intKor = Integer.valueOf(score[1]);
				int intEng = Integer.valueOf(score[2]);
				int intMath = Integer.valueOf(score[3]);
				
				int sum = intKor + intEng + intMath;
			}
			buffer.close(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
