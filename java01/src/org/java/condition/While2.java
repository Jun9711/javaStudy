package org.java.condition;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		System.out.println("While");
		
		int i=1;
		while(i<9) {
			System.out.println(i + "���Դϴ�.");
			
			int j=1;
			while(j<10) {
				System.out.println(i + "x" + j + "=" + (i*j));
				j++;
			}
			i++;
		}
		
		System.out.println("========================================");
		
		Scanner scn=new Scanner(System.in);
		System.out.println("������ ���� �ܼ��� �Է��ϼ���. (1~9)");
		int num=scn.nextInt();
		
		while(num<10) {
			System.out.println(num + "���� ����մϴ�.");
			
			int n=1;
			while(n<10) {
				System.out.println(num + "x" + n + "=" + (num*n));
				n++;
			}
			num++;
		}
		
		
		
		
		
	}
}
