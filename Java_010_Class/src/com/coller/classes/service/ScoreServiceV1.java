package com.coller.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.coller.classes.model.ScoreVO;
/*
 * 접근제한자(참조제한자)
 * 접근을 제한할때 사용하는 키워드
 * public , private, protected
 * 이 키워드는
 * class, method 맴버변수를 선언할때 사용하는 명령어 (키워드) 이다
 *  접근 제한자는 사용하지 않아도 문법적인 오류가 발생하지는 않는다
 * 그래도 사용하는 이유는 객체지향이론에서 "정보의 은닉(감춘다·제한적으로 접근하게한다·데이터를 보호한다)"
 * 
 * public : (범용) 모두에게 개방한다. 모두에게 공개한다
 * 			누구나 접근(읽기· 쓰기 · 실행)을 하게한다
 * 			class obj = new class() 객체를 통해서 접근이가능
 * 			obj.method();
 * 			obj.변수 = 00;
 * 
 * private : 현재 클래스(파일)에 있는 코드 안에서만 접근가능
 * 			obj.변수 = 00; (X)
 * 
 * protected : 생성된 객체를 통해서는 직접 접근 금지
 * 		class obj = new Class()
 * 		obj.mehtod() 방식으로는 접근이 안된다.
 * 		클래스를 상속받게 하겠다 라는 전제하에
 * 		상속을 받은 클래스에서는 자유롭게 접근이 가능하다 
 *  	부모클래스와 상속받은 자식클래스간에 공유하는 목적
 * 
 */
public class ScoreServiceV1 {

	/*
	 * 맴버변수 protechted로 선언을 해두면 현재클래스 (V1)를 상속받은 클래스에서 
	 * 이미 변수가 선언된것처럼 동작할수 있다.
	 *  상속을 허락하고, 맴버변수를 공유하고자 할때는 protected를 추가한다.
	 *  
	 */
	protected Scanner scan;
	protected List<ScoreVO> scoreList;

	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}

	public Integer inputScore() {
		
//		System.out.println("학번을 001 형식으로 입력하세요");
//		System.out.print(">> ");
//		String strNum = scan.next();
		
		/*
		 * scoreList의 데이터 갯수를 계산하여 입력할 학번을 자동으로 생성하기
		 */
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);
		int intKor = 0;
		while(true){
			
			System.out.println(strNum + " 번의 국어 점수를 입력하세요(중단: -1)");
			
			System.out.print(">> ");
			
			intKor = scan.nextInt();
			
			if(intKor ==-1) {
			
				return -1;
				
		} else if (intKor < 0||intKor > 100) {
			System.out.println("국어점수는 0~ 100까지!!");
			continue;
		}
			break;
		}
		
		
		System.out.println(strNum
				+ " 번의 영어 점수를 입력하세요");
		
		System.out.print(">> ");
		int intEng = scan.nextInt();
		
		System.out.println(strNum
				+ " 번의 수학 점수를 입력하세요");

		System.out.print(">> ");
		int intMath = scan.nextInt();
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intKor;
		scoreVO.eng = intEng;
		scoreVO.math = intMath;
		scoreList.add(scoreVO);
		
		
		return 0;
	} // inputScore()

	public void printScore() {
		this.printHeader();
		for (int i = 0; i < scoreList.size(); i++) {

			// scoreList의 i번째 저장된 값을 읽어서
			// ScoreVO형 sVO객체에 담기
			ScoreVO sVO = scoreList.get(i);
			System.out.printf(sVO.num + "\t");
			System.out.printf(sVO.kor + "\t");
			System.out.printf(sVO.eng + "\t");
			System.out.printf(sVO.math + "\n");

		}
	}// printScore()

	private void printHeader() {
		System.out.println("* 빛나라 고교 성적처리 V1");
		System.out.println(Lines.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println(Lines.sLine(50));

	}
}
