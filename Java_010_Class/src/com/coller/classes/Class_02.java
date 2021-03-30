package com.coller.classes;

import java.util.ArrayList;
import java.util.List;

public class Class_02 {
	public static void main(String[] args) {
		/*
		 * List<Integer> 
		 *  Java에서 제공되는 매우 사용이 편리한 배열자료구조 
		 * 1. 몇개의 데이터를 저장할지 미리 정하지않아도된다.
		 *  2. 필요에 따라서 개수를 늘리거나 줄일 수 있다. 
		 *  3. 매우 다양한 여러가지 기능이 이미 준비되어있다,
		 * 
		 *  Integer형 (type)의 데이터를 다수 저장할(list)
		 *  intList선언하는것
		 *  Integer[]  intList = new Integer[];
		 *  int배열에서는 첨자의 값을 정해주어야하지만
		 *  List클래스를 사용하여 intList를 선언하면 첨자의 값을 정해주지않아도된다
		 *  단. intList에는 Integer형 데이터만 저장할수 있다.
		 *  
		 *  <Integer> : generic 선언 제네릭선언
		 *  저장될 데이터의 type을 규정하는 방법
		 *  primitive형은 포함할수 없다.
		 *  
		 *  반드시 wrapper class형만 포함할수있다
		 *  List 형 객체 : List클래스를 사용한 객체
		 *  	선언할때는 List를 사용하고 
		 *  	생성(초기화)할때는 ArrayList() 생성자를 사용
		 *  List 형 객체를 선언하고 ArrayList()로 생성을 하면
		 *  	size가 0인 배열 객체가 생성된것과 유사하다
		 */
		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList  = new ArrayList<String>();
		List<Long> longList = new ArrayList<Long>();
		List<Double> douList =  new ArrayList<Double>();
		List<Boolean> bodList = new ArrayList<Boolean>();
		List<Float>floatList = new ArrayList<Float>();
		List<Character> charList = new ArrayList<Character>();
		


//		배열에 값을 저장할때는 원하는 length만큼 배열을 선언 생성하고 
//		첨자를 사용하여 위치를 저장한후 값을 저장
		int[] nums = new int[5];
		nums[0] = 100;

		
//		intList << 리스트형 객체라고 부름
//		List형 객체를 데이터를 저장할때는
//		"추가"를 하여 저장
//		List형 객체에 데이터를 추가할때는
//		.add() method 사용하여 데이터를 추가한다
		
		intList.add(100); //intList의 갯수가 1이되고 자동으로 0번위치에 100이 저장된다
		intList.add(200); // 2번위치
		intList.add(300); // 3번위치
		
//		intList의 0번 위치에 저장된 값을 읽고 싶을때
		System.out.println(intList.get(0)); //값을 읽을때 get메소드를 사용한다
		System.out.println(intList.get(1)); //값을 읽을때 get메소드를 사용한다

		System.out.println(intList.get(2)); //값을 읽을때 get메소드를 사용한다
//		값을 읽을때 저장된 데이터 개수의 index범위를 벗어날수없다
//		위에서 add() 는 3번 실행됬기때문에 갯수는 3개가 되고 get(index)를 수행할때
//		index값은 총갯수 -1 까지만 사용할 수 있다.
//		System.out.println(intList.get(3));
		
		
	}
}
