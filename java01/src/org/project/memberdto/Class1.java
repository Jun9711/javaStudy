package org.project.memberdto;

public class Class1 {

	public int num1;
	public int num2;
	private String key;
	public static String PROJECTNAME="JAVAPROJECT";

	public void instanceMethod() {
		System.out.println("return�� ���� �ν��Ͻ� �޼���");
	}
	
	public int instanceMethod2() {
		System.out.println("return���� int �ν��Ͻ� �޼���");
		return this.num1+this.num2;
	}
	
	public static void classMethod() {
		System.out.println("Ŭ���� �޼���");
	}
	
	public void setKey(String key) {
		this.key=key;
	}
	
	public String getKey() {
		return this.key;
	}
	
}
