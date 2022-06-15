package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;

public class ActionController {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		while(true) {
			System.out.println("쿼리문을 입력하세요.(insert/select/update/delete)");
			String qer=scn.next();
			
			ActionInsert ins=new ActionInsert();
			ActionSelect sel=new ActionSelect();
			ActionUpdate up=new ActionUpdate();
			ActionDelete del=new ActionDelete();
			
			if(qer.equals("insert")) {
				ins.insertDo();
			}else if (qer.equals("select")) {
				sel.selectDo();
			}else if (qer.equals("update")) {
				up.updateDo();
			}else if (qer.equals("delete")) {
				del.deleteDo();
			}else if (qer.equals("exit")) {
				System.out.println("반복을 종료합니다.");
				break;
			}else {
				System.out.println("쿼리문 입력 오류입니다.");
			}
			
		}
		
		
	}
}
