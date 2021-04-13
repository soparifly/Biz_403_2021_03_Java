package com.callor.app.service.Impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.Values;
import com.kimbyulook.standard.InputService;
import com.kimbyulook.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV2Ex extends ScoreServiceImplV2 {

	protected InputService inService;
	protected String[] subjectList;
	protected Integer[] subScoreList;
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	// 과목명, 과목점수가 담긴 배열에 대한 첨자값을 숫자로 사용하지 않고 명명된 이름으로 사용하기 위하여
	// 배열의 INDEX값을 상수로 선언해 둔다.
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV2Ex() {
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		// 입력받을 과목명을 배열 요소로 선언하고
		// 과목수 만큼 점수를 저장할 배열 선언
		subjectList = new String[] { "국어", "영어", "수학" };
		subScoreList = new Integer[subjectList.length];

	}

	@Override
	public void inputScore() {

			Integer intNum = inService.inputValue("학번", 1);
			
			
			
		if (intNum == null) {
			return;
		}
		// 1 을 출력할때 001로 만들어라
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

		scoreVO.setKor(subScoreList[Values.국어]);
		scoreVO.setEng(subScoreList[Values.영어]);
		scoreVO.setMath(subScoreList[Values.수학]);

		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		// 디버깅 코드 VO에 담긴 데이터확인하기
		scoreList.add(scoreVO);
	}

	@Override
	public void printScore() {

		System.out.println("빛나라 고교 성적리스트 2021");
		System.out.println("=".repeat(80));
		System.out.print("학번\t");
		System.out.print("이름\t");
		for (int index = 0; index < subjectList.length; index++) {
			System.out.println(subjectList[index] + "\t");

		}
		System.out.print("총점\t");
		System.out.print("평균");
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
			System.out.println(vo.getAvg() + "\t");
		}
		System.out.println("=".repeat(80));
	}

	@Override
	public void saveScore() {

		while (true) {

			System.out.println("성적리스트저장");
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(" > > ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일 이름을 입력해야합니다");
				continue;
			}

			FileWriter fileWriter = null;
			PrintWriter out = null;
			strFileName = "" + strFileName;
			strFileName = "src/com/callor/app/" + strFileName + ".txt";
			try {
				fileWriter = new FileWriter(strFileName);

				out = new PrintWriter(fileWriter);

				int nSize = scoreList.size();
				/*
				 * 파일에 저장할때 각 데이터를 컴마(,로 구분하여 입력하고 파일이름을 
				 * *.csv로 저장하면 excel에서 파일을 읽을수있다 csv
				 * :comma -separated -variables 컴마로 값을 구분한 파일
				 */
				for (int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					out.println(vo.getNum() + ",");
					out.println(vo.getName() + ",");
					out.println(vo.getKor() + ",");
					out.println(vo.getEng() + ",");
					out.println(vo.getMath());
				}

				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("파일을 생성할 수 없습니다");
				System.out.println("파일 이름을 다시 입력해 주세요");
				continue;

			}

		}

	}

}
