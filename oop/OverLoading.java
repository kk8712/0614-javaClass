package org.java.oop;

public class OverLoading {
	
	public void method() {
		System.out.println("오버 로딩 테스트");
	}
	public void method(int num) {
		System.out.println(num);
	}
	public void method(int num, String name) {
		System.out.println(num+" "+name);
	}
	public void method(String num, String name ) {
		System.out.println(num + name);
	}
	// 매개 변수의 이름이 달라도 타입이 같으면 오버로딩 되지않음
//	public void method(String num2, String name ) {
//		System.out.println(num2 + name);
//	}
	//변환 타입만 다른경우에도 오버로딩 되지않음
//	public int method() {  
//		System.out.println("오버로딩 테스트");
//	}
}
