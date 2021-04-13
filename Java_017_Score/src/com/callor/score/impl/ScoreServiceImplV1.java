package com.callor.score.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.kimbyulook.standard.InputService;
import com.kimbyulook.standard.MenuService;
import com.kimbyulook.standard.impl.InputServiceImplV1;
import com.kimbyulook.standard.impl.MenuServiceImplV1;

/*
 * 프로젝트를 생성하고 자신의 JDK를 추가하고 
 * InputValue,MenuService클래스를 사용하여 작성
 * 016 프로젝트의 scoreVO클래스,  ScoreService인터페이스를 참조하여 VO와 interface를 작성
 * ScoreService interface implements하여 클래스 작성
 * 
 * seletMenu() method 작성
 * title : 대한 고등학교 성적처리 시스템 2021
 * menuList
 * 1.학생정보등록, 2성적등록
 * 3. 성적정보 열기	4. 성적정보 저장
 * 5.성적정보 출력
 */
public class ScoreServiceImplV1 implements ScoreService {
	protected InputService inService;
	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected List<String> menuList;
	protected List<ScoreVO> nameList;
	protected Scanner scan;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {

		menuList = new ArrayList<String>();
		menuList.add("1.학생정보 등록");
		menuList.add("2.성적 등록");
		menuList.add("3.성적정보 열기");
		menuList.add("4. 성적정보 저장");
		menuList.add("5. 성적 정보 출력");
		menuService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", menuList);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				break;
			} else if (menu == 1) {
				this.studentInfo();
			} else if (menu == 2) {
				this.inputScore();
			} else if (menu == 3) {
				this.readScore();
			} else if (menu == 4) {
				this.saveScore();
			} else if (menu == 5) {
				this.printScore();
			}
		}

	}

	private void studentInfo() {
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if(intNum == null) {
				return;
			}
			
		} // while end
	}

	@Override
	public void inputScore() {
		System.out.println("");

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
