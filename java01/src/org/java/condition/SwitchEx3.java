package org.java.condition;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���");
		int num1=scn.nextInt(); //���� �Է�(����)
		
		System.out.println("�ι�° ������ �Է��ϼ���");
		int num2=scn.nextInt(); //���� �Է�(����)
		
		System.out.println("�����ȣ�� �Է��ϼ���(+, -, *, /, %)");
		char op =scn.next().charAt(0);
		
		int result=0;
		
		switch (op) 
		{
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;

		}
		System.out.println("������ ��� : " + num1 + " " + op + " " + num2 + "=" + result );
		scn.close();
		
	}
}
