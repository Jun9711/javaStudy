package org.java.varable2;

public class TypeCasting {

	public static void main(String[] args) {
		
		System.out.println("형변환");
		//
		byte b1=10;
		byte b2=20;
		
		//
		byte b3=(byte)(b1+b2); //강제형변환
		int i=b1+b2;
		System.out.println(i);
		//
		int i2=10;
		double d=1.1;
		int i22=(int)(i2+d);
		
		double d2=i2+d;
		System.out.println(d2);
		
		int i3=i2+(int)d;
		int i4=(int)(i2+d);
		System.out.println(i3);
		System.out.println(i4);
	}
}
