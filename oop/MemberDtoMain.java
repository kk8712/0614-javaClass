package org.java.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberDtoMain {
	public static void main(String[] args) {
		MemberDto member1 = new MemberDto();
		
		member1.setUserId("green");
		member1.setUserPw("computer");
		member1.setUserName("academy");
		member1.setUserAge(100);
		member1.setUserAddr("�׸���ǻ�;�ī����");
		member1.setUserPhone("1588-9780");
		member1.setDay(new Date());//���� �ð�
		
		String userId =member1.getUserId();
		String userPw =member1.getUserPw();
		String userName =member1.getUserName();
		int userAge =member1.getUserAge();
		String userAddr =member1.getUserAddr();
		String userPhone =member1.getUserPhone();
		Date day1 =member1.getDay();
		
		SimpleDateFormat day=new SimpleDateFormat("yyyy�� MM��dd��hh��mm��ss��");
		String now = day.format(day1);
		
		System.out.println("=====================================");
		System.out.println("id \t: "+userId);
		System.out.println("pw \t: "+userPw);
		System.out.println("name \t: "+userName);
		System.out.println("age \t: "+userAge);
		System.out.println("Addr \t: "+userAddr);
		System.out.println("p.h \t: "+userPhone);
		System.out.println("��¥ \t: "+now);
		System.out.println("=====================================");
		
		System.out.println(member1.toString());
		
		System.out.println("====================��ĳ�� �̿�====================");

		MemberDto member2 = new MemberDto();
		
		Scanner scn =new Scanner(System.in);
		
		System.out.print("ID �Է� :");
		member2.setUserId(scn.next());
		System.out.print("PW �Է� :" );
		member2.setUserPw(scn.next());
		System.out.print("NAME �Է� :");
		member2.setUserName(scn.next());
		System.out.print("AGE �Է� :");
		member2.setUserAge(scn.nextInt());
		System.out.print("�ּ� �Է� :");
		member2.setUserAddr(scn.next());
		System.out.print("��ȭ��ȣ �Է� :");
		member2.setUserPhone(scn.next());
		member2.setDay(new Date());//���� �ð�
		scn.close();
		
		System.out.println("==========================================================================");
		System.out.println("id \t: "+member2.getUserId());
		System.out.println("pw \t: "+member2.getUserPw());
		System.out.println("name \t: "+member2.getUserName());
		System.out.println("age \t: "+member2.getUserAge());
		System.out.println("Addr \t: "+member2.getUserAddr());
		System.out.println("p.h \t: "+member2.getUserPhone());
		System.out.println("��¥ \t: "+now);
		System.out.println(member2.toString());
		System.out.println("==========================================================================");
		
		
	}
}
