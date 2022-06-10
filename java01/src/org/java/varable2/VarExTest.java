package org.java.varable2;

import java.util.Scanner;

public class VarExTest {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		final double PI=3.14;
		
		System.out.println("원의 반지름을 입력하시오");
		int r=scn.nextInt();
		double c=r*r*PI;
		System.out.println("공식 : " + r +"*"+r+"*"+PI);
		System.out.println("원의 넓이 : " + c);
		
		
	}
}
