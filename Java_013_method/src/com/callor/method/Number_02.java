package com.callor.method;

public class Number_02 {

	public static void main(String[] args) {
		
		
		String strNum1 = "100";
		String strNum2 = "100.0";
		
		
		int intNum1 = Integer.parseInt(strNum1);
		float floatNum2 = Float.parseFloat(strNum2);
		
		/*
		 * 데이터를 단독으로 처리할때는 큰 문제가 없는데 파일에 저장, 파일에서 읽기 
		 * 네트워크 (인터넷 )등을 통하여 전송 (공유 ) 등으로 데이터가 컴퓨터와 컴퓨터간에 이동할때
		 * 데이터를 효율적이고 , 오류가 나지 않도록 이동하는 다양한 방법이 있다.
		 * 여러가지 방법이 취하는 많은 공통된 부분에 모든 데이터를 문자열화 하여 전송하는 방법이 있다
		 * 
		 * 숫자 문자, 특수기호 등을 문자열(ASCII코드)로 전송하고, 받는곳에서 사용하기전에 적절한 type으로 변경하여 사용한다
		 * java에서는 wrapper class.pase*()method나 wrapperClass.ValueOF()ㅡ method를 사용하여 문자열형숫자를 숫자값으로변호나시키는것을 지원한다ㅣ
		 * 이과정에서숫자값으로 변환할수 없는 문자열이 섞여있는경우 NumberFormatException이 발생할수 있다.
		 */
		
		intNum1 = Integer.valueOf(30 + "");
		//오류가안나는이유  // "30" 으로인식한다 //숫자열과 같이사용하면 사용가능하다
		intNum1 = Integer.valueOf(""+30);
		intNum1 = Integer.valueOf("100");
		//exception이 발생하는 코드들 
//		intNum1 = Integer.valueOf(100 + "^");
//		intNum1 = Integer.valueOf(" 100");
//		intNum1 = Integer.valueOf("100 ");
//		intNum1 = Integer.valueOf("100 00");
//		intNum1 = Integer.valueOf("A100");
//		intNum1 = Integer.valueOf("100*100");
//		intNum1 = Integer.valueOf("A100*");
		//""은 null과 유사한 값이다.
		//java에서는 "" 과 null을 다르게 취급한다
		//다른 언어에서는 같다고 보기도한다
		intNum1 = Integer.valueOf("");
		intNum1 = Integer.valueOf(null);
		
				
		
		
	}
}
