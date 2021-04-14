package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;

public class Student_01 {

	public void readScore() {

		String readFile = "src/com/callor/score/student.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		List<StudentVO> studentList = new ArrayList<StudentVO>();
		String reader;
		try {
			
			fileReader = new FileReader(readFile);
			buffer = new BufferedReader(fileReader);
			while (true) {
				reader = buffer.readLine();

				if (reader == null)
					break;
				// if 명령문 한줄만있음

				String[] student = reader.split(":");
				Integer nums = Integer.valueOf(student[0]);
				String name = student[1];
				Integer grade = Integer.valueOf(student[2]);
				Integer classNums = Integer.valueOf(student[3]);
				String department = student[4];
				String address = student[5];

				StudentVO studentVO = new StudentVO();
				studentVO.setNums(nums);
				studentVO.setName(name);
				studentVO.setGrade(grade);
				studentVO.setClassNums(classNums);
				studentVO.setDepartment(department);
				studentVO.setAddress(address);
				studentList.add(studentVO);
			}
			buffer.close();

			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//익셉션은 하나만있어도되나 실제 사용자가 익셉션이 발생했을때 
		// 정확히 원인을 알수 없다 
		// 하위 상세익셉션을 하나 더 만들어주는 것이 좋다

	}
}
