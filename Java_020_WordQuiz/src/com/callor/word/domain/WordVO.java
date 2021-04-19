package com.callor.word.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * model package
 * MVC(model View Controller) 패턴의 프로젝트에서는
 * VO클래스가 저장되는 package를 보통 model로 작성한다
 * 
 * 
 * domain package (=model package=command package 회사마다 다름)
 * DBMS와 연동되는 프로젝트에서 사용하기도 하는 이름 
 * 
 */
//Annotation
//@OVerride
// Annotation으로 키워드를 지정하므로써 
// 단순히 반복 작성ㅎ개야하는 코드를 자동으로 만들어주는 효과를 낸다.

//조건이있다 .반드시 대상의 접근제어자가 private 이여야한다.
@Getter
@Setter
@ToString
public class WordVO {
	
	//정보의 은닉
	private String english;
	private String korea;
	private Integer count;

}
