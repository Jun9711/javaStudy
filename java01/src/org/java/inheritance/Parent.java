package org.java.inheritance;

public class Parent {

	public int num1;
	public int num2;
	protected int num3;
	
	public Parent() {
		System.out.println("�⺻ ������");
	}
	
	public Parent(int num1, int num2, int num3) {
		System.out.println("�ٸ� ������2");
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public void parentMethod() {
		System.out.println("ParentŬ����");
	}
	
	public void parentMethod2() {
		System.out.println("ParentŬ����2");
	}
	
	// �������̵� �Ұ�.
	final public void finalMethod() {
		System.out.println("Final �޼ҵ�");
	}
	
}