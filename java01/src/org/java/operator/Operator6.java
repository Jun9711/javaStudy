package org.java.operator;

import java.util.Scanner;

public class Operator6 {

	public static void main(String[] args) {

		System.out.println("XOR������(^)");

		int num1=10;
		int num2=20;

		System.out.println("^(XOR) = ������ ���� �ٸ��� true");

		System.out.println((num1 == 10) + "^" + (num2 ==20) + "=" + (num1 == 10 ^ num2 == 20));
		System.out.println((num1 == 20) + "^" + (num2 ==20) + "=" + (num1 == 20 ^ num2 == 20));
		System.out.println((num1 == 10) + "^" + (num2 ==10) + "=" + (num1 == 10 ^ num2 == 10));
		System.out.println((num1 == 20) + "^" + (num2 ==10) + "=" + (num1 == 20 ^ num2 == 10));


		

	}
}
