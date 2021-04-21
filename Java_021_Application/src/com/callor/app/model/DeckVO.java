package com.callor.app.model;

public class DeckVO {
	private String suit;
	private String denomiation;
	private Integer value = 0;
/*
 * 기본 생성 : 매개변수가 없는 생성자
 * super constructor
 * new Deck()처럼 호출
 * 만약 클래스를 정의하고 아무런 생성자를 만들지않으면 기본생성자는 자동으로 만들어져 언제든지 객체를 생성할때 호출 할 수 있다.
 * 
 * 하지만, 매개변수가 (한개라도 있는) 생성자는 만들면
 * 기본생성자는 만들어지지 않는다 . 매개변수가 있는 생성자를 만들면
 * 디폴트값이 생성자를 만들어주는것이 좋다.
 */
	public DeckVO() {
		// TODO Auto-generated constructor stub
	}//생성자end
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomiation() {
		return denomiation;
	}
	public void setDenomiation(String denomiation) {
		this.denomiation = denomiation;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "DeckVO [suit=" + suit + ", denomiation=" + denomiation + ", value=" + value + "]";
	}
	/*
	 * 전체 전역변수를 매개변수로 받는 메서드
	 * 필드 변수를 매개변수로 갇즌 ㄴ생성자
	 * Fied Contruector 
	 * new DeckVO()에 값을 넣어서 호출
	 */

	public DeckVO(String suit, String denomiation, Integer value) {
		super();
		this.suit = suit;
		this.denomiation = denomiation;
		this.value = value;
	}

}
