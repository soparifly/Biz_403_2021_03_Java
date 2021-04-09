package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	/*
	 * 현재 클래스 내부에서만 호출되는 method private으로 선언한다
	 * 현재 클래스를 상속받아 확장하여 사용할 수 있도록 하려면
	 * private = > protected로 변경해주는 것이 좋다 (상속받은상황에서만 접근이가능하다)
	 * 
	 */
	//알트 + 쉬프트 S
	@Override
	/*
	 * scoreList에 성적정보를 추가할때
	 * 학번을 입력받을텐데
	 * 이미 등록된 학번 정보가 있으면 그학번은 추가하지 못하도록 하는 코드
	 * 
	 * V1 의 inputNum()메소드를 재정의한다
	 * V1의 inputNum 메소드를 재정의하기 위하여
	 * private을 protected로 변경했다
	 */
	protected String inputNum() {
		while(true) {
			Integer intNum = inService.inputValue("학번",1);
			if(intNum == null) {
				return null;
			}
			String strNum = String.format("%03d", intNum);
			/*
			 * 생성한 strNum에 저장된 학번이 scoreList에 있는지 확인
			 */
			int index =0;
			//index는 0~size -1 만큼 반복하는 과정 
			for(index = 0; index <scoreList.size();index++) {
				ScoreVO vo = scoreList.get(index);
				if(vo.getNum().equals(strNum)) {
					break;
				}
			}
			//for() 반복문이 모두 정상종료 되었는지? :index >= size()
			// 아니면 중간에 중단되고 빠져나왔는지 :index > size()
			//  for 중간에 break를 만났다. break가 실행됬다
			// 이미 등록된 학번이 있다 
			if(index < scoreList.size()) {
				System.out.println(strNum +"는 이미 등록되어 있음"	);
				continue;
				//다시 입력 받으로 가기
			}
			return strNum;
		}

	}

}
