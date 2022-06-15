package org.java.construct;

public class Construct1Main {

	public static void main(String[] args) {
		
		Construct1 c1=new Construct1();
		c1.setUserId("a11");
		c1.setUserPw("111");
		System.out.println(c1.getUserId());
		System.out.println(c1.getUserPw());
		
		Construct1 c2=new Construct1("m11");
		c2.setUserPw("121");
		System.out.println(c2.getUserId());
		System.out.println(c2.getUserPw());
		
		Construct1 c3=new Construct1("n11","111");
		System.out.println(c3.getUserId());
		System.out.println(c3.getUserPw());
		
		
	}
}
