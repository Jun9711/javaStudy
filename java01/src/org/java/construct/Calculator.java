package org.java.construct;

public class Calculator {

	private int num1;
	private int num2;
	private String op;
	
	public Calculator() {
		System.out.println("기본 생성자");
	}
	
	public Calculator(int num1, int num2, String op) {
		System.out.println("다른 생성자2");
		this.num1=num1;
		this.num2=num2;
		this.op=op;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	
	public void add() {
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
	public void sub() {
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
	}
	public void multi() {
		System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
	}
	public void div() {
		System.out.println(num1 + "/" + num2 + "=" + ((double)num1/num2));
	}
	
	public void cal() {
		if(op.equals("+")) {
			add();
		}else if(op.equals("-")) {
			sub();
		}else if(op.equals("*")) {
			multi();
		}else if(op.equals("/")) {
			div();
		}else {
			System.out.println("연산자 입력 오류입니다.");
		}
	}
	
	
	
}
