package org.java.varable2;

import java.util.Scanner;

//import java.util.Scanner;
//java,lang ������ �ڹ��� �⺻ ��Ű��, �ڵ����� import�Ѵ�.
public class ScannerEx1 {

	public static void main(String[] args) {
		
		System.out.println("Scanner �ǽ�");
		
		Scanner scn=new Scanner(System.in); //�ֿܼ� �Է�
		//new = ��ü ���� ������ (��ü�� �ּҰ� �Է�)
		
		System.out.println("ù��° ���� �Է�");
		int i1=scn.nextInt();				//������ data�Է�
		System.out.println("�Է°� : "+i1);
		
		System.out.println("�ι�° ���� �Է�");
		int i2=scn.nextInt();
		System.out.println("�Է°� : "+i2);
		
		System.out.println(i1 + "+" + i2 + "=" + (i1+i2));
		System.out.println(i1 + "-" + i2 + "=" + (i1-i2));
		System.out.println(i1 + "/" + i2 + "=" + (i1/i2));
		System.out.println(i1 + "*" + i2 + "=" + (i1*i2));
		
		System.out.println("�����ڸ� �Է��غ�����.");
		
		String str=scn.next(); // ���ڿ��� �Է�
		
		System.out.println("�Էµ� ������ : " + str);
		
		scn.close();
		
	}
}
