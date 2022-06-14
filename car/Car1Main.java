package org.java.car;

public class Car1Main {

	public static void main(String[] args) {
		Car1.CITY = "독일";
		System.out.println(Car1.CITY);
		//carA 는 객체 참조 변수 (객체의 주소 값을 저장 )
		//new 객체생성 연산자
		//클래스 -> 사용자 정의 타입
		Car1 carA = new Car1();
		Car1 carB= new Car1();
//		System.out.println(carA.CITY);
//		System.out.println(carB.CITY);

		carA.carName = "porsche";
		carA.carCoin = 10000;
		carA.carWidth = 1000;
		carA.carYear = 2022;
		carA.setOpiton1("audio");
		carA.setOpiton2("camera");
		carB.carName = "porsche";
		carB.carCoin = 10000000;
		carB.carWidth = 2000;
		carB.carYear = 1922;
		carB.setOpiton1("auto");
		carB.setOpiton2("sunloop");
		System.out.println(carA == carB);
		System.out.println(carA.carName == carB.carName);
		System.out.println(carA.carYear == carB.carYear);
		System.out.println();
		

		carA.instanceMethod1();
		carA.instanceMethod2();
		carA.instanceMethod3();
		carA.instanceMethod4();
		carA.instanceMethod5();
		carA.instanceMethod6();
		System.out.println(carA.getOption1());
		System.out.println(carA.getOption2());
		carB.instanceMethod1();
		carB.instanceMethod2();
		carB.instanceMethod3();
		carB.instanceMethod4();
		carB.instanceMethod5();
		carB.instanceMethod6();
		
		System.out.println(carA.hashCode());
		System.out.println(carB.hashCode());
	}

}
