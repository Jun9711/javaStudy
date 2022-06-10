package org.java.operator;

public class Operator3 {

	public static void main(String[] args) {

		System.out.println("논리연산자");

		String userId = "m111";
		String userPw = "1111";

		System.out.println("&& = 모든 조건이 true일 때만 결과값이 true");

		System.out.println(userId == "m111" && userPw == "1111");
		System.out.println(userId == "m111" && userPw == "1112");
		System.out.println(userId == "m112" && userPw == "1111");
		System.out.println(userId == "m112" && userPw == "1112");

		if (userId == "m111" && userPw == "1111") {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		System.out.println("|| = 하나 이상의 조건이 true이면 결과값이 true");

		if (userId != "m111" || userPw != "1111") {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
		}
	}
}
