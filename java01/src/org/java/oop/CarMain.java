package org.java.oop;

public class CarMain {

	public static void main(String[] args) {
		
		Car1.CITY="서울";
		
		Car1 aCar=new Car1();
		Car1 aCar1=new Car1();
		Car1 aCar2=new Car1();
		
		System.out.println(aCar1.equals(aCar2));
		System.out.println(aCar1);
		System.out.println(aCar2);
		System.out.println(aCar.CITY);
		
		aCar.carName="A-Car";
		aCar.carCoin=10000;
		aCar.carYear=2020;
		aCar.carWidth=150;
		
		aCar.instanceMethod();
		aCar.instanceMethod2();
		aCar.instanceMethod3();
		aCar.instanceMethod4();
		
		aCar.setOption1("옵션1 : 자동");
		aCar.setOption2("옵션2 : 무광코팅");
		
		System.out.println(aCar.getOption1());
		System.out.println(aCar.getOption2());
		
		System.out.println();
		Car1 bCar=new Car1();
		bCar.CITY="부산";
		System.out.println(bCar.CITY);
		
		bCar.carName="B-Car";
		bCar.carCoin=15000;
		bCar.carYear=2021;
		bCar.carWidth=135;
		
		bCar.instanceMethod();
		bCar.instanceMethod2();
		bCar.instanceMethod3();
		bCar.instanceMethod4();

		bCar.setOption1("옵션1 : 수동");
		bCar.setOption2("옵션2 : 네비게이션 추가");
		
		System.out.println(bCar.getOption1());
		System.out.println(bCar.getOption2());
		
		System.out.println();
		Car1 cCar=new Car1();
		cCar.CITY="춘천";
		System.out.println(cCar.CITY);
		
		cCar.carName="C-Car";
		cCar.carCoin=18500;
		cCar.carYear=2022;
		cCar.carWidth=144;
		
		cCar.instanceMethod();
		cCar.instanceMethod2();
		cCar.instanceMethod3();
		cCar.instanceMethod4();
		
		cCar.setOption1("옵션1 : 자동");
		cCar.setOption2("옵션2 : 후방 카메라 추가");
		
		System.out.println(cCar.getOption1());
		System.out.println(cCar.getOption2());
		
		System.out.println();
		Car1 dCar=new Car1();
		dCar.CITY="대구";
		System.out.println(dCar.CITY);
		
		dCar.carName="D-Car";
		dCar.carCoin=9500;
		dCar.carYear=2018;
		dCar.carWidth=112;
		
		dCar.instanceMethod();
		dCar.instanceMethod2();
		dCar.instanceMethod3();
		dCar.instanceMethod4();
		
		dCar.setOption1("옵션1 : 자동");
		dCar.setOption2("옵션2 : 네비게이션 추가");
		
		System.out.println(dCar.getOption1());
		System.out.println(dCar.getOption2());
		
		
		
	}
	
}
