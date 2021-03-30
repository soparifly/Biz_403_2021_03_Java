package com.coller.classes.service;

public class MethodService {
//	변수는 같은 { } 구역 내에서는 같은 이름으로 절대 중복선언할 수 없다.

	
//	method는 같은 클래스의 {} 구역내에서는 원칙적으로 같은 이름으로 중복선언할수 없다
//	예외적 허용)
//	예외 1. method에 매개변수의 유무
//		 2. 매개변수의 갯수의 차이
//		 3. 매개변수 의 type의 차이
	public void method(int num) {
		System.out.println("여기는 1번 method");	
	}
	public void method(int num, int num1) {
	}
	public void method(float num, int num1) {
	}
/*
 * methd 코드를 작성할때 매개변수를 선언하면
 * 이 method를 호출할때 반드시 매개변수에 해당하는 값을 전달해야한다,
 * 
 * 선언된 매개변수의 개수, type이 일치하도록 값을 전달해야만 한다
 * 그렇지않으면 method를 호출 한 곳에 오류가 발생한다.
 * 객체.method(30, 30.0f)
 */
	public void method(int num, float num1) {
	}
	public void method() {

	}
}
