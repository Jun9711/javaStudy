package org.java.varable2;

//Ŭ���� VarSub
public class VarSub {

	//��� : �ʵ�, �޼���, ������
	
	//�ʵ� (�Ӽ�)
	public int num1;
	public static int num2;
	private int num3;
	
	public void sum() {
		System.out.println(num1+num2);
	}
	// �ν��Ͻ� �޼��� (method)
	public void method(int num1, int num2) {
		
		// �������� (�޼���) num1, num2, num3
		int num3=num1+num2;
		
		System.out.println(num3);
	}
}
