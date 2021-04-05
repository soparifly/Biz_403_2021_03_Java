package com.callor.method.service;

public class Method_03 {

	public static void main(String[] args) {
		/*
		 * NumberServiceV1 클래스에 작성한 inputNum()를 
		 * 호출하여 명령을 수행하고싶은 경우 
		 * 이때 C와 같은 언어는 단순히 method이름만 호출하여 명령을 수행할수 있다.
		 * 이런 type을 함수호출(fuction call)이라고 한다 
		 * 하지만 ,
		 * 자바는 이러한 함수호출 방식으로 명령을 수행할수 없다.
		 * 
		 * intputNum(); //함수호출
		 * 
		 */
		 
		/*
		 * 자바에서는 클래스에 정으된 method를 호출하여 명령을 수행하려면
		 *1.클래스를 사용하여 객체를 생성해야한다
		 *2.객체와 연결연산자를 사용하여 호출한다
		 *
		 *아래의 명령문에서는 nsV1.inputNum()방식으로 호출해야하며
		 *nsV1은 이전에 객체로 생성되어 있어야한다
		 */
		//intputNum();
		NumberServiceV1A nsV1 = new NumberServiceV1A();
		/*
		 * intputNum() 메서드는 정수값을 생성하여 3의 배수이면 정수를 아니면 null값을 return하도록 되어있다 
		 * 다라서 이 method를 단순히 호출만 하는것은 아무런 의미가 없다
		 * 이 메서드가 어떤 명령들을 수행했는지 알수있는 방법이 없다
		 */
		nsV1.inputNum();
		/*
		 *  이 메서드는 return명령문이 강제되어있기때문에
		 * method가 return하는 값을 받아서 변수에 저장할수 있다.
		 */
		
		Integer retNum = nsV1.inputNum();
		
		/*
		 * 메서드가  리턴해준 값을 저장한 변수 retNum값을 참조하여 이후 코드를 작성할수 있다
		 */
		if (retNum ==null ) {
			System.out.println(retNum + "return된 값은 는 3의 배수가아님");
		} else {
			System.out.println(retNum +  "는 3의 배수");
		} // 위의 코드 보다 더 권장하는 코드
		if (retNum != null ) {
			System.out.println(retNum + "는 3의 배수");
		}else {
			System.out.println("3의 배수가 아님");
		}
	}
}
