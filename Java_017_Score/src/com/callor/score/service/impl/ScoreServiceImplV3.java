package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV3 extends ScoreServiceImplV2Ex {

	/*
	 * sample_score.txt 에서 성적데이터를 읽어와 scoreList에 담기
	 */
	@Override
	public void readScore() {
		String readFile = "src/com/callor/score/sample_score.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		/*
		 * List에 있는 remove() method는 
		 * 2개의 List 에 중복된 데이터가 있으면 
		 * 중복된 데이터를 삭제하는 method 
		 * List type에 데이터를 새로 추가하고자 할때는 
		 * 기존의 데이터를 삭제하고 추가를 해야한다
		 * 이때 사용할 수 있는 코드
		 * 
		 * 파일이나 데이터베이스에서 데이터를 가져와서 
		 * List에 반영하고자 할때 먼저 실행해주는 코드
		 */
		scoreList.removeAll(scoreList);

		try {
			fileReader = new FileReader(readFile);
			buffer = new BufferedReader(fileReader);
			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;
				// if 조건문에 대하여 실행할 명령문이 한줄만 있을 경우 {}를 생략하고 명령문을 사용 할 수 있다. break;
				String[] scores = reader.split(":");
				int intKor = Integer.valueOf(scores[1]);
				int intEng = Integer.valueOf(scores[2]);
				int intMath = Integer.valueOf(scores[3]);

				ScoreVO scoreVO = new ScoreVO();
				scoreVO.setNum(scores[0]);
				scoreVO.setKor(intKor);
				scoreVO.setEng(intEng);
				scoreVO.setMath(intMath);
				scoreList.add(scoreVO);
			}
			buffer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
