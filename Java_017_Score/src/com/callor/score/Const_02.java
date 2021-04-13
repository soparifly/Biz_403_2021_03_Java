package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.impl.ScoreServiceImplV1Ex;
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
		 * List 인터페이스로 3개의 객체를 선언하고 각각을 array, linked, vector클래스를 사용하여 생성하였다
		 */

		ArrayList<String> strList1 = new ArrayList<String>();
		LinkedList<String> strList2 = new LinkedList<>();
		Vector<String> strList3 = new Vector<>();
		strList1.add("대한민국");
		strList1.add("우리나라");

		strList2.add("3*4");
		strList2.add("3/4");

		strList3.add("홍길동");
		strList3.add("성춘향");

		// 리스트에 저장된 내용을 출력하는 method
		list(strList1);
		list(strList2);
		list(strList3);
		
		

	}

//ArrayList의 내용 전체를 console에 출력하기
/*
 * 여기에 있는 세개의 메소드는 각각 
 * 어레이리스트. 링크리스트 백터리스트 타입의 매개변수를 전달받아 연산을 수행한다
 * 
 * 세개의 메소드는 하는일이 똑같은 코드이지만 
 * 매개변수 type이 다르기때문에 어쩔수 없이 중복하여 코드가 작성되어야한다
 */
	public static void list(ArrayList<String> strList) {
		int nSize = strList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
	}

	public static void list(LinkedList<String> strList) {
		int nSize = strList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
	}
	public static void list(Vector<String> strList) {
		int nSize = strList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
	}
}