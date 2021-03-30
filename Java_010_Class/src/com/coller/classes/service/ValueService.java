package com.coller.classes.service;

public class ValueService {

	/* 
	 * 클래스의 맴버변수를 public으로 선언하는 것은 매우 위험한 코드이다
	 * 어떤 이유로든 public 으로 된 멤버변수는
	 * 값이 변경될수 있다.
	 * 원하지 않는 값으로 오염될수 있다.
	 * 그러한 현상을 방지하기위해 멤버변수는 가급적 private으로 선언을 하고 
	 * 맴버변수값을 객체, 변수 형식으로 읽어내고자 할때는 
	 * getter()매소드를 만들어주는것이좋다. => 정보의 은닉 
	 */
	private int retNum ;
	
	public int getRetNum() {
	
		return retNum;
	}
	
	public void nums() {
		//nums method는 연산을 수행하고  
		// 그결과값인 100을 호출한 곳에 전달return하려고한다
		//void method 에서는 값을 return 할수없다.
		// 멤버변수를 언선하고 멤버변수에 값을 저장해두었다,.
		
		retNum = 100;
	}
	
	public Integer numsRet() {
		return 100;
	}
}
