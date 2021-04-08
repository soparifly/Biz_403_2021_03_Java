package com.callor.method.service;

public class NumberServiceV7A {
	InputService inService;

	public NumberServiceV7A() {
		inService = new InputService();
	}

	public void inputNum() {

		while (true) {

			Integer intKor = inService.inputValue("국어");
			if (intKor == null) {
				return;
			} else if (intKor < 0 || intKor > 100) {
				System.out.println("점수는 0~ 100");
				continue;
			}
			break;
		}
	}
}
