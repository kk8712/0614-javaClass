package org.java.oop;

public class ClassMethod {
//	메소드 유형 1(입력값 x return 생략가능)
	public void method1() {
		System.out.println("반환값이 없고 입력값이 없다.");
//		return;
	}
//	메소드 유형 2 (입력값 O return 생략가능)
//	메소드 안에 선언된 변수 -> 지역변수(매개 인자)
	public void method2(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
//		return;
	}
//	메소드 유형 3 (입력값 x return 반환값 타입 = 메소드 타입)
	public int method3() {
		int num1 =12345;
		return num1;
	}
//	메소드 유형 4 (입력값 O return 반환값 타입 = 메소드 타입)
//	메소드 안에 선언된 변수 -> 지역변수(매개 인자)
	public int method4(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
//	클래스 메소드 유형 1( 입력값 x )
	public static void staticMethod() {
		System.out.println("클래스 메소드");
	}
//	클래스 메소드 유형 2( 입력값 O  return 반환값 타입 = 메소드 타입)
//	메소드 안에 선언된 변수 -> 지역변수(매개 인자)
	public static void staticMethod1(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
}
