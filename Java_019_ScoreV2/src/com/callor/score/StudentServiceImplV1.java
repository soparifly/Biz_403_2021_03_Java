package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;

public class StudentServiceImplV1 implements StudentService {

	protected final int 번호 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
	protected List<StudentVO> studentList ;
	public StudentServiceImplV1() {
		// TODO Auto-generated constructor stub
		this.loadStrudent();
		 studentList = new ArrayList<StudentVO>();
	}

	@Override
	public void intsertStudent() {
	}

	@Override
	public void loadStrudent() {
		String readFile = "src/com/callor/score/student.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		String reader;

		try {
			fileReader = new FileReader(readFile);
			buffer = new BufferedReader(fileReader);
			while (true) {
				try {
					reader = buffer.readLine();
					if (reader == null)
						break;

					String[] student = reader.split(":");
					String num = (student[번호]);
					String name = (student[이름]);
					String grade = (student[학년]);
					String dept = (student[학과]);
					String address = (student[주소]);

					StudentVO studentVO = new StudentVO();
					studentVO.setNum(num);
					studentVO.setName(name);
					studentVO.setGrade(grade);
					studentVO.setDept(dept);
					studentVO.setAddress(address);
					studentList.add(studentVO);
					buffer.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					System.out.println("파일에서 데이터를 읽는 중 문제발생");
				}
			} // while end
//			System.out.println(studentList.toString());
			


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일을 여는 동안 문제발생 ");
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printStudent() {
//		// TODO Auto-generated method stub
//		System.out.println("=".repeat(50));
//		System.out.println("학번\t이름\t학년\t학과\t주소\n");
//		int nSize = studentList.size();
//		for (int i= 0; i< nSize; i++) {
//			System.out.println(studentList.get(i));
//			
//		}
	}

}
