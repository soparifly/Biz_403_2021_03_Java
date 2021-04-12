package com.callor.app.service;
/*
 * interface
 * 클래스를 만들기위한 설계도 (prototype)역할수행
 * 팀프로젝트에서 여러팀원이 같은 연산을 수행하는 클래스를 만들때
 * method의 이름을 통일하여 이후에 이후에 프로젝트를 통합할때
 * 발생하는 오류를 최소화하기 위함이다
 * 
 * inteface를 implements 한 클래스는 interface에 지정된 메소드를 반드시 구현해야한다
 * 
 * 
 * interface와 관련된 클래스를 사용하여 객체를 생성한후
 * 	메서드를 호출하는 코드를 통해 연산을 수행하는 측에서는 
 * 아직 메서드 코드가 구현이 덜되었더라도 자신의 코드를 진행할수 있도록
 * 한다
 * 
 * 
 */
public interface ScoreService {

	
	public void selectMenu();
	public void inputScore();
	public void printScore();
	public void saveScore();
	public void readScore();
	public Integer checkScore();
	
}
