package org.java.varable2;

import java.util.Scanner;

public class Test0612 {

	public static void main(String[] args) {
		
		System.out.println("Test_0612");
		System.out.println("Scanner�� �̿��Ͽ� ���۴ܰ� ������ �Է��Ͽ� �������� ���.");
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("���۴��� �Է��ϼ���.");
		int num1=scn.nextInt();
		
		System.out.println("������ �Է��ϼ���.");
		int num2=scn.nextInt();
		
		for(int i=num1; i<=num2; i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
		if(num1<num2) {
			System.out.println("�����մϴ�.");
		}else {
			System.out.println("���۴��� ���ܺ��� �۰ų�, ���ƾ��մϴ�.");
		}
		
	}
}
