package org.java.oop;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal= new Calculator();
		cal.add(50, 50);
		cal.sub(50, 50);
		cal.div(50, 50);
		cal.multi(50, 50);
		Calculator.staticMethod();
		
		//scanner �̿�
		System.out.println("=== \tscanner �̿�\t ===");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�");
		int i = scn.nextInt();
		System.out.println("�ι�° ���� �Է�");
		int j =scn.nextInt();
		cal.add(i, j);
		cal.sub(i, j);
		cal.div(i, j);
		cal.multi(i, j);
		scn.close();
	}
}
