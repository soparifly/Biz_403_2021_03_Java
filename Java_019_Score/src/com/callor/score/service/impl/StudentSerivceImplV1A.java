package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentSerivceImplV1A implements StudentService {
	protected List<StudentVO> studentList;
	protected String studentFile;
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;

	/*
	 * new StudentServiceImplV1()생성자를 호출하여 객체를 생성하려고 하면 고정된 파일
	 * 이름(" "src/com/callor/score/student.txt")을 사용하여 파일을 읽을 수 있도록 할예정이다. this :
	 * 자기자신과 이름이 같은데 문자열을 매개변수로 가진 명령어
	 * 
	 * 
	 * 생성자에서는 new StudentServiceImplV1("파일명")의 생성자 메서드를 다시 호출하는 구조가된다.
	 * 
	 * 
	 */
	public StudentSerivceImplV1A() {
		// new StudentServiceImplV1a ("src/com/callor/score/student.txt"); 아래와 내용이 같음
		this("src/com/callor/score/student.txt");
	}

	public StudentSerivceImplV1A(String fileName) {
		this.studentFile = fileName;
		studentList = new ArrayList<StudentVO>(); // 위의 생성자는 아래의 생성자를 호출한다 위의생성자에해당 객체를 만들면 다시 이생성자를 호출할때 한번더 불러주어야하기때문에
		// 위생성자에 선언은 의미가 없어서 아래에다가 한다
		// 클래스를 객체로 생성할때 바로 메서드를 호출하여
		// 데이터를 사용하도록 준비해달라.
		this.loadStudent();

	}

	@Override
	public void inserStudent() {
		// TODO Auto-generated method stub

	}

	/*
	 * student.txt 파일에서 학생정보를 읽어 studnetList에 데이터준비하기
	 */
	@Override
	public void loadStudent() {

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);
			while (true) {
				String reader;

				reader = buffer.readLine();
				if (reader == null)
					break;
				String[] sts = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(sts[학번]);
				studentVO.setName(sts[이름]);
				studentVO.setGrade(sts[학년]);
				studentVO.setDept(sts[학과]);
				studentVO.setAddress(sts[주소]);

				// debuging code
				System.out.println(studentVO.toString());
				studentList.add(studentVO);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			System.out.println(this.studentFile + "파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//					e.printStackTrace()
			System.out.println("파일을 읽는동안 문제발생!!");
		}
		// 파일로 부터 읽은 값이 null
		// EOF(End of File)에 다다랏다
	}

	// TODO Auto-generated catch block
//			e.printStackTrace();

	// TODO Auto-generated method stub

	@Override
	public StudentVO getStudent(String num) {
		// 1번코드
		int nSize = studentList.size();
		for (int i = 0; i < nSize; i++) {
			// StudentVO vo = null;
			// vo = studentList.get(i)
			StudentVO vo = studentList.get(i);
			if (vo.getNum().equals(num)) {
				return vo;
			}
		}

		// 2번 코드
		// 새로운 for, forEach
		for (StudentVO vo : studentList) {
			if (vo.getNum().equals(num)) {
				return vo;
			}
			return null;

		}

		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		int nSize = studentList.size();
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t학과\t학년\t주소/n");
		System.out.println("-".repeat(50));
		/*
		 * <nSize> 배열을 사용하여 for()반복문을 구현할때는 배열.length 속성을 직접 반복문의 조건으로 설정한다 i<배열.length
		 * List객체는 특성상 수시로 데이터의 갯수가 변경된다 List에 담긴 갯수를 알려주는 size() method는 호출 될때마다 List에
		 * 담긴 데이터 갯수를 다시 헤아리는 코드가 실행된다 for ()반복문 내에서 i< List.size() 코드를 사용하면 for 문이
		 * 반복되는동안 계속해서 갯수를 헤아리게 된다 데이터의 갯수가 몇개 안될때는 큰문제가 없지만 데이터 갯수가 많아지만 그만큼 성능이 떨어진다
		 * 
		 * List전체를 for 반복문을 사용하여 순회할때는 먼저 size값을 int변수에 담아놓고 시작하자
		 */
		for (int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getAddress() + "\t");
		}
		System.out.println("=".repeat(50));

	}

}
