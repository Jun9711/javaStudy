package org.project.memberdto;

public class Class1Main {

	public static void main(String[] args) {
		
		
		
		// �ν��Ͻ�ȭ (��üȭ)
		// new ��ü ���� ������
		// c1 ��ü�� �ּ�
		Class1 c1=new Class1();
		// num1, num2, key�� �ʱ�ȭ �ϰ� ȣ��
		
		c1.num1=24;
		c1.num2=32;
		
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		
		c1.setKey("key�Դϴ�.");
		
		String key=c1.getKey();
		System.out.println(key);
		
		Class1 c2=new Class1();
		
		c2.num1=100;
		c2.num2=200;
		
		c2.setKey("c2 - key�Դϴ�.");
		
		System.out.println(c2.num1);
		System.out.println(c2.num2);
		System.out.println(c2.getKey());
		
		
		Class1.PROJECTNAME="JAVAPROJECT";
		Class1.classMethod();
		System.out.println(Class1.PROJECTNAME);
		
	}
}
