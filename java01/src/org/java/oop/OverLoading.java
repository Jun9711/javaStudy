package org.java.oop;

	public class OverLoading {

		//�����ε� "�޼ҵ���� �Ȱ��� �޼ҵ� �Ű����� ������ ���̰� �ִ� �޼ҵ� ���"
		//���������� ��ȯŸ�� �޼ҵ��(�Ű�����)

	//�����
	public void method() {
		
		//������
		System.out.println("�޼���");
		
	}
	
	//��ȯ Ÿ�԰� �����ص� �����ε� �������� �ʴ´�.
	
	public void method(int num1, String name) {
		System.out.println(name + num1);
	}
	
	public void method(int num1) {
		System.out.println(num1);
	}
	
	//�Ű������� �̸��� �޶� Ÿ���� ������ ���� �޼ҵ� ����Ѵ�.
	
	public void method(String name, int num1) {
		System.out.println(name + num1);
	}
	
	
	
}
