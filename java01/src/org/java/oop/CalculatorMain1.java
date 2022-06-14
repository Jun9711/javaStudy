package org.java.oop;

import java.util.Scanner;

public class CalculatorMain1 {
	// 두 숫자와 연산자(+ - * /)를 입력받아 메서드 실행
	// 연산자 입력 오류 = "연산자 입력 오류입니다."
	// while문을 이용해 계속 반복 >> z입력시 종료 + "반복을 종료합니다."
	//두 숫자 입력 setter

	public static void main(String[] args) {
		Calculator1 cal=new Calculator1();
		Scanner scn=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("첫번째 숫자를 입력하세요.");
			int num1=scn.nextInt();
			
			System.out.println("두번째 숫자를 입력하세요.");
			int num2=scn.nextInt();
			
			System.out.println("연산자를 입력하세요.");
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
				System.out.println("반복을 종료합니다.");
				break;
			}else {
				System.out.println("연산자 입력 오류입니다.");
			}
		}
		
	}
}
