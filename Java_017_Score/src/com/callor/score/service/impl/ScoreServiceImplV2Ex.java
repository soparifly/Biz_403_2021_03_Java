package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV2Ex extends ScoreServiceImplV1Ex {

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected String[] subjectList;
	protected Integer[] subScoreList;

	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV2Ex() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		subjectList = new String[] { "국어", "영어", "수학" };
		subScoreList = new Integer[subjectList.length];

	}

	@Override
	public void inputScore() {
		/*
		 * 입력하기
		 */
		Integer intNum = inService.inputValue("학번", 1);
		String strNum = String.format("%03d", intNum);

		String strName = null;
		while (true) {

			System.out.println(strNum + "학생의 이름 입력(QUIT: 입력중단)");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생이름은 반드시 입력하세요");
				continue;
			}
			break;
		}
		// 생성자에 , 과목, 과목수만큼 입력할 점수 배열 선언함
		for (int i = 0; i < subjectList.length; i++) {

			subScoreList[i] = inService.inputValue(subjectList[i], 0, 100);

			if (subScoreList[i] == null) {
				return;
			}

		}
		ScoreVO scoreVO = new ScoreVO();

		scoreVO.setNum(strNum);
		scoreVO.setName(strName);

		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);

		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		// 디버깅 코드 VO에 담긴 데이터확인하기
		scoreList.add(scoreVO);

	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(80));
		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.println(vo.getNum() + "\t");
			System.out.println(vo.getName() + "\t");
			System.out.println(vo.getKor() + "\t");
			System.out.println(vo.getEng() + "\t");
			System.out.println(vo.getMath() + "\t");
			System.out.println(vo.getTotal() + "\t");
			System.out.println(vo.getAvg() + "\n");
		}
		System.out.println("-".repeat(80));
	}

	@Override
	public void saveScore() {
		String fileName = null;
		while (true) {
			System.out.println("저장할 파일의 이름을 입력하세요");
			System.out.print(">> ");
			fileName = scan.nextLine();
			if (fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력해야합니다");
				continue;
			}
			break;
		}
		String strFileName = "src/com/callor/score" + fileName;
		FileWriter fileWriter = null;
		PrintWriter out = null;

		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);

			int nSize = scoreList.size();
			for (int i = 0; i < nSize; i++) {
				ScoreVO vo = scoreList.get(i);
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n", vo.getAvg());
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();

		}

	}

}
