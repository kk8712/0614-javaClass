package org.java.oop;

import java.util.Scanner;

public class Calculator2Main {
	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		
		Scanner scn =new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է�");
		cal.setNo1(scn.nextInt());
		System.out.print("�ι�° ���� �Է�");
		cal.setNo2(scn.nextInt());
		System.out.println();
		
		cal.sum();
		cal.sub();
		cal.div();
		cal.multi();
		scn.close();
	}
}
