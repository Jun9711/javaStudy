package org.java.memberDto;

public class MemberDto {

	private String userId; 
	private String userPw;
	private int no;
	
	public MemberDto() {
		System.out.println("�⺻ ������");
	}
	
	public MemberDto(String userId, String userPw, int no) {
		System.out.println("�ٸ� ������2");
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
		return "MemberDto [���̵�=" + userId + ", ��й�ȣ=" + userPw + ", ��ȣ=" + no + "]";
	}
	
	
	
	
}
