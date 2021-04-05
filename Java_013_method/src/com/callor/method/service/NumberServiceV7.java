package com.callor.method.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberServiceV7 extends InputService {

	public NumberServiceV7() {

	}

	public Integer inputScore() {

		InputService is1 = new InputService();
		String[] object = new String[] { "국어", "영어", "수학", "과학", "국사" };
		Integer intNum = 0;

		List<Integer> score = new ArrayList<Integer>();

		while (true) {

			for (int i = 0; i < object.length; i++) {
				intNum = is1.inputValue(object[i]);

				if (intNum >= 0 && intNum <= 100) {
					
					score.add(intNum);
					
				} else {
					System.out.println(" 0~ 100까지만 점수 입력이 가능합니다");
					break;
				}
				continue;
			}
			
			
		}
	}
}