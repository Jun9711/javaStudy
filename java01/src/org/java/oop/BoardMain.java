package org.java.oop;

import java.util.Date;

public class BoardMain {

	public static void main(String[] args) {
		
		BoardDto board=new BoardDto();
		
		board.setNo(1);
		board.setTitle("����");
		board.setMemo("����");
		board.setDay(new Date());
		
		System.out.println(board.getNo());
		System.out.println(board.getTitle());
		System.out.println(board.getMemo());
		System.out.println(board.getDay());
		
	}

	
}
