package org.java.oop;

public class ClassBasic {

	// �ʵ�(�Ӽ�)
	public String userId;
	public String userPw;
	public int userAge;
	
	// ĸ��ȭ
	private String projectName;
	
	// class member (static)
	public static int projectYear = 2022;
	
	public ClassBasic() {
		// ��ü ������ �ʿ��� �ż���
		System.out.println("������(constructor)");
	}
	

	// �ż���
	// �ν��Ͻ��ż���
	public void instanceMethod() {
		System.out.println("�ν��Ͻ��ż���");
	}
	
	// Ŭ���� �ż���
	public static void classMethod() {
		System.out.println("Ŭ���� �ż���");
	}
	
	// getters, setters
	// private ��� (�ʵ�)�� �ʱ�ȭ set	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	public String getProjectName() {
		return this.projectName;
	}
	
	@Override
	public String toString() {
		return "ClassBasic [userId=" + userId + ", userPw=" + userPw + ", userAge=" + userAge + ", projestName="
				+ projectName + "]";
	}
	
	
	
}
