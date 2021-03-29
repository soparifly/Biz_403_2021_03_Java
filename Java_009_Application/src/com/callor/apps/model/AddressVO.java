package com.callor.apps.model;
/*
 * 주소록 관리를 위한 프로젝트를 수행하기위해
 * 주소록 데이터를 저장할 클래를 설계하기
 * 
 * 이름, 전화번호, 주소, email, 관계, 나이,  카카오톡ID, 인스타그램.. 등등이 있다.
 * 
 * 		<추상화단계>
 * 지금 내가 만들고자 하는 프로젝트에서 어떤 데이터가 반드시 필요한가 , 또는 없어도되는 데이터는 무엇인가를 판단하여 
 * 간추려내는 작업
 * 이름, 휴대전화, email, 관계만 필요할때 이런식의 분류를 <추상화 단계>라고한다
 */


// VO클래스 
/*
 * value object (값을 담는 객체) : 데이터를 저장하는 용도의 객체
 * Dto : Date Transfer Object //아래와같이 변수를 담는데 주로 사용하는 클래스이다.
 * 
 */
public class AddressVO {
/*
 * 추상화 과정을 거쳐 간추려진 데이터를 저장할 변수 선언
 */
	
	public String name;
	public	String cellPhone;
	public	String email;
	public	String chain;
	public String address;
	
}
