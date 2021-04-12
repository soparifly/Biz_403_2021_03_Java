package com.collor.classes.model;
/*
 * 매입 매출 프로젝트 (마트,평의점, 쇼핑몰 등에서 공산품을 구매하여 고객에게 마진을 붙여 판매하고 이익금등을 계산하는 프로젝트
 * 
 * 소매점, 도매점(생산공장에서 구매하를 하여, 소매점에 판매하는것)
 * 소매점(도매점 등으로 부터 구매하여 일반소비자 에게 판매하는것)
 * 필요한 데이터항목 (입력이 필요한 데이터항목)
 * <VO클래스추상화단계>
 * 상품이름(pname)String,
 * 거래일자(date), 문자열 (날짜형 데이터가 별도로 있으나 이슈가있기때문에 거의 사용하지않음)
 * 거래처(dname),String
 * 매입매출구분(inout)String
 * 수량(qty),Integer
 * 매입단가(iprice),Integer
 * 매출단가(oprice),Integer
 * 
 */
public class IolistVO {

//	<정보의 은닉하기>
	private String pname;
	private String date;
	private String dname;
	private String inout;
	private Integer qty;
	private Integer iprice;
	private Integer oprice;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getInout() {
		return inout;
	}
	public void setInout(String inout) {
		this.inout = inout;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getIprice() {
		return iprice;
	}
	public void setIprice(Integer iprice) {
		this.iprice = iprice;
	}
	public Integer getOprice() {
		return oprice;
	}
	public void setOprice(Integer oprice) {
		this.oprice = oprice;
	}
}
