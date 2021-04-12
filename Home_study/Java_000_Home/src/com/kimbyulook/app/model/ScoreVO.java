package com.kimbyulook.app.model;

public class ScoreVO {

	private String num;
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;
	
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	public Integer getTotal() {
		Integer total = this.kor;
		kor += this.eng;
		kor += this.math;
		return total;
	}
	public Float getAvg() {
		Float avg = (float)this.getTotal() /3;
		avg = Float.valueOf(this.getTotal())/ 3;
		return avg;
	}
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
	
}
