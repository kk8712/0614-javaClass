package org.java.oop;

import java.util.Scanner;

public class Calculator2Main {
	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		
		Scanner scn =new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력");
		cal.setNo1(scn.nextInt());
		System.out.print("두번째 정수 입력");
		cal.setNo2(scn.nextInt());
		System.out.println();
		
		cal.sum();
		cal.sub();
		cal.div();
		cal.multi();
		scn.close();
	}
}
