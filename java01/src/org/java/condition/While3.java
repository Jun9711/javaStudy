package org.java.condition;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		System.out.println("do-While");
		
		int i=2;
		do {
			System.out.println(i+"단 입니다.");
			int j=1;
			do {
				System.out.println(i+"x"+j+"="+(i*j));
				j++;
			}while(j<10);
			i++;
		}while(i<10);
		
		
		
		
		
	}
}
