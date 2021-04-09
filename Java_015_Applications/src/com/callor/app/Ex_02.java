package com.callor.app;

import com.callor.app.service.ScoreServiceImplV1;

public class Ex_02 {
	public static void main(String[] args) {
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		while (true) {
			try {
				ssV1.selectMenu();
			} catch (Exception e) {
				// TODO Auto-generated catch block
//		e.printStackTrace();
				System.out.println("입력값이 없습니다 다시 입력해주세요");
				continue;
			}
		}
	}
}
