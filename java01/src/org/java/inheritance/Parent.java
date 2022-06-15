package org.java.inheritance;

public class Parent {

	public int num1;
	public int num2;
	protected int num3;
	
	public Parent() {
		System.out.println("기본 생성자");
	}
	
	public Parent(int num1, int num2, int num3) {
		System.out.println("다른 생성자2");
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public void parentMethod() {
		System.out.println("Parent클래스");
	}
	
	public void parentMethod2() {
		System.out.println("Parent클래스2");
	}
	
	// 오버라이드 불가.
	final public void finalMethod() {
		System.out.println("Final 메소드");
	}
	
}