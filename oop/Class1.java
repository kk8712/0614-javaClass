package org.java.oop;

public class Class1 {
	public int num1;
	public int num2;
	private String key;
	public final static String PROJECTNAME = "JAVA PROJECT 2022";
	
	public void instnansMethod() {
		System.out.println("return�� ���� �ν��Ͻ� �޼ҵ�");
	}
	public int instnansMethod2() {
		System.out.println("return���� int�޼��� �޼ҵ�");
		return this.num1 + this.num2;
	}
	
	public static void classMethod() {
		System.out.println("Ŭ���� �޼ҵ�");
	}
	//private ��� �ʱ�ȭ
	public void setKey(String key) {
		this.key =key;
	}
	//private ��� ��������
	public String getKey() {
		return this.key;
	}
	

}
