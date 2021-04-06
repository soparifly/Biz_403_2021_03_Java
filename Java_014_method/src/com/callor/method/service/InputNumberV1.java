package com.callor.method.service;

import java.util.Scanner;

/*
 * 1.inputValue(String title ) method	를 선언
 * 2. title + "값을 입력하세요 " 프롬프트를 보여주고
 * 3. 정수 또는 QUIT를 키보드를 통해 입력받는다
 * 4. 입력값이 QUIT이면 null을 return하고 
 * 5.정수이면 정수값을 return한다.
 */
public class InputNumberV1 {

	protected Scanner scan;
	Integer num1;

	public InputNumberV1() {
		/*
		 * 스캐너 클래스는 키보드 자원을 연동하여 키보드로부터 값을 입력 받기 위한 클래스이다. 이 클래스는 컴퓨터의 자원을 사용하는 관리가 매우
		 * 엄격하게 필요한 클래스 이다 , 사용하는 방법에 따라, 오류가 발생하거나 심지어 컴퓨터 시스템이 멈추는 현상까지 발생할수 있다 이러한
		 * 클래스는 사용할때 상당한 주의가 필요하다 Scanner 클래스를 main() method가 아닌 service 등의 클래스에서 사용할때는
		 * 클래스 영역에 선언을 하고 클래스의 생성자에서 생성(초기화)하는 것이 좋다.
		 */
		scan = new Scanner(System.in);

	}
/*
 * 문자열, 정수, 정수 매개변수를 갖는 메소드 선언
 * 
 * 문자열과 범위(Start ~ end )값을 전달받아
 * prompt 문자열을 생성하고 (title)
 * intputvlalue(String title)mehtod를 호출하여 값을 입멸 갑도록하고
 * return 된 값에 따라 null값이 리턴되면 그냥 리턴해버리고 정수값이 리턴되면 start,end값 범위에 있는 값인지 유효성 검사를 하고 
 * 범위를 벗어나면 다시 입력을 하도록 반복한다
 */
	public Integer inputValue(String title, int start, int end) {
		//title 변수값을 "새우깡(0~ 100)"문자열로 다시생성
		title = String.format("%s (%d ~ %d)", title ,start, end);
		while(true) {
			Integer retNum = this.inputValue(title);
			if (retNum == null) {
				
				return null;
			} else {
				if(retNum < start || retNum > end) {
					System.out.printf("입력값은 %d ~ %d  범위이여야 합니다\n",start,end);
					continue;
				}
			}
			return null;
		}
	}
	
	
	/*
	 * String title 매개변수를 받고 
	 * 정수값이나 QUIT가 입력되는지 확인을 하고 
	 * 잘못 입력된 값이 있으면 다시 입력 받도록 하는 메소드
	 */
	
	public Integer inputValue(String title) {

		while (true) {
		System.out.println(title + " 값을 입력하세요(QUIT:입력중단)");
		System.out.print(" >> ");

			String str = scan.nextLine();//str값을 입력받음

			if (str.equals("QUIT")) {
				return null; //quit값을 입력하면 null을 반환함
			} //if 조건 true일경우
			else {
				try {
					num1 = Integer.valueOf(str);
				} //예외상황검사
				catch (NumberFormatException e) {
					System.out.println("정확한 값을 입력해주세요");
					continue; //예외상황발생시 위의 메시지를 출력하고 continue한다
					
				} //오류시 반환값
				return num1;
			}//else문 종료 num1값을 반환한다
		} //while문의 종료

	}

}
