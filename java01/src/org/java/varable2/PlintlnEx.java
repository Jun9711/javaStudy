package org.java.varable2;

public class PlintlnEx {

	public static void main(String[] args) {
		
		System.out.println(10+10);		//20
		System.out.println(10+"10");	//1010
		System.out.println(10+10+"10");	//2010
		System.out.println(10+"10"+10);	//101010
		System.out.println(10+10+"");	//"20"
		
		System.out.print("���� ����");
		System.out.printf("%d", 1000); //���� C���� ���� ���
		
		int num1=10;
		int num2=20;
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
}
