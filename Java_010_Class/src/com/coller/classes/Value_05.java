package com.coller.classes;

import com.coller.classes.service.ValueService;

public class Value_05 {
	public static void main(String[] args) {
		ValueService vs = new ValueService();
		Integer result = 0;
		
		vs.nums();
		//vs.retNum =200; 중간에 retNum값이 바뀔수도잇다
		//retNum 맴버변수를 public으로 선언하면
		//아래와같이 간편하게 값을 읽을수있다
//		Integer result = vs.retNum();

		//retNum변수는 valueService의 맴버변수이다
		//이 맴버변수를 외부에서 값을 변경하는것은 
		//코드를 매우 위험슼럽게 만드는것이다.
		
		//좋은 방법은 맴버변수를 private으로 설정하고
		//getter() method를 통하여 읽기전용으로 만드는것이 좋다
		
		Integer result1 = vs.getRetNum();
		Integer result2 = vs.numsRet();

	}
}
