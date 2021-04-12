package com.kimbyulook.app.Impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kimbyulook.app.Service.InputService;
import com.kimbyulook.app.Service.MenuService;
import com.kimbyulook.app.Service.ScoreService;
import com.kimbyulook.app.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected MenuService menuService;
	protected InputService inService;
	protected String[] subjectList;
	protected Integer[] subscoreList;
	
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputService();
		subjectList = new String[] {"국어","영어","수학"};
		subscoreList = new Integer[subjectList.length];
		

	}

	@Override
	public void selectMenu() {
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적리스트 출력");
		scoreMenu.add("성적 저장");
		
		menuService = new MenuService("빛고을 고교 성적처리", scoreMenu);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업무종료");
				break;
			}
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.pritnScore();
			} else if (menu == 3) {
				this.saveScore();
			}
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
		Integer intNum = inService.InputValue("학번", 1);
		if(intNum == null) {
			return;
		}
		String strNum = String.format("%03d", intNum);
		
		String strName =null;
		while(true) {
			System.out.println("학생이름을 입력(QUIR:입력중단)");
			strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				break;
			}else if(strName.equals("")) {
				System.out.println("학생이름은 반드시 입력해야합니다");
				continue;
			}
			break;
		}//while end
		for (int i =0; i< subjectList.length;i++) {
			subscoreList[i] = inService.InputValue(subjectList[i], 0, 100);
			if(subscoreList[i] == null) {
				return;
			}
			
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(subscoreList[0]);
		scoreVO.setEng(subscoreList[1]);
		scoreVO.setMath(subscoreList[2]);
		scoreVO.setKor(subscoreList[국어]);
		scoreVO.setEng(subscoreList[영어]);
		scoreVO.setMath(subscoreList[수학]);
		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		scoreList.add(scoreVO);
	}

	@Override
	public void pritnScore() {
		// TODO Auto-generated method stub
		System.out.println("빛고을 고교 성적리스트 2021");
		System.out.println("=".repeat(80));
		System.out.print("학번 \t");
		System.out.print("이름 \t");
		
		for(int index = 0; index <subjectList.length; index++) {
			System.out.println(subjectList[index] +"\t");
			
		}
		System.out.println("총점 \t");
		System.out.println("평");
		System.out.println("-".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0; i<nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.println(vo.getNum()+"\t");
			System.out.println(vo.getName()+"\t");
			System.out.println(vo.getKor()+"\t");
			System.out.println(vo.getEng()+"\t");
			System.out.println(vo.getMath()+"\t");
			System.out.println(vo.getTotal()+"\t");
			System.out.println(vo.getAvg()+"\t");
		}
		System.out.println("=".repeat(80));
	}

	@Override
	public void saveScore() {
			while (true) {
				System.out.println( "성적리스트 저");
				System.out.println("저장할 파일이름을 입력하세요");
				System.out.print(" >> ");
				String strFileName = scan.nextLine();
				if(strFileName.equals("")) {
					System.out.println("파일이름을 입력해야 합니다.");
					continue;
					
				}
				
				FileWriter fileWriter = null;
				PrintWriter out = null;
				
				strFileName = "src/com/byulook/app/"
						+strFileName
						+".txt";
				
				
				
				try {
					fileWriter = new FileWriter(strFileName);
					out = new PrintWriter(fileWriter);
					int nSize = scoreList.size();
					
					for(int i =0; i<nSize; i ++) {
						ScoreVO vo = scoreList.get(i);
						out.print(vo.getNum()+ ",");
						out.print(vo.getName()+ ",");
						out.print(vo.getKor()+ ",");
						out.print(vo.getEng()+ ",");
						out.print(vo.getMath()+ ",");
						
					}
					out.flush();
					out.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					System.out.println("파일을 생성할수 없습니다.");
					System.out.println("파일 이름을 다시입력해주세요");
					continue;
					
					//맥에서 주소형성하는 방법확인하고 파일이 안만들어지는 이유를 물어보
				}
				return;
					
			}//while end
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
