package com.callor.apps;

import java.util.Arrays;

import com.callor.apps.model.ScoreVO;

/*
 * 객체 !== 변수
 *  객체 와 변수는 선언, 생성, 사용방법이 매우 유사하다.
 *  객체 만들어진다 ==> 기억장치 어딘가에 저장소가 만들어진다. 마치 변수처럼
 *  객체의 특징 :  연결 연산자(점 연산자)가 있다.
 *  				객체 자체만으로는 어떤역할을 수행하지않는다
 *  			다만, method에 매게변수로전달할때는 거의 변수와 같이 사용된다.
 *  
 *  객체와변수의 유사점 
 *  
 */
public class ScoreEX_04 {

	public static void main(String[] args) {

		// 객체 이름 짓기
		// 클래스 이름의 첫글자를 소문자로 하여 그대로 사용
		ScoreVO scoreVO = new ScoreVO();

		/*
		 * 기본제공 변수 선언 키워드(primitive varriable keyword) int, long, double, float,
		 * boolean, char
		 * 
		 * 기본제공 변수와 사용법이 같은 클래스 wrapper class : 기본 변수를 감싸고 기능을 확장한다. Integer, Long,
		 * Double, Float,Boolean, Character
		 * 
		 * 
		 */
		int num = 30;
		Integer num1 = 30;
		num1.floatValue();
		float numF1 = (float) num;
		long longF = 0L;
		long longF1 = 0L;

		double douN = 0;
		Double douN1 = 0.0;

		boolean bYes = true;
		Boolean bYesB = true;

		char char1 = 'A';
		Character char2 = 'B';

		String str1 = "대한민국";

		Integer numInt = 30;
		String str2 = numInt.toString(); // numInt값만 사용하면 사용이안되는데 toString을 이용하면 문자열로 인식하여 사용이가능하다
		str2 = numInt + ""; // 를 사용할수있지만 Java스러운 코드가 아니라 사용을 안함 하는일은 유사하나 틀림 숫자를 문자열로 변환해주는 역할은 같다

		str2 = "10";
		str1 = "9";
		System.out.println(str1 + str2);

		Integer n1 = Integer.valueOf(str1); // 문자열형 숫자를 숫자로 변환해줌
		Integer n2 = Integer.valueOf(str2); // valueof <<형(타입)변환 메서드
		System.out.println(n1 + n2);

		Float fn1 = Float.valueOf(str1);
		Float fn2 = Float.valueOf(str2);
		System.out.println(fn1 + fn2);

		fn1 = Float.valueOf(n1);
		n1 = Integer.valueOf(str2);

		str1 = "대한민국";
		System.out.println(str1.length());

		// " "로 묶인 문자열은 그 자체로 문자열형 객체가 된다.
		System.out.println("우리나라 만세".length());
		String strNation = new String("우리나라 만세");
		System.out.println(strNation.length());

		
		//method를 호출하여 return한 결과를 
		// 또다른 method에 매개 변수로 전달하는 코드의 예
		System.out.println(Arrays.toString("Rebublic of Korea".split("")));
		System.out.println(Integer.valueOf("30") + Integer.valueOf("40")); //변수를 사용하지않고 메서드를 겹쳐서 사용하는 방법이 있다.
	}
}
