package org.java.oop;

public class Class1 {
	public int num1;
	public int num2;
	private String key;
	public final static String PROJECTNAME = "JAVA PROJECT 2022";
	
	public void instnansMethod() {
		System.out.println("return이 없는 인스턴스 메소드");
	}
	public int instnansMethod2() {
		System.out.println("return값이 int메서드 메소드");
		return this.num1 + this.num2;
	}
	
	public static void classMethod() {
		System.out.println("클래스 메소드");
	}
	//private 멤버 초기화
	public void setKey(String key) {
		this.key =key;
	}
	//private 멤버 가저오기
	public String getKey() {
		return this.key;
	}
	

}
