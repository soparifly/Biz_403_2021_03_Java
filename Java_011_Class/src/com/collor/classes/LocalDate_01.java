package com.collor.classes;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDate_01 {
	public static void main(String[] args) {

		/*
		 * Java 1.8 부터 사용할수 있는 새로운날짜
		 * 기존에 Date, Calendar클래스가 있는데, 날짜와 관련된 이슈가 많이 발생한다
		 * 1.8버젼 부터 새로운 날짜 시간과 관련된 코딩을 할때 사용하는 클래스가 만들어졌다
		 * 
		 */
		LocalDateTime local = LocalDateTime.now();
		System.out.println(local.toString());
		System.out.println(local.getDayOfMonth());
		System.out.println(local.getDayOfYear());
		System.out.println(local.getDayOfWeek());
		System.out.println(local.plusDays(20));
		System.out.println(local.minusDays(20));
		System.out.println(local.plusMonths(24));
		System.out.println(
		local.with(TemporalAdjusters.firstDayOfNextYear())
		);
		System.out.println(
		local.with(TemporalAdjusters.firstDayOfMonth())
		);
		System.out.println(
		local.with(TemporalAdjusters.lastDayOfMonth())
		);
		//오늘부터 3일후가 포함된 달의 마지막들
		System.out.println(local.plusDays(3).with(TemporalAdjusters.lastDayOfMonth()));
		
	}
}
