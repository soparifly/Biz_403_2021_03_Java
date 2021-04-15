package com.callor.score.service;

import com.callor.score.service.impl.StudentSerivceImplV1A;

public class StudentEx_01 {
	public static void main(String[] args) {
		
		//기본값으로 설정된 파일을 사용하여진행
		StudentService stService = new StudentSerivceImplV1A();
		//st.txt파일을 사용하여 객체생성 진행
		stService.getStudent(null);
	}
}
