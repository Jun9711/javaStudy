package org.java.oop;

public class Car1 {
	
	// ���
	// �ν��Ͻ� ��� (�ʵ�)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	
	// final����� ������ ���ÿ� �ʱ�ȭ�ؾ��Ѵ�
	// ex) public static final String SITY="����";
	public static String CITY;
	
	//private setter, getter �޼��� ����
	private String option1;
	private String option2;
	
	//setters >> private��� �ʱ�ȭ
	public void setOption1(String option1) {
		this.option1=option1;
	}
	public void setOption2(String option2) {
		this.option2=option2;
	}
	
	//getters >> private��� get
	public String getOption1() {
		return this.option1;
	}
	public String getOption2() {
		return this.option2;
	}
	
	//�ν��Ͻ� ���(�޼���)
	public void instanceMethod() {
		System.out.println("�ڵ��� �̸� : "+this.carName);
	}
	public void instanceMethod2() {
		System.out.println("�ڵ��� ���� : "+this.carCoin);
	}
	public void instanceMethod3() {
		System.out.println("�ڵ��� ���� : "+this.carYear);
	}
	public void instanceMethod4() {
		System.out.println("�ڵ��� �ʺ� : "+this.carWidth);
	}
	@Override
	public String toString() {
		return "Car1 [carName=" + carName + ", carCoin=" + carCoin + ", carYear=" + carYear + ", carWidth=" + carWidth
				+ ", option1=" + option1 + ", option2=" + option2 + "]";
	}
	
	

	
	
}
