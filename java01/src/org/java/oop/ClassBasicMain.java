package org.java.oop;

public class ClassBasicMain {

	public static void main(String[] args) {
		
		// Ŭ���� ���, ��ü�� �������� �ʾƵ� ���, ����
		ClassBasic.projectYear=2022;
		ClassBasic.classMethod();
		
		// new = ��ü ����������
		// �ν��Ͻ�ȭ (��üȭ)
		ClassBasic class1=new ClassBasic();
		// �ν��Ͻ� ��� >> ��ü ���� �� ���� ����
		class1.userId="m111";
		class1.userPw="1111";
		class1.userAge=20;
		
		System.out.println(class1.userId);
		System.out.println(class1.userPw);
		System.out.println(class1.userAge);
		
		// private ��� �ʱ�ȭ
		class1.setProjectName("JAVAPROJEST2022");
		// private ��� getter
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
