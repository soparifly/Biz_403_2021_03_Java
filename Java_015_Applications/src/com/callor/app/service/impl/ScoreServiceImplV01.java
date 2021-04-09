package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.kimbyulook.standard.InputService;
import com.kimbyulook.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV01 implements ScoreService {

	InputService isV1;
	List<ScoreVO> nameList;
	List<ScoreVO> scoreList;
	Scanner scan;
	Integer student;
	String[] subject;
	Integer kor;
	Integer eng;
	Integer math;
	String name;

//	ScoreVO scoreVO;
	public ScoreServiceImplV01() {

		isV1 = new InputServiceImplV1();

		scoreList = new ArrayList<ScoreVO>();
		nameList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		student = 5;
		subject = new String[] { "국어", "영어", "수학" };
//		scoreVO = new ScoreVO(); 생성자에 클래스를 인스턴스선언을 하면 마지막 추가된 배열의값만 인식한다
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
//					e.printStackTrace();
				System.out.println("이름만 입력하세요");
				continue;
			}
			if (name.equals("QUIT")) {
				System.out.println("종료");
				return;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setName(name);
			nameList.add(scoreVO);
		}
	}

	@Override
	public void inputScore() {
		for (int index = 0; index < student; index++) {

			System.out.println(nameList.get(index).getName() + "의 성적을 입력하세요");
			kor = this.isV1.inputValue(subject[0], 0, 100);
			eng = this.isV1.inputValue(subject[1], 0, 100);
			math = this.isV1.inputValue(subject[2], 0, 100);

			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(kor);
			scoreVO.setEng(eng);
			scoreVO.setMath(math);
			scoreList.add(scoreVO);
		}
	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("이름\t국어\t수학\t영어\n");
		System.out.println("-".repeat(50));

		for (int st = 0; st < student; st++) {
			//student였을때는 null값이 출려됬으나 size로 바꾸니 잘됨
			//이름값이 출력된후 , 점수값이 다섯번이 따로 출력되는지 의문

			System.out.print(nameList.get(st).getName() + "\t");
			System.out.print(scoreList.get(st).getKor() + "\t");
			System.out.print(scoreList.get(st).getEng() + "\t");
			System.out.print(scoreList.get(st).getMath() + "\n");
			// TODO Auto-generated method stub
		}
//	  	어레이배열은 클래스 인스턴스를 한번 초기화를 해주고 목록을 배열이름.add()를 이용하여 추가한다
//		-> 어레이배열이름.add(이용하고자하는 클래스);
//		호출하는 메서드가 달라질때 클래스 인스턴스를 새로 만들면 메서드의 주소가 초기화되기때문에
// 		get으로 동일한 어레이 배열을 출력하면 (출력시 같은 어레이배열을 get하면 )
//		메서드가 따로따로 호출하기 때문에 값이 null로 발생한다
//		해결방법 : ArrayList를 이름목록(nameList)과 점수목록(scoreList)을 따로 선언해주되 
//		호출할때는 필요한 어레이 배열을 같은 메서드안에서 불러도 상관없다
//		필요한 어레이는 []배열처럼 첨자값에따라 저장된 값의 순서를 알수있다 
//		출력시 for반복문을 이용해 어레이 리스트에 저장한 갯수만큼 size를 지정해주고
//		저장한배열명.get(size값).(VO서비스에 저장된)get메소드() 를 입력하면 프린트 출력문으로 출력이 가능하다

		System.out.println("=".repeat(50));
	}
}