package org.java.inheritance;

public class Son1 extends Parent {

	public int num4;
	

	
	@Override
	public void parentMethod() {
		System.out.println("Son1 Class");
	}
	
	@Override
	public void parentMethod2() {
		super.parentMethod2();
		System.out.println("자식 메소드 구현");
	}
	
}
