package com.callor.apps.model;
/*
 * ScoreVO클래스 선언
 * ScoreVO 클래스에는 5개의 변수가 포함되어있고. 
 * 이 5개의 변수는 반드시 ScoreVO클래스를 객체로 선언한 후 사용할수있다.
 */
public class ScoreVO {

	/*
	 * 현재 ScoreVO클래스에는
	 * 7개의 변수와 
	 * 2개의 method 설계되어 있
	 * 는 상태이다
	 *  이 클래스를 사용하여 만들어진 객체에는 7개의 변수와 2개의 mehtod가 포함된 상태로완성이된다,
	 */
//	 한번 객체로 생성이되면, 내부의 변수들은 절대다른 데이터와 혼동되지 않는다
	
	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	/*
	 * kor,eng,math 변수는 main()method에서 사용자에 의해 값을 저장하기위한 변수이다.
	 * total, avg는 3과목의 점수를 사용하여 연산한후 연산결과를 저장하기위한 변수이다.
	 * kor,eng,math 는 어디에서든지 저장, 읽기가 가능한상태이여야하므로 public 으로 선언한다.
	 * 
	 * 그러나
	 * total, avg 변수도 public 으로 선언을 해두었더니 실제 계산된 결과와 상관없이 임의의 값을 저장할수 있게 되었다.
	 * 코드가 진행되는 과정에서 total에 임의의 값이 저장되면
	 * 평균 값이 엉뚱하게 계산이 되는 결과가 나타난다.
	 * 이런경우 total , avg변수를 임의로 수정(저장)하지 못하도록 
	 * 막는 장치가 필요하다.
	 * 
	 * VO클래스의 맴버변수를 private으로 선언하면
	 * 다른곳에서 객체를 통해 (.연결연산자를 통해)직접 접근이 불가능해진다.
	 * 
	 * total, avg를 private로 선언하면 누구도 직접 total,avg에 값을 저장할수 없다.
	 * total, avg를 변수에 담긴 값을 통해 객체를 통해 읽기 하기 위해 getTotal(),getAvg()메서드를 만들어두었다
	 * 
	 * 이제부터 total과 avg 변수는 저장기능은 되지않고 getTotal(),getAvg() 메서드를 통해 읽기만 가능한상태가 되었다
	 * 
	 */
	private int total;
	private float avg;
	
	public int getTotal() {
		this.total = this.kor + this.eng +this.math;
		return this.total;
	}
	public float getAvg() {
//		int intTotal = this.getTotal();
		int intTotal = this.total;
		float floatAvg = (float)intTotal /3;
		 return  floatAvg;
	}
}
