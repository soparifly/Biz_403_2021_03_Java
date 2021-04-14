package com.callor.score.service.impl;

import java.util.List;

import com.callor.score.model.ScoreVO;
import com.kimbyulook.standard.InputService;

/*
 * 1.ScoreServiceImplV1을 상속받고
 * 2. inputScore()method를 작성
 * 3. 학번, 학생이름, 3과목 성적을 입력 받아
 * List<ScoreVO> scoreList 객체에 추가
 */
public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected InputService inService;
	protected List<ScoreVO> scoreList;
	protected String[] subjectList = new String[] { "국어", "영어", "수학" };
	protected Integer[] subScoreList = new Integer[subjectList.length];
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	@Override
	public void inputScore() {
		Integer intNum = inService.inputValue("학번",1);
		if(intNum == null) {
			return;
		}
		
		String strNum = String.format("%03d",intNum	);
		
		String strName = null;
		
		while (true) {
			
			System.out.println(strNum + "학생의 이름 입력 (QUIT: 입력취소)");
			System.out.print(" >> ");
			strName = scan.nextLine();

			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}
			break;
		}
		for (int i = 0; i < subjectList.length; i++) {
			subScoreList[i] = inService.inputValue(subjectList[i], 0, 100);

			if (subScoreList[i] == null) {
				return;
			}
		ScoreVO scoreVO = new ScoreVO(); //score 인스턴스 생성
		scoreVO.setName(strName); 
		scoreVO.setNum(strNum);
		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);

		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		scoreList.add(scoreVO);

		} // while end
	}

	private String strNum() {
		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return null;
		}
		String strNum = String.format("20201%03d", intNum);
		return strNum;
	}

}
