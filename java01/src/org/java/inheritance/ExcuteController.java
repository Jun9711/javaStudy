package org.java.inheritance;

import java.util.Scanner;

public class ExcuteController {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("쿼리문을 입력하세요");
			String qer = scn.next();

			InsertCommend ins = new InsertCommend();
			SelectCommend sel = new SelectCommend();
			UpdateCommend upd = new UpdateCommend();
			DeletCommend del = new DeletCommend();

			if (qer.equals("insert")) {
				ins.insertDo();
			} else if (qer.equals("select")) {
				sel.selectDo();
			} else if (qer.equals("update")) {
				upd.updateDo();
			} else if (qer.equals("delete")) {
				del.deleteDo();
			} else if (qer.equals("exit")) {
				System.out.println("반복을 종료합니다.");
				break;
			} else {
				System.out.println("쿼리문 입력 오류입니다.");
			}
		}

	}
}
