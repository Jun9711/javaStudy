package org.java.oop;

public class ClassMethod {

	// 메서드 유형 1
	public void method1() {
		// 메서드 호출 (call)시 실행되는 코드 블럭
		System.out.println("반환값, 입력값이 없다.");
		return; // 반환 값이 없으므로 생략 가능
	}
	
	//메서드 유형2
						//지역변수(매개 인자)
	public void method2(int num1, int num2) {
		int sum=num1+num2;	// 지역변수(메서드 안에 선언된 변수)
		System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
		//return;
	}
	
	//메서드 유형3
	//반환 타입
	public int method3() {
		int sum=10+220;
		return sum;
	}
	
	//메서드 유형4
	public int method4(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}
	
	// 클래스 메서드
	public static void staticMethod() {
		System.out.println("클래스 메서드");
	}
	
	public static void staticMethod2(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	
	
}
