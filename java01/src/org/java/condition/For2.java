package org.java.condition;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("������");
		
	
		
		
		//������
		for (int i=2; i<10; i++) {
			System.out.println(i + "�� �Դϴ�.");
			for (int j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + (j*i));
			}
		}
		System.out.println("=======================================");
		
		for (int k=9; k>1; k--) {
			System.out.println(k + "�� �Դϴ�.");
			for (int n=9; n>0; n--) {
				System.out.println(k + "x" + n + "=" + (k*n));
			}
		}
		
		//Scanner Ŭ������ �̿��ؼ� ���۴��� �Է��ϸ� �ش� �������� ��µǰ� ���� ��
		System.out.println("������ ����� ���� ������ �Է��ϼ���(1~9)");
		Scanner scn=new Scanner(System.in);
		
		System.out.println("���۴� �Է�");
		int num1=scn.nextInt();
		
		System.out.println("���� �Է�");
		int num2=scn.nextInt();
		
		if(num1>num2) {
			System.out.println("���۴��� ���ܺ��� �۰ų� ���ƾ� �մϴ�.");
		}
		for(int x=num1; x<=num2; x++) {
			System.out.println(num1 + "���� ����մϴ�.");
			for (int y=1; y<10; y++) {
				System.out.println(x+ "x" + y + "=" + (x*y));
			}
//			System.out.println(num1 + "x" + x + "=" + (num1*x));
		}
		
		
		
		
		
		
		
	}
}
