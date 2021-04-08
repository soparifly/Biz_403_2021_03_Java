package com.callor.method;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.service.InputServiceV2;
import com.callor.model.ScoreVO;

/*
 * 데이터를 입력(키보드, random, 파일, 인터넷)
 * 				데이터를 VO에 담고
 * 입력된 데이터를 List에 추가
 * 연산을 수행
 * 다시 List 저장
 * 데이터를 읽어서
 * 				List에서 추출하여 VO에 담고
 * 출력
 */
public class ScoreService6A {

	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2; // final키워드를 부착한 변수 = 상수
	// 상수 = > 한번 저장된 값을 변경할수 없는 특별한 변수

	protected String[] subject;
	protected List<ScoreVO> scoreList;
	protected InputServiceV2 inService;

	public ScoreService6A() {
		subject = new String[] { "국어", "영어", "수학" };
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceV2();

	}

	public void inputScore() {
		for (int i = 0; i < 5; i++) {
			Integer[] scores = new Integer[subject.length];

			for (int sb = 0; sb < subject.length; sb++) {
				scores[i] = inService.inputValue(subject[i], 0, 100);
			}
			 
			if (scores[i] == null) {
				return;
			}
			ScoreVO scoreVO = new ScoreVO();
			int sbIndex = 0;

			scoreVO.setKor(scores[this.국어]);
			scoreVO.setEng(scores[영어]);
			scoreVO.setMath(scores[수학]);
			scoreList.add(scoreVO);
		}

	}

	public void inputScore1() {
		for (int st = 0; st < 5; st++) {
			Integer intKor = inService.inputValue("국어", 0, 100);
			if (intKor == null) {
				return;
			}
			Integer intEng = inService.inputValue("영어", 0, 100);
			if (intKor == null) {
				return;
			}
			Integer intmath = inService.inputValue("수학", 0, 100);
			if (intKor == null) {
				return;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intmath);
			scoreList.add(scoreVO);
		}
	}

	public void printScore() {
		int nSize = scoreList.size();

		System.out.println("=".repeat(50));
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + "\t");

		}
		System.out.println();

		for (int i = 0; i < nSize; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.println(scoreVO.getKor() + "\t");
			System.out.println(scoreVO.getEng() + "\t");
			System.out.println(scoreVO.getMath() + "\t");
		}
	}
}
