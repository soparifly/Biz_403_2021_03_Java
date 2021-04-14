package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1Ex;

public class Const_01 {
	/*
	 * 인터페이스가 있는 클래스의 객체 생성 = 클래스를 선언(작성)할때 인ㅌㅓ페이스를 imtl했다 인터페이스를 사용하여 객체를 선언하고 구현체
	 * 클래스의 생성자를 호출하여 객체를 생성, 초기화 해야한다.
	 * 
	 * 인터페이스는 생성자 메서드가 없다.
	 * 
	 * 
	 * (인터페이스 클래스)  = new (impl받은 인터페이스)();
	 */
	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceImplV1Ex();
//				sService = new ScoreService .. ( X)
		
		
		/*
		 * List 인터페이스로 3개의 객체를 선언하고
		 * 각각을 array, linked, vector클래스를 사용하여 생성하였다
		 */
		
		List<String> strList1 = new ArrayList<String>(); //수시로 데이터가 추가되고 삭제될때 빠름
		List<String> strList2 = new LinkedList<>(); //데이터가 순서대로나열되있는경우 빠름
		List<String> strList3 = new Vector<>(); //게임같은데서 사용하는 리스트
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
	/*
	 * 매개변수 type을 List interface type으로 선언한 method 
	 * 
	 * 이 method는 List interface의 자손인
	 * ArrayList, LinkedList, Vector 클래스로 생성된
	 * 객체를 매개변수로 받아 연산을 수행할수 있다.
	 * 
	 * 즉 , 한개의 메소로 다수 type의 값들을 연산 수행할수 있다
	 * 
	 * strList1, strList2, strList3는 각각 타입이 다르다
	 * 하지만 List interface type으로 선언되었기때문에
	 * 메서드 등의 연산을 공용으로 사용할수 있다
	 * 이러한 성질을 클래스의 다형성 이라고 한다.
	 * 
	 * 인터페이스가 없으면 다형성이 존재할수 없다.
	 */

	
//List의 내용 전체를 console에 출력하기
	public static void list(List<String> strList) {
		int nSize = strList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
	}

}
