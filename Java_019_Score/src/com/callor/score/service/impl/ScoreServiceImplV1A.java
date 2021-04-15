package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoresService;
import com.callor.score.service.StudentService;
import com.kimbyulook.standard.InputService;
import com.kimbyulook.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1A implements ScoresService {

	/*
	 * ScoreService 인터페이스를 implemets하여 클래스를 작성 2. inserScore() method에서 학번, 국어, 영어,
	 * 수학 점수를 입력받아 List<ScoreVO> ScoresList에 추가 3. 학번은 00001 형식으로 5자리로 변환하여 추가 4. 한번
	 * 입력된 학번의 점수는 다시 입력할수 없음 5. printScore()등 코드는 임의로 작성
	 */
	protected InputService inService;
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected String[] subList;
	protected StudentService stService;

	public ScoreServiceImplV1A() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
		stService = new StudentSerivceImplV1A();
	}

	private Integer inputServcie(String title, int nums) {
		System.out.println("=".repeat(50));
		System.out.printf("[%s]의 값을 입력하세요 (QUIT: 입력취소)\n", title);
		System.out.println("-".repeat(50));

		String strInput = scan.nextLine();
		if (strInput.equals("QUIT")) {
			return null;

		}
		Integer intValue = null;
		try {
			intValue = Integer.valueOf(strInput);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("정수 또는 QUIT 만 입력하세요");
		}
		return intValue;
	}

	@Override
	/*
	 * 학번 입력하면 scoreList에 같은 학번의 성적이 있는지 확인한다 있으면 저장이 안되어야한다. 이미 있으면 다시 학번을 입력하도록
	 * 해야한다
	 * 
	 */
	public void insertScore() {

		// 유효성 검사가 끝난후 학번을 가지고
		// vo에 담아야 하기때문에 while이 시작되기전에 선언한다
		String strNum = null;
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return;
			}

			strNum = String.format("%05d", intNum);
			ScoreVO scoreVO = this.numCheck(strNum); // 아레의 메서드에서 중복이면 vo를 호출했고 중복이없으면 null값을 호출한다
			if (scoreVO != null) {
				continue; // 브레이크면 더이상 학번을 받지않고 다음 항목으로 넘어간다
			} //
//			continue; // 학번을 다시 입력하도록 반복한다.

			StudentVO stVO = stService.getStudent(strNum);
			if (stVO == null) {
				System.out.println("학적부에 없는 학생입니다");
				System.out.println("학번을 다시입력해주세여");
				continue;
			}
			System.out.println("=".repeat(50));
			System.out.printf("학번:%s\n", stVO.getNum());
			System.out.printf("이름:%s\n", stVO.getName());
			System.out.printf("학과:%s\n", stVO.getDept());
			System.out.printf("학년:%s\n", stVO.getGrade());
			System.out.printf("주소:%s\n", stVO.getAddress());
			System.out.println("=".repeat(30));
			System.out.println("학생정보가 맞습니까?");
			System.out.print(">> ");
			String yesNo = scan.nextLine();
			if (yesNo.equals("NO")) {
				continue;
			}
			break;
		} // while end
			// 학번에 해당하는 점수가 없다
			// 학생정보에 등록된 학번인가를 검사하여
			// 학생정보에 없으면 다시 학번을 입력받고
			// 있으면 입력하도록 break;

		Integer intKor = null;
		intKor = inService.inputValue("국어", 0, 100);
		Integer intEng = inService.inputValue("영어", 0, 100);
		Integer intMath = inService.inputValue("수학", 0, 100);
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(intKor);

	}// end inSertScore()
	/*
	 * 파라미터로 전달받은 학번이 scoreList에 있는지 검사한다 있으면 scoreVO를 retrun한다 없으면 null을 리턴
	 */

	protected ScoreVO numCheck(String num) {

		for (ScoreVO vo : scoreList) {
			if (vo.getNum().equals(num)) {
				return vo; // vo 의 값이 학생 정보 목록에 num 과 일치하면 다시 vo정보를 방출한다
			}

		}
		return null; // 위의 조건문에서 중복값이 없으면 null값이 리턴된다
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

	}

}
