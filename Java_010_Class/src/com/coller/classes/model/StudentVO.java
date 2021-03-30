package com.coller.classes.model;

public class StudentVO {
//프라이빗을 선언한후 getter와 setter을 만들어준다
//getter : 값을 꺼내가는것 setter :값을 저장하는 것 >> -getter&setter- 겟터스엔드셋터스라고 부른다 	
	private String num;
	private String name;
	private Integer grade;

	private String addr;
	private String tel;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}

}
