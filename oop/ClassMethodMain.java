package org.java.oop;

public class ClassMethodMain {
	
		public int s1;
		public int s2;
		public static int s3;
		
		public void m1() {
			s1=10;
			s2 = 20;
			s3 = 100;
		}
		public static void m2() {
//			s1=10;
//			s2 = 20;
			s3 = 100;
		}
		
	public static void main(String[] args) {
		s3=10;
		
		
		ClassMethod cm = new ClassMethod();
		
		//인스턴스 메소드 call
		cm.method1();
		cm.method2(50,100);
//		cm.method3()
		System.out.println(cm.method3());
		int plus = cm.method4(10000, 81);
		System.out.println(plus);
		
		//class method call
//		cm.staticMethod();
		ClassMethod.staticMethod();
//		cm.staticMethod1(60, 90);
		ClassMethod.staticMethod1(60, 90);
	}
}
