package org.project.memberdto;

public class Class1Main {

	public static void main(String[] args) {
		
		
		
		// 인스턴스화 (객체화)
		// new 객체 생성 연산자
		// c1 객체의 주소
		Class1 c1=new Class1();
		// num1, num2, key를 초기화 하고 호출
		
		c1.num1=24;
		c1.num2=32;
		
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		
		c1.setKey("key입니다.");
		
		String key=c1.getKey();
		System.out.println(key);
		
		Class1 c2=new Class1();
		
		c2.num1=100;
		c2.num2=200;
		
		c2.setKey("c2 - key입니다.");
		
		System.out.println(c2.num1);
		System.out.println(c2.num2);
		System.out.println(c2.getKey());
		
		
		Class1.PROJECTNAME="JAVAPROJECT";
		Class1.classMethod();
		System.out.println(Class1.PROJECTNAME);
		
	}
}
