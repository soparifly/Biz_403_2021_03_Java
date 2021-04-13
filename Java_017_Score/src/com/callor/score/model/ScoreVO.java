package com.callor.score.model;

/*
 * 데이터를 담아서 정보처리를 수행할때
 * 편리하게 데이터를 묶어서 관리하기 위한 클래스
 * VO를 만드는 작업: 데이터 모델링(설계하기)
 * 1. 추상화
 * 2. 정보은닉
 * 3. 캡슐화
 * 4. 재정의(Override)
 * 
 * 
 * 모델링된 ScoreVO를 실제로 사용할때는 객체로 생성한다
 * 
 *  ex) ScoreVO scoreVO = new ScoreVO();
 * 필요할때마다 객체로 생성하고 , 데이터를 setter하고 
 * 연산을 수행하고 데이터를 Getter하는 방식으로 활용한다.
 * 
 * 
 * 
 * 아래 항목이 DB에서는 Entity모델링 이라고한다.
 *  실제로 모델링된 entity를 data Table로 생성하여 사용한다
 *  한번 Table를 생성하고 영구적으로 사용한다
 *  
 *
 */
public class ScoreVO {

	private String num;
	private String name;

	//VO 클래스에 숫자형 변수를 선언할때
	//primitive 형이 아닌 wrapper클래스형으로 선언할때는
	// 0으로 clear를 해주자
	// 이러한 불편을 방지하기 위하여 primitive형으로 만들기도 하지만
	//null값을 취급하기가 어려운 단점이 발생한다.
	
	private Integer kor = 0;
	private Integer eng = 0;
	private Integer math = 0;
//	private Integer total;
//	private Float avg
	
	/*
	 * VO 클래스를 모델링하고
	 * 변수를 private으로 선언하였다 : 정보 은닉
	 * 은닉된 변수에 접근하기 위하여 Getter, Setter method를 생성
	 * 
	 * getter와 setter를 생성하고 봤더니
	 * 총점(total)과 평균(avg)는 점수가 입력되면 항상 
	 * 계산되어야 하는 항목이다.
	 * 즉, 외부에서 이변수에 값을 저장할일이 별로 없을 것 같다
	 * 1. total ,avg변수를 삭제하고 
	 * 2. total, avg변수의 setter method를 삭제한다
	 * 외부에서 total,avg값을 요청하면 그때그때 계산하여 return을 하면될거같다,
	 *
	 */
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
	
	
	/*
	 * 
	 * <캡슐화>
	 * 외부에서 객체.getTotal()메서드를 호출하면 과목의 총점을 return받을수 있다,
	 * 실제 코드는 세과목의 총점을 계산하고
	 * 계산된 결과를 return하는 구조로 되어있다
	 * 하지만 외부에서는  실제 코드가 어떻게 작동하는 지 몰라도 또는 관심갖지 않아도
	 * 상관없이 getTotal() method는 당연히 잘 계싼된 총점 결과를 알려눋나는 것을 알고 있다.
	 * 이렇게 내부 코드를 감추고 (외부에 노출하지 않고도)
	 * 기능을 충실히 수행할 수 있도록하는것
	 * 겟할값만 필요함 (캡슐화)
	 */
	public Integer getTotal() {
		Integer total = this.kor;
		total += this.eng;
		total += this.math;
				
		return total;
	}

	public Float getAvg() {
		Float avg= (float)this.getTotal() / 3;
		return avg;
	}
	/*
	 * 
	 * override
	 * 
	 * toString() method는 object클래스에 정의되어있으며
	 * 모든 클래스는 자동적으로 object클래스를 상속 받는다
	 * 따라서 ScoreVO클래스에는 자동적으로 toString 메서드가 있는것처럼 동작할것이다
	 * 하지만, object클래스에 정의된 toString method는 사용하는데 의미가 없다 (주소값만호출함)
	 * toString method를 VO객체의 변수에 담긴 값들을 문자열로 만들어 return하는 코드로 다시작성을 한다
	 * 이제 vo객체.toString() method를 호출하면
	 * vo객체의 변수들에 담긴 값들이 출력될것이다.
	 */
	@Override
	public String toString() {
		return "ScoreVO [num=" + num 
				+ ", name=" + name 
				+ ", kor=" + kor 
				+ ", eng=" + eng 
				+ ", math=" + math 
				+ ",total="+ this.getTotal() + ",avg = "+this.getAvg()+"]";
	}


}
