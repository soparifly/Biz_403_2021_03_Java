package com.kimbyulook.standard.impl;

import java.util.Scanner;

import com.kimbyulook.standard.InputService;

/*
 * 인터페이스를 implements 한 클래스는
 * 이름을 지을때 접미사에 보통Impl을 붙인다
 * 
 * 인터페이스를 impl한 클래스는 인터페이스에 설계된 추상 메서드를 "반드시 "
 * 
 * 구체적인 코드로 구현해야한다.
 * 만약 아직 구체적인 코드가 구현되지 않았더라도 
 * method의 형태는 삭제할수 없다.
 * 
 * 이러한 규칙을 적용하여 다른클래스와 연동할때 편리하고 오류가 없도록
 * 하기위함이다.
 * 
 */
public class InputServiceImplV1 implements InputService {

	protected Scanner scan;

	public InputServiceImplV1() {
		scan = new Scanner(System.in);

	}

	@Override
	public Integer inputValue(String title) {
		// TODO prompt 타이틀을 보여주고 정수 입력받기
		while (true) {

			System.out.println(title + "값을 입력하세요 ( QUIT : 입력중단 )");
			System.out.print(">>>>");
			String strIn = scan.nextLine();
			if (strIn.equals("QUIT")) {
				System.out.println("입력 취소!!");
				return null;
			} // if end
			Integer intIn = 0;
			try {
				intIn = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("정수 값만입력하세요");
				continue;
			} // end while
			return intIn;
		}
	}

	@Override
	public Integer inputValue(String title, int start) {

		title = String.format("%s (%d 이상)", title, start);
		while (true) {
			// intIn에 저장된 값
			// == inputValue(String title)이
			// 반환해준 값
			Integer intIn = this.inputValue(title);
			if (intIn != null) {
				if (intIn < start) {
					System.out.printf("입력값은 %d 이상으로!!", start);
					continue;
				}
			} // ifend
			return intIn; // 반환값 null

		} // end while
	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		// TODO 제목, 시작값, 종료값으로 유효성 검사 메서드

		title = String.format("%s(%d ~ %d 범위의)", title, start, end);
		while (true) {

			Integer intIn = this.inputValue(title);
			if (intIn != null) {
				if (intIn < start || intIn > end) {
					System.out.printf("%d~ %d 까지 입력하세요~~~ \n", start, end);
					continue;
				}
			} // out if end
			return intIn;

		} // while end 
	}//method end

}//class end
