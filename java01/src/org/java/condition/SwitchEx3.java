package org.java.condition;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int num1=scn.nextInt(); //정수 입력(정수)
		
		System.out.println("두번째 정수를 입력하세요");
		int num2=scn.nextInt(); //정수 입력(정수)
		
		System.out.println("연산기호를 입력하세요(+, -, *, /, %)");
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
		System.out.println("연산의 결과 : " + num1 + " " + op + " " + num2 + "=" + result );
		scn.close();
		
	}
}
