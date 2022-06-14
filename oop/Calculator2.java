package org.java.oop;

public class Calculator2 {
	private int no1;
	private int no2;

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo1() {
		return this.no1;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public int getNo2() {
		return this.no2;
	}

	public void sum() {
		System.out.print("더하기 \t");
		System.out.println(this.no1 + " + " + this.no2 + " = " + (this.no1 + this.no2));
	}

	public void sub() {
		System.out.print("빼기\t");
		System.out.println(this.no1 + " - " + this.no2 + " = " + (this.no1 - this.no2));
	}

	public void div() {
		System.out.print("나누기\t");
		System.out.println(this.no1 + " / " + this.no2 + " = " + (this.no1 / this.no2));
	}

	public void multi() {
		System.out.print("곱하기\t");
		System.out.println(this.no1 + " * " + this.no2 + " = " + (this.no1 * this.no2));
	}
	public int sum2() {
		return (this.no1 + this.no2);
	}
	public int sub2() {
		return (this.no1 - this.no2);
	}
	public int div2() {
		return (this.no1 / this.no2);
	}
	public int multi2() {
		return (this.no1 * this.no2);
	}
}
