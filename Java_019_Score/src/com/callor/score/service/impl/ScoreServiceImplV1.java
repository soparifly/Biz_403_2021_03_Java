package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoresService;

public class ScoreServiceImplV1 implements ScoresService {
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 학과 = 5;
	protected List<StudentVO> studentList;

	@Override
	public void insertScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadScore() {
		FileReader fileReader = null;
		BufferedReader buffer = null;
	 
		String fileName = "src/com/callor/score/student.txt";
		
		try {
			fileReader = new FileReader(fileName);
			
			buffer =new BufferedReader(fileReader);
			while(true) {
			}//while end
				
			String reader ;
				reader = buffer.readLine();
				if(reader == null) break;
				String infoList[] = reader.split(":");
				System.out.println("=".repeat(50));System.out.printf("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균\t");
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

	@Override
	public void printStudent() {

	}

}
