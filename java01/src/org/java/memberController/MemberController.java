package org.java.memberController;

import org.java.dbConnect.DBConnect;
import org.java.memberDto.MemberDto;

public class MemberController {

	public static void main(String[] args) {
		System.out.println("Controller");
		
		DBConnect.getConnection();
		
		MemberDto member1=new MemberDto();
		
		member1.setNo(1);
		member1.setUserId("m11");
		member1.setUserPw("111");

		System.out.println(member1.getNo());
		System.out.println(member1.getUserId());
		System.out.println(member1.getUserPw());
		
		System.out.println(member1.toString());
		
		MemberDto member2=new MemberDto("n11", "111", 2);
		
		System.out.println(member2.getNo());
		System.out.println(member2.getUserId());
		System.out.println(member2.getUserPw());
		
		System.out.println(member2.toString());
		
	}
}
