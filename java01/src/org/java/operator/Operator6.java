package org.java.operator;

import java.util.Scanner;

public class Operator6 {

	public static void main(String[] args) {

		System.out.println("XOR연산자(^)");

		int num1=10;
		int num2=20;

		System.out.println("^(XOR) = 조건이 서로 다르면 true");

		System.out.println((num1 == 10) + "^" + (num2 ==20) + "=" + (num1 == 10 ^ num2 == 20));
		System.out.println((num1 == 20) + "^" + (num2 ==20) + "=" + (num1 == 20 ^ num2 == 20));
		System.out.println((num1 == 10) + "^" + (num2 ==10) + "=" + (num1 == 10 ^ num2 == 10));
		System.out.println((num1 == 20) + "^" + (num2 ==10) + "=" + (num1 == 20 ^ num2 == 10));


		

	}
}
