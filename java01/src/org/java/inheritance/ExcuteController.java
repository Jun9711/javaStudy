package org.java.inheritance;

import java.util.Scanner;

public class ExcuteController {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("�������� �Է��ϼ���");
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
				System.out.println("�ݺ��� �����մϴ�.");
				break;
			} else {
				System.out.println("������ �Է� �����Դϴ�.");
			}
		}

	}
}
