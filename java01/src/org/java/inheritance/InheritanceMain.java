package org.java.inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		
		Son1 s1=new Son1();
		s1.num1=10;
		s1.parentMethod();
		s1.parentMethod2();
		
		Son2 s2=new Son2();
		s2.num1=20;
		s2.parentMethod();
		
	}
}
