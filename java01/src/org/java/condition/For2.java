package org.java.condition;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("구구단");
		
	
		
		
		//구구단
		for (int i=2; i<10; i++) {
			System.out.println(i + "단 입니다.");
			for (int j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + (j*i));
			}
		}
		System.out.println("=======================================");
		
		for (int k=9; k>1; k--) {
			System.out.println(k + "단 입니다.");
			for (int n=9; n>0; n--) {
				System.out.println(k + "x" + n + "=" + (k*n));
			}
		}
		
		//Scanner 클래스를 이용해서 시작단을 입력하면 해당 구구단이 출력되게 만들 것
		System.out.println("구구단 출력을 위한 정수를 입력하세요(1~9)");
		Scanner scn=new Scanner(System.in);
		
		System.out.println("시작단 입력");
		int num1=scn.nextInt();
		
		System.out.println("끝단 입력");
		int num2=scn.nextInt();
		
		if(num1>num2) {
			System.out.println("시작단이 끝단보다 작거나 같아야 합니다.");
		}
		for(int x=num1; x<=num2; x++) {
			System.out.println(num1 + "단을 출력합니다.");
			for (int y=1; y<10; y++) {
				System.out.println(x+ "x" + y + "=" + (x*y));
			}
//			System.out.println(num1 + "x" + x + "=" + (num1*x));
		}
		
		
		
		
		
		
		
	}
}
