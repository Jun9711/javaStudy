package org.java.varable2;

import java.util.Scanner;

public class VarExTest {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		final double PI=3.14;
		
		System.out.println("���� �������� �Է��Ͻÿ�");
		int r=scn.nextInt();
		double c=r*r*PI;
		System.out.println("���� : " + r +"*"+r+"*"+PI);
		System.out.println("���� ���� : " + c);
		
		
	}
}
