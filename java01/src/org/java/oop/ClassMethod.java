package org.java.oop;

public class ClassMethod {

	// �޼��� ���� 1
	public void method1() {
		// �޼��� ȣ�� (call)�� ����Ǵ� �ڵ� ��
		System.out.println("��ȯ��, �Է°��� ����.");
		return; // ��ȯ ���� �����Ƿ� ���� ����
	}
	
	//�޼��� ����2
						//��������(�Ű� ����)
	public void method2(int num1, int num2) {
		int sum=num1+num2;	// ��������(�޼��� �ȿ� ����� ����)
		System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
		//return;
	}
	
	//�޼��� ����3
	//��ȯ Ÿ��
	public int method3() {
		int sum=10+220;
		return sum;
	}
	
	//�޼��� ����4
	public int method4(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}
	
	// Ŭ���� �޼���
	public static void staticMethod() {
		System.out.println("Ŭ���� �޼���");
	}
	
	public static void staticMethod2(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	
	
}
