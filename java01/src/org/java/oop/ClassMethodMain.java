package org.java.oop;

public class ClassMethodMain {

	public static void main(String[] args) {
		
		ClassMethod c1=new ClassMethod();
		
		c1.method1(); // call
		c1.method2(5, 8);
		
		int sum=c1.method3();
		System.out.println(c1.method3());
		System.out.println(sum);
		
		// Ŭ���� �޼��� ȣ��
		ClassMethod.staticMethod();
		ClassMethod.staticMethod2(8, 20);
		
	}
}
