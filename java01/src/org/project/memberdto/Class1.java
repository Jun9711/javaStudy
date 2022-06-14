package org.project.memberdto;

public class Class1 {

	public int num1;
	public int num2;
	private String key;
	public static String PROJECTNAME="JAVAPROJECT";

	public void instanceMethod() {
		System.out.println("return이 없는 인스턴스 메서드");
	}
	
	public int instanceMethod2() {
		System.out.println("return값이 int 인스턴스 메서드");
		return this.num1+this.num2;
	}
	
	public static void classMethod() {
		System.out.println("클래스 메서드");
	}
	
	public void setKey(String key) {
		this.key=key;
	}
	
	public String getKey() {
		return this.key;
	}
	
}
