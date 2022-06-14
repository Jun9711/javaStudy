package org.java.oop;

public class ClassBasic {

	// 필드(속성)
	public String userId;
	public String userPw;
	public int userAge;
	
	// 캡슐화
	private String projectName;
	
	// class member (static)
	public static int projectYear = 2022;
	
	public ClassBasic() {
		// 객체 생성시 필요한 매서드
		System.out.println("생성자(constructor)");
	}
	

	// 매서드
	// 인스턴스매서드
	public void instanceMethod() {
		System.out.println("인스턴스매서드");
	}
	
	// 클래스 매서드
	public static void classMethod() {
		System.out.println("클래스 매서드");
	}
	
	// getters, setters
	// private 멤버 (필드)를 초기화 set	
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
