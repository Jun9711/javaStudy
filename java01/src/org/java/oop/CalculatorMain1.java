package org.java.oop;

import java.util.Scanner;

public class CalculatorMain1 {
	// �� ���ڿ� ������(+ - * /)�� �Է¹޾� �޼��� ����
	// ������ �Է� ���� = "������ �Է� �����Դϴ�."
	// while���� �̿��� ��� �ݺ� >> z�Է½� ���� + "�ݺ��� �����մϴ�."
	//�� ���� �Է� setter

	public static void main(String[] args) {
		Calculator1 cal=new Calculator1();
		Scanner scn=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("ù��° ���ڸ� �Է��ϼ���.");
			int num1=scn.nextInt();
			
			System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
			int num2=scn.nextInt();
			
			System.out.println("�����ڸ� �Է��ϼ���.");
			String op=scn.next();
			
			cal.setNum1(num1);
			cal.setNum2(num2);
			
			if(op.equals("+")) {
				cal.add();
			}else if(op.equals("-")) {
				cal.sub();
			}else if(op.equals("*")) {
				System.out.println(num1 + "x" + num2 + "=" + (cal.multi()));
			}else if(op.equals("/")) {
				System.out.println(num1 + "/" + num2 + "=" + (cal.div()));
			}else if (op.equals("z")) {
				System.out.println("�ݺ��� �����մϴ�.");
				break;
			}else {
				System.out.println("������ �Է� �����Դϴ�.");
			}
		}
		
	}
}
