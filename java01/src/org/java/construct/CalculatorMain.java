package org.java.construct;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1=scn.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num2=scn.nextInt();
		
		System.out.println("�����ڸ� �Է��ϼ���(+, -, *, /)");
		String op=scn.next();
		
		Calculator c1=new Calculator();
		c1.setNum1(num1);
		c1.setNum2(num2);
		c1.setOp(op);
		c1.cal();
		
		Calculator c2=new Calculator(num1, num2, op);
		c2.cal();
		
		
	}
}
