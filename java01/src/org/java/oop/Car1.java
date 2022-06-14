package org.java.oop;

public class Car1 {
	
	// 멤버
	// 인스턴스 멤버 (필드)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	
	// final상수는 생성과 동시에 초기화해야한다
	// ex) public static final String SITY="서울";
	public static String CITY;
	
	//private setter, getter 메서드 생성
	private String option1;
	private String option2;
	
	//setters >> private멤버 초기화
	public void setOption1(String option1) {
		this.option1=option1;
	}
	public void setOption2(String option2) {
		this.option2=option2;
	}
	
	//getters >> private멤버 get
	public String getOption1() {
		return this.option1;
	}
	public String getOption2() {
		return this.option2;
	}
	
	//인스턴스 멤버(메서드)
	public void instanceMethod() {
		System.out.println("자동차 이름 : "+this.carName);
	}
	public void instanceMethod2() {
		System.out.println("자동차 가격 : "+this.carCoin);
	}
	public void instanceMethod3() {
		System.out.println("자동차 연식 : "+this.carYear);
	}
	public void instanceMethod4() {
		System.out.println("자동차 너비 : "+this.carWidth);
	}
	@Override
	public String toString() {
		return "Car1 [carName=" + carName + ", carCoin=" + carCoin + ", carYear=" + carYear + ", carWidth=" + carWidth
				+ ", option1=" + option1 + ", option2=" + option2 + "]";
	}
	
	

	
	
}
