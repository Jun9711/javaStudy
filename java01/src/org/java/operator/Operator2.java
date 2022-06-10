package org.java.operator;

public class Operator2 {

	public static void main(String[] args) {

		System.out.println("비교연산자(왼쪽)");

		int num1 = 10;
		int num2 = 5;

		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

		// 문자열
		String str1 = new String();
		String str2 = new String();
		str1 = "java";
		str2 = "java";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		String str3 = "java";

		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));

		String userId = "m111";
		String userPw = "1111";

		if (userId == "m111") {
			System.out.println("로그린 되었습니다.");
		}

	}
}
