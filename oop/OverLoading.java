package org.java.oop;

public class OverLoading {
	
	public void method() {
		System.out.println("���� �ε� �׽�Ʈ");
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
	// �Ű� ������ �̸��� �޶� Ÿ���� ������ �����ε� ��������
//	public void method(String num2, String name ) {
//		System.out.println(num2 + name);
//	}
	//��ȯ Ÿ�Ը� �ٸ���쿡�� �����ε� ��������
//	public int method() {  
//		System.out.println("�����ε� �׽�Ʈ");
//	}
}
