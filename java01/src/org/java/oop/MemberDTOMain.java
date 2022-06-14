package org.java.oop;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class MemberDTOMain {
	
	public static void main(String[] args) {
		

	MemberDTO member1=new MemberDTO();
	
	member1.setUserId("m111");
	member1.setUserPw("1111");
	member1.setUserName("홍길동");
	member1.setUserAge(26);
	member1.setUserAddr("서울특별시 노원구");
	member1.setUserPhone("010-1234-5678");
	member1.setDay(new Date());
	
	String userId=member1.getUserId();
	String userPw=member1.getUserPw();
	String userName=member1.getUserName();
	int userAge=member1.getUserAge();
	String userAddr=member1.getUserAddr();
	String userPhone=member1.getUserPhone();
	Date day=member1.getDay();
	
	SimpleDateFormat sDay=
			new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	String now=sDay.format(day);
	
	System.out.println("Id : "+userId);
	System.out.println("Pw : "+userPw);
	System.out.println("Name : "+userName);
	System.out.println("Age : "+userAge);
	System.out.println("Addr : "+userAddr);
	System.out.println("Phone : "+userPhone);
	System.out.println("Date : "+now);
	
	System.out.println();
	System.out.println("==============================================");
	System.out.println();
	
	MemberDTO member2=new MemberDTO();
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Input your Id");
	member2.setUserId(scn.next());
	System.out.println("Input your Pw");
	member2.setUserPw(scn.next());
	System.out.println("Input your Name");
	member2.setUserName(scn.next());
	System.out.println("Input your Age");
	member2.setUserAge(scn.nextInt());
	System.out.println("Input your Addr");
	member2.setUserAddr(scn.next());
	System.out.println("Input your Phone-Number");
	member2.setUserPhone(scn.next());
	member2.setDay(new Date());
	
	System.out.println("Id : " + member2.getUserId());
	System.out.println("Pw : " + member2.getUserPw());
	System.out.println("Name : " + member2.getUserName());
	System.out.println("Age : " + member2.getUserAge());
	System.out.println("Addr : " + member2.getUserAddr());
	System.out.println("Phone : " + member2.getUserPhone());
	System.out.println("Today : " + sDay.format(member2.getDay()));
	
	
	
	}
}
