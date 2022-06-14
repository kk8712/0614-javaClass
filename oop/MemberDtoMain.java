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
		member1.setUserAddr("그린컴퓨터아카데미");
		member1.setUserPhone("1588-9780");
		member1.setDay(new Date());//현재 시간
		
		String userId =member1.getUserId();
		String userPw =member1.getUserPw();
		String userName =member1.getUserName();
		int userAge =member1.getUserAge();
		String userAddr =member1.getUserAddr();
		String userPhone =member1.getUserPhone();
		Date day1 =member1.getDay();
		
		SimpleDateFormat day=new SimpleDateFormat("yyyy년 MM월dd일hh시mm분ss초");
		String now = day.format(day1);
		
		System.out.println("=====================================");
		System.out.println("id \t: "+userId);
		System.out.println("pw \t: "+userPw);
		System.out.println("name \t: "+userName);
		System.out.println("age \t: "+userAge);
		System.out.println("Addr \t: "+userAddr);
		System.out.println("p.h \t: "+userPhone);
		System.out.println("날짜 \t: "+now);
		System.out.println("=====================================");
		
		System.out.println(member1.toString());
		
		System.out.println("====================스캐너 이용====================");

		MemberDto member2 = new MemberDto();
		
		Scanner scn =new Scanner(System.in);
		
		System.out.print("ID 입력 :");
		member2.setUserId(scn.next());
		System.out.print("PW 입력 :" );
		member2.setUserPw(scn.next());
		System.out.print("NAME 입력 :");
		member2.setUserName(scn.next());
		System.out.print("AGE 입력 :");
		member2.setUserAge(scn.nextInt());
		System.out.print("주소 입력 :");
		member2.setUserAddr(scn.next());
		System.out.print("전화번호 입력 :");
		member2.setUserPhone(scn.next());
		member2.setDay(new Date());//현재 시간
		scn.close();
		
		System.out.println("==========================================================================");
		System.out.println("id \t: "+member2.getUserId());
		System.out.println("pw \t: "+member2.getUserPw());
		System.out.println("name \t: "+member2.getUserName());
		System.out.println("age \t: "+member2.getUserAge());
		System.out.println("Addr \t: "+member2.getUserAddr());
		System.out.println("p.h \t: "+member2.getUserPhone());
		System.out.println("날짜 \t: "+now);
		System.out.println(member2.toString());
		System.out.println("==========================================================================");
		
		
	}
}
