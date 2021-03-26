package com.callor.apps.service;

/*
 * 10명 학생의 국어, 영어, 수학 점수를 배열에 저장하고
 * 
 * 2. 학생들의 총점, 평균을 계산하여
 * 3, 성적 리스트를 출력합니다
 * 4, ScoreServiceV1에 method를 구현하고
 * App_08 클래스의 main() method 에서 호출하여 구현합니다
 */
import java.util.Random;

public class ScoreServiceV2 extends ScoreServiceV1 {
// for (int i =0)
//	int members = 5
//	method의 괄호()안에 선언된 변수
// 매개 변수, parameter(파라미터)라고 한다.
	public ScoreServiceV2(int members) {
		int[] intKor = new int[members];
		int[] intEng = new int[intKor.length];
		int[] intMath = new int[intKor.length];

		int[] intSum = new int[intKor.length];
		float[] floatAvg = new float[intKor.length];

	}

}