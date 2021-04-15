package com.callor.score;

import com.callor.score.model.StudentVO;

public interface StudentService {

	public void intsertStudent();
	public void loadStrudent();
	public StudentVO getStudent(String num);
	public void printStudent();
	public void insertScore();
	
	
}
