package org.java.operator;

public class Operator3 {

	public static void main(String[] args) {

		System.out.println("��������");

		String userId = "m111";
		String userPw = "1111";

		System.out.println("&& = ��� ������ true�� ���� ������� true");

		System.out.println(userId == "m111" && userPw == "1111");
		System.out.println(userId == "m111" && userPw == "1112");
		System.out.println(userId == "m112" && userPw == "1111");
		System.out.println(userId == "m112" && userPw == "1112");

		if (userId == "m111" && userPw == "1111") {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

		System.out.println("|| = �ϳ� �̻��� ������ true�̸� ������� true");

		if (userId != "m111" || userPw != "1111") {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
	}
}
