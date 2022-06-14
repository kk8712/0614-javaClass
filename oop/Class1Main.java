package org.java.oop;

public class Class1Main {

	public static void main(String[] args) {
		
		//인스턴스화(객체화)
		//new 객체 생성 연산자
		//c1 객체된 주소
		Class1 c1=new Class1();
		//c1 ==>num1 num2 key 초기화 
		int num1=c1.num1=50;
		int num2=c1.num2=100;
		c1.setKey("a1231212345612345");
		String projectname=Class1.PROJECTNAME;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(projectname);
		
		Class1 c2 = new Class1();
		int num3=c2.num1=150;
		int num4=c2.num2=1000;
		c2.setKey("abcdef");
		System.out.println(num3);
		System.out.println(num4);
		
		
		System.out.println(c2.getKey());
		System.out.println(c1 .equals(c2));
		System.out.println(c1 == c2);
	}
}
