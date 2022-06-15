package org.java.memberDto;

public class MemberDto {

	private String userId; 
	private String userPw;
	private int no;
	
	public MemberDto() {
		System.out.println("기본 생성자");
	}
	
	public MemberDto(String userId, String userPw, int no) {
		System.out.println("다른 생성자2");
		this.userId = userId;
		this.userPw = userPw;
		this.no = no;
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
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return "MemberDto [아이디=" + userId + ", 비밀번호=" + userPw + ", 번호=" + no + "]";
	}
	
	
	
	
}
