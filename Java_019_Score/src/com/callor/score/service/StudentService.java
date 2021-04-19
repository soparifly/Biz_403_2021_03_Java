package com.callor.score.service;

import com.callor.score.model.StudentVO;
public interface StudentService {
	
	public void inserStudent();
	public void loadScore();
	//학번으로 학생정보를 받아 검색하여 (조회하여)
//	 학생 정보가 담긴 VO를 return하는 메소드
	public StudentVO getStudent(String num);
	public void printScore();
	
	

}
