package org.java.construct;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int num1=scn.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int num2=scn.nextInt();
		
		System.out.println("연산자를 입력하세요(+, -, *, /)");
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
