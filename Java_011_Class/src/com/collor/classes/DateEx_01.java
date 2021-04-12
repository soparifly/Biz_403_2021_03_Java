package com.collor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01 {

	public static void main(String[] args) {
		// 컴퓨터의 내장된 시계로부터
		// 현재 날짜 시간 데이터로 읽어와서
		// today 객체로만들기

		Date today = new Date();

		// today객체 , 시간 객체를 문자열로 변환시키기위한 보조클래스
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-mm-dd");

		String curDate = dateForm.format(today); // 포멧이라는 매서드에게 today 를 보내주면 날짜값을 문자열로 바꾸어서 curDate에 담아줌
		System.out.println(curDate);

		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss");

		String curTime = timeForm.format(today);
		System.out.println(curTime);

		timeForm = new SimpleDateFormat("HH:mm:ss");
		System.out.println(timeForm.format(today));
	}
}
