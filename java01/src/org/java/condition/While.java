package org.java.condition;

public class While {

	public static void main(String[] args) {
		
		int i2=0;
		
		while(true) {
//			System.out.println(i2);
			
			i2++;
			
			if(i2<10) {
				System.out.println(i2 + " ");
			}
			else {
				break;
			}
		}
	}
}
