package com.callor.app;

import java.util.List;
import java.util.Scanner;

import com.collar.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {
 // 인터페이스를 implements했을때 나타나는 형태에대해서..문제가나옴
	
	
	private List<ScoreVO> scoreList;
	private Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList = ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	
	}
	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
	}

}
