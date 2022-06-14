package org.java.oop;

public class ClassBasicMain {

	public static void main(String[] args) {
		
		// 클래스 멤버, 객체를 생성하지 않아도 사용, 공용
		ClassBasic.projectYear=2022;
		ClassBasic.classMethod();
		
		// new = 객체 생성연산자
		// 인스턴스화 (객체화)
		ClassBasic class1=new ClassBasic();
		// 인스턴스 멤버 >> 객체 생성 후 접근 가능
		class1.userId="m111";
		class1.userPw="1111";
		class1.userAge=20;
		
		System.out.println(class1.userId);
		System.out.println(class1.userPw);
		System.out.println(class1.userAge);
		
		// private 멤버 초기화
		class1.setProjectName("JAVAPROJEST2022");
		// private 멤버 getter
		String projectName=class1.getProjectName();
		System.out.println(projectName);
		
		class1.instanceMethod();
		
		System.out.println("===============================");
		
		ClassBasic class2=new ClassBasic();
		
		class2.userId="a111";
		class2.userPw="2222";
		class2.userAge=18;
		
		System.out.println(class2.userId);
		System.out.println(class2.userPw);
		System.out.println(class2.userAge);
		
		class2.instanceMethod();
		
		
	}
}
