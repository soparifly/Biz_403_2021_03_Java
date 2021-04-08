package com.callor.app.model;

/*
 * 성적처리를 하기위한 VO클래스
 * 학번, 학생이름, 국어, 영어, 수학, 총점, 평균
 * 
 */
public class ScoreVO {
/*
 *  java 소스 코드인 클래스 파일은 보통 public class 클래스 클래스명 {} 형식으로 만들어진다
 *  이때 extends 키워드를 사용하여 다른 클래스를 
 *  상속하면,  상속하면 클래스에 정의된 메소드를 변수를 물려받아 사용할수 있다
 *  
 *  클래스를 만들때 extends 키워드를 않으면 모든 클래스는 자동으로 extends Object 명령문이 추가되는것과 같다
 *  
 *  Object 클래스는 Java의 모든 클래스의 조상이다.
 *  	Object 클래스에는 시스템적 , 메모리적인 메서드들이있다.
 *  	이러한 메서드들은 특별한 용도로 사용한다
 *  	하지만 Object클래스에 정의되어있는 메서드는 일반적인 개발을 할때는 별로 사용을 하지않는다
 *  	
 *  보통 클래스를 만들때 Object로 부터 상속 받은 여러 메서드들 중에  
 *  to String () 메서드를 재정의 하여 디버깅 용도등으로 활용을 한다
 */
	
	private String num;
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
		Integer sum = this.kor;
		sum += this.eng;
		sum += this.math;
		return sum;
	}
	public float getAvg() {
		Integer sum = this.kor;
		sum += this.eng;
		sum += this.math;
		float avg = (float)sum /3;
		return avg;
	}

//	@Override //재정의 상속받을 클래스에있는 method를 내맘대로 다시만들어쓰기
//	재활용
//	toString() method는 Object 클래스로부터 상속받은
//	모든 클래스로 만든 객체에서 호출할수 있다.
//	VO클래스에서는 VO의 변수들에 담긴 값을 확인하는 용도로 재정의 하여 활용한다
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	
	}
//	제너레이터 투스트링 
	
}
