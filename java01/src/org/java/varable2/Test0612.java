package org.java.varable2;

import java.util.Scanner;

public class Test0612 {

	public static void main(String[] args) {
		
		System.out.println("Test_0612");
		System.out.println("Scanner를 이용하여 시작단과 끝단을 입력하여 구구단을 출력.");
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("시작단을 입력하세요.");
		int num1=scn.nextInt();
		
		System.out.println("끝단을 입력하세요.");
		int num2=scn.nextInt();
		
		for(int i=num1; i<=num2; i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
		if(num1<num2) {
			System.out.println("감사합니다.");
		}else {
			System.out.println("시작단은 끝단보다 작거나, 같아야합니다.");
		}
		
	}
}
