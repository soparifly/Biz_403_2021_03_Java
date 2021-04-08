package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.Subject;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.kimbyulook.standard.InputService;
import com.kimbyulook.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 implements ScoreService {

	InputService isV1;
	List<ScoreVO> scoreList;
	List<ScoreVO> nameList;
	Scanner scan;
	Integer student;
	String name;
	String[] subject;
	int[] kor;
	int[] eng;
	int[] math;
	
	public ScoreServiceV1() {

		isV1 = new InputServiceImplV1();

		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		student = 5;
		subject = new String[] { "국어", "영어", "수학" };
		name = "";
		kor = new int[student];
		eng = new int[student];
		math = new int[student];
		

	}

	@Override
	public void selectMenu() {
		Integer enter1 = 0;
		while (true) {

			System.out.println("=".repeat(50));
			System.out.println("성적입력하는 프로그램");
			System.out.println("=".repeat(50));
			System.out.println("1. 이름입력");
			System.out.println("2. 성적입력");
			System.out.println("3. 입력리스트 출력");

			System.out.println("=".repeat(50));
			System.out.println("QUIT 입력시 종료");
			System.out.print(">>>>>>");

			String enter = scan.nextLine();
			if (enter.equals("QUIT")) {
				return;
			}
			try {
				enter1 = Integer.valueOf(enter);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("정확한 값을 입력해주세요");
				continue;
			}
			if (enter1 == 1) {
				this.inputName();
			} else if (enter1 == 2) {
				this.inputScore();

			} else if (enter1 == 3) {
				this.printScore();

			}

		} // while문 종료

		// TODO

	}

	@Override
	public void inputName() {
		for (int st = 0; st < student; st++) {

			System.out.println("이름을 입력하세요(종료시 : QUIT");
			System.out.print(" >> ");
			try {
				name = scan.nextLine();

			} catch (Exception e) {
				// TODO Auto-generated catch block
//					e.printStackTrace();
				System.out.println("이름만 입력하세요");
				continue;
			}
			if (name.equals("QUIT")) {
				System.out.println("종료");
				return;
			}
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(name);
		scoreList.add(scoreVO);
	}

	@Override
	public void inputScore() {

		
				kor = this.isV1.inputValue(subject[0], 0, 100);
				eng = this.isV1.inputValue(subject[1], 0, 100);
				math = this.isV1.inputValue(subject[2], 0, 100);
				
			ScoreVO scoreVO = new ScoreVO();
		}

	@Override
	public void printScore() {
		for (int i = 0; i < scoreList.size(); i++) {

			System.out.printf("%d  의 성적 ", nameList.get(i));
		}
		// TODO Auto-generated method stub

	}

}
