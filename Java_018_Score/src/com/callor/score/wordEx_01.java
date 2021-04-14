package com.callor.score;

import com.callor.score.impl.WordServiceImplV1A;
import com.callor.score.service.WordService;

public class wordEx_01 {
	public static void main(String[] args) {
		WordService wSV1 = new WordServiceImplV1A();
		wSV1.viewWord();
	}


}
