package com.kimbyulook.standard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.kimbyulook.standard.impl.InputServiceImplV1;

public class Ex_01 {
	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue ("새우깡");
		isV1.inputValue("새우깡",0);
		isV1.inputValue("새우깡", 0, 100);
		
		/*
		 * List인터페이스를 구현한 ArrayList, LinkedList,  Vector 등 3가지가있다
		 * 3가지 클래스는 코드에 List인터페이스를 impl 했을 것이다
		 * 이러한 클래스는 선언과 생성을 할때
		 * 인터페이스로 선언하고 , 클래스의 생성자로 객체를 생성하는것이좋다.
		 * 
		 * 
		 * List인터페이스를 impl한 클래스들은
		 * List type의 클래스다 라고 호칭한다
		 */
		List<Integer> intList = new ArrayList<Integer>();
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>();
	}
}
