package org.java.oop;

import java.util.Scanner;

public class Calculator2Main2 {
	public static void main(String[] args) {
		// �� ���ڿ� ������(+-*/)�Է¹޾Ƽ� ������ �޼ҵ� ����
		// while �̿��ؼ� ���� �ݺ�
		// ������ �߸� �Է½� "������ �Է� ����" ����� �ٽ� �ݺ�
		// �ҹ���z �Է½� "�����մϴ�" ����� while�� ����

		Calculator2 cal = new Calculator2();

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("ù��° ���� �Է� : ");
			cal.setNo1(scn.nextInt());
			System.out.print("�ι�° ���� �Է� : ");
			cal.setNo2(scn.nextInt());
			System.out.print("������ �Է� : ");
			String oper = scn.next();
			System.out.println();

			if (oper.equals("+")) {
				System.out.println(cal.getNo1() + " + " + cal.getNo2() + " = " + cal.sum2());
				cal.sum();
				System.out.println();
			} else if (oper.equals("-")) {
				System.out.println(cal.getNo1() + " - " + cal.getNo2() + " = " + cal.sub2());
				cal.sub();
				System.out.println();
			} else if (oper.equals("/")) {
				System.out.println(cal.getNo1() + " / " + cal.getNo2() + " = " + cal.div2());
				cal.div();
				System.out.println();
			} else if (oper.equals("*")) {
				System.out.println(cal.getNo1() + " * " + cal.getNo2() + " = " + cal.multi2());
				cal.multi();
				System.out.println();
			} else if (oper.equals("z")) {
				System.out.println("�����մϴ�.");
				scn.close();
				break;
			} else {
				System.out.println("�����ڸ� �߸� �Է��߽��ϴ�. +-*/z");
			}
//			switch (oper) {
//			case "+" :
//				System.out.println(cal.getNo1() + " + " + cal.getNo2() + " = " + cal.sum2());
//				cal.sum();
//				System.out.println();
//				break;
//			case "-":
//				System.out.println(cal.getNo1() + " - " + cal.getNo2() + " = " + cal.sub2());
//				cal.sub();
//				System.out.println();
//				break;
//			case "/":
//				System.out.println(cal.getNo1() + " / " + cal.getNo2() + " = " + cal.div2());
//				cal.div();
//				System.out.println();
//				break;
//			case "*" :
//				System.out.println(cal.getNo1() + " * " + cal.getNo2() + " = " + cal.multi2());
//				cal.multi();
//				System.out.println();
//				break;
//			case "z":
//				System.out.println("�����մϴ�.");
//				break;
//			default :
//				System.out.println("�����ڸ� �߸� �Է��߽��ϴ�. +-*/z");
//			}
		}
		
	}
}
