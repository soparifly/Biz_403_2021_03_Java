package com.callor.method;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.service.InputServiceV2;
import com.callor.model.ScoreVO;

/*
 * 과목명을 subject = {"국어","영어","수학"} 배열에 선언
 * 성적 정보를 저장할 List<ScoreVO> scoreList를 생성
 * inputScore() method를 선언하고
 * InputServiceV2 의 inputValue() method를 사용하여
 * 5명의 학생의 각 과목의 점수를 입력
 * 입력받은 점수를 ScoreVO객체로 생성한후 scoreList add()
 * 
 */
public class ScoreServiceV6 {

	List<ScoreVO> scoreList;
	InputServiceV2 isV2;
	int student = 5;
	String[] subject;

	public ScoreServiceV6() {
		scoreList = new ArrayList<ScoreVO>();
		isV2 = new InputServiceV2();
		subject = new String[] { "국어", "영어", "수학" };
	}

	public void inputScore() {
		ScoreVO vo0 = new ScoreVO();
		for (int i = 0; i < student; i++) {
			Integer kors = isV2.inputValue(subject[0], 0, 100);
			vo0.setKor(kors);
			scoreList.add(vo0);

			ScoreVO vo1 = new ScoreVO();
			Integer engs = isV2.inputValue(subject[1], 0, 100);
			vo1.setEng(engs);
			scoreList.add(vo1);
			
			ScoreVO vo2 = new ScoreVO();
			Integer Math = isV2.inputValue(subject[2], 0, 100);
			scoreList.add(vo2);
			
		}
	}
}
