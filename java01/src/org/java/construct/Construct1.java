package org.java.construct;

public class Construct1 {

	private String userId;
	private String userPw;
	
	public Construct1() {
		System.out.println("�⺻������1");
	}
	
	public Construct1(String userId) {
		this.userId=userId;
		System.out.println("�ٸ� ������2");
	}
	public Construct1(String userId, String userPw) {
		this.userId=userId;
		this.userPw=userPw;
		System.out.println("�ٸ� ������3");
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
	
}
