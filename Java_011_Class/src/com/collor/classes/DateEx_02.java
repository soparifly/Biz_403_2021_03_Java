package com.collor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_02 {
public static void main(String[] args) {
	
	Date date = new Date();
	SimpleDateFormat dateForm =new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat timeForm =new SimpleDateFormat("hh:mm:ss");
	
	String curDate = dateForm.format(date);
	String curTime = timeForm.format(date);
	System.out.printf("오늘 날짜: %s ,현재 시각 %s",curDate,curTime);//여기에 날짜를 추가하거나 되돌리는 코드로는 표현이 불가능하다
}
}
