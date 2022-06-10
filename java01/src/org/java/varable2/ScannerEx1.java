package org.java.varable2;

import java.util.Scanner;

//import java.util.Scanner;
//java,lang 까지는 자바의 기본 패키지, 자동으로 import한다.
public class ScannerEx1 {

	public static void main(String[] args) {
		
		System.out.println("Scanner 실습");
		
		Scanner scn=new Scanner(System.in); //콘솔에 입력
		//new = 객체 생성 연산자 (객체의 주소값 입력)
		
		System.out.println("첫번째 숫자 입력");
		int i1=scn.nextInt();				//정수형 data입력
		System.out.println("입력값 : "+i1);
		
		System.out.println("두번째 숫자 입력");
		int i2=scn.nextInt();
		System.out.println("입력값 : "+i2);
		
		System.out.println(i1 + "+" + i2 + "=" + (i1+i2));
		System.out.println(i1 + "-" + i2 + "=" + (i1-i2));
		System.out.println(i1 + "/" + i2 + "=" + (i1/i2));
		System.out.println(i1 + "*" + i2 + "=" + (i1*i2));
		
		System.out.println("연산자를 입력해보세요.");
		
		String str=scn.next(); // 문자열을 입력
		
		System.out.println("입력된 연산자 : " + str);
		
		scn.close();
		
	}
}
