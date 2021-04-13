package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;

public class Const_02 {
	/*
	 * 인터페이스가 있는 클래스의 객체 생성 = 클래스를 선언(작성)할때 인ㅌㅓ페이스를 imtl했다 인터페이스를 사용하여 객체를 선언하고 구현체
	 * 클래스의 생성자를 호출하여 객체를 생성, 초기화 해야한다.
	 * 
	 * 인터페이스는 생성자 메서드가 없다.
	 * 
	 */
	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceImplV1Ex();
//				sService = new ScoreService .. ( X)
		
		
		/*
		 * List 인터페이스로 3개의 객체를 선언하고
		 * 각각을 array, linked, vector클래스를 사용하여 생성하였다
		 */
		
		List<String> strList1 = new ArrayList<String>();
		List<String> strList2 = new LinkedList<>();
		List<String> strList3 = new Vector<>();
		strList1.add("대한민국");
		strList1.add("우리나라");
		
		strList2.add("3*4");
		strList2.add("3/4");

		strList3.add("홍길동");
		strList3.add("성춘향");
			
		
		//리스트에 저장된 내용을 출력하는 method
		list(strList1);
		list(strList2);
		list(strList3);

	}
//List의 내용 전체를 console에 출력하기
	public static void list(List<String> strList) {
		int nSize = strList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
	}

}
