package org.java.condition;

public class MathRandom {

	public static void main(String[] args) {
		System.out.println("Math.random(난수) 0 <= Math.random( ) < 1");
		
		// 필요한 double형 data출력
		System.out.println(Math.random());
		
		// 0 <= Math.random() < 1
		
		// 0 * 10 <= Math.random() * 10 < 1 * 10
		
		double rad = Math.random() * 10;
		System.out.println("난수(0이상 10 미만)\n" + rad + "\nint형 : " + (int)rad);
		
		for (int i=0; i<10; i++) {
			double rad2 = Math.random()*10;
			System.out.println((int)rad2 + " ");
		}
		
		
		
	}
}
