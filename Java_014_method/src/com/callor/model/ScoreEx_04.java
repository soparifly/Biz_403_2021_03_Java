package com.callor.model;

public class ScoreEx_04 {
	public static void main(String[] args) {

		
		//stack 메모리에 2개의 저장소를 만들고
		//각각 100, 200 의 저장소를 저장해 두어라
		int intNum1 = 100;
		int intNum2 = 200;

		/*
		 * heap 메모리에 kor,eng, math... 등의 값을 저장할
		 * 저장소를 만들고 저장소들의 첫번째 주소를
		 * static 메모리에 저장하고 
		 * 그곳에 scoreVO라는 이름을 붙여라
		 */
		// 사용할준비
		ScoreVO scoreVO = new ScoreVO(); // 스코터VO클래스의 scoreVO객체 선언함

		scoreVO.setKor(90);
		scoreVO.setEng(90);
		scoreVO.setMath(90);
		
		
		/*
		 * scoreVO객체의 국어 kor 변수의 값을 읽어서 intKor의 변수에 저장해 달라
		 * 1. stack 메모리에 있는 scoreVO변수를 찾아서 
		 * 2.scoreVO변수에  저장된 주소 읽기
		 * 3. 그 주소에 해당하는 Heap메로리를 찾고  
		 * 4. Heap메모리의 kor변수에서 값을 읽어서
		 * 5. intKor변수에 저장
		 */
		int intKor = scoreVO.getKor();
	}
}
