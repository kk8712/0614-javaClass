package org.java.oop;

public class ClassMethod {
//	�޼ҵ� ���� 1(�Է°� x return ��������)
	public void method1() {
		System.out.println("��ȯ���� ���� �Է°��� ����.");
//		return;
	}
//	�޼ҵ� ���� 2 (�Է°� O return ��������)
//	�޼ҵ� �ȿ� ����� ���� -> ��������(�Ű� ����)
	public void method2(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
//		return;
	}
//	�޼ҵ� ���� 3 (�Է°� x return ��ȯ�� Ÿ�� = �޼ҵ� Ÿ��)
	public int method3() {
		int num1 =12345;
		return num1;
	}
//	�޼ҵ� ���� 4 (�Է°� O return ��ȯ�� Ÿ�� = �޼ҵ� Ÿ��)
//	�޼ҵ� �ȿ� ����� ���� -> ��������(�Ű� ����)
	public int method4(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
//	Ŭ���� �޼ҵ� ���� 1( �Է°� x )
	public static void staticMethod() {
		System.out.println("Ŭ���� �޼ҵ�");
	}
//	Ŭ���� �޼ҵ� ���� 2( �Է°� O  return ��ȯ�� Ÿ�� = �޼ҵ� Ÿ��)
//	�޼ҵ� �ȿ� ����� ���� -> ��������(�Ű� ����)
	public static void staticMethod1(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
}
