package org.java.oop;

import java.util.Scanner;

public class Calculator2Main2 {
	public static void main(String[] args) {
		// 두 숫자와 연산자(+-*/)입력받아서 각각의 메소드 실행
		// while 이용해서 무한 반복
		// 연산자 잘못 입력시 "연산자 입력 오류" 출력후 다시 반복
		// 소문자z 입력시 "종료합니다" 출력후 while문 정지

		Calculator2 cal = new Calculator2();

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("첫번째 정수 입력 : ");
			cal.setNo1(scn.nextInt());
			System.out.print("두번째 정수 입력 : ");
			cal.setNo2(scn.nextInt());
			System.out.print("연산자 입력 : ");
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
				System.out.println("종료합니다.");
				scn.close();
				break;
			} else {
				System.out.println("연산자를 잘못 입력했습니다. +-*/z");
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
//				System.out.println("종료합니다.");
//				break;
//			default :
//				System.out.println("연산자를 잘못 입력했습니다. +-*/z");
//			}
		}
		
	}
}
