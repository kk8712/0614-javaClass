package org.java.car;

public class Car1 {
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	public static String CITY;
	// final ����� ������ ���ÿ� �ʱ�ȭ ��. ���� �Ұ�
//	public static final String CITY2;
	
	private String option1;
	private String option2;

	public void instanceMethod1() {
		System.out.println("�ڵ��� �̸� :" + this.carName);
	}

	public void instanceMethod2() {
		System.out.println("�ڵ��� ���� :" + this.carCoin);
	}

	public void instanceMethod3() {
		System.out.println("�ڵ��� ��� :" + this.carYear);
	}

	public void instanceMethod4() {
		System.out.println("�ڵ��� ���� :" + this.carWidth);
	}
	public void instanceMethod5() {
		System.out.println("�ڵ��� �ɼ� 1 :" + this.option1);
	}
	public void instanceMethod6() {
		System.out.println("�ڵ��� �ɼ� 2 :" + this.option2);
	}
	public void setOpiton1(String option) {
		this.option1 = option;
	}
	
	public String getOption1() {
		return this.option1;
	}
	public void setOpiton2(String option) {
		this.option2 = option;
	}
	public String getOption2() {
		return this.option2;
	}



}
