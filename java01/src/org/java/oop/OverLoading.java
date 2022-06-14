package org.java.oop;

	public class OverLoading {

		//오버로딩 "메소드명이 똑같고 메소드 매개변수 유형이 차이가 있는 메소드 허용"
		//접근제한자 변환타입 메소드명(매개변수)

	//선언부
	public void method() {
		
		//구현부
		System.out.println("메서드");
		
	}
	
	//변환 타입과 상이해도 오버로딩 성립하지 않는다.
	
	public void method(int num1, String name) {
		System.out.println(name + num1);
	}
	
	public void method(int num1) {
		System.out.println(num1);
	}
	
	//매개변수의 이름이 달라도 타입이 같으면 감은 메소드 취급한다.
	
	public void method(String name, int num1) {
		System.out.println(name + num1);
	}
	
	
	
}
