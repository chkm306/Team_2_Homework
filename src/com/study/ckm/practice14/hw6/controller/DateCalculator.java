package com.study.practice14.hw6.controller;

import java.util.Calendar;

public class DateCalculator {

	public DateCalculator() {
	}

	public long leapDate() {
		// 1년 1 월 1 일부터 오늘까지의 총 날 수를 계산 
		// 1년부터 현재 연도까지 각 연도가 윤년이면 총 날수에 366일을 평년이면 365 일을 더함
		// 해당 현재 연도가 윤년이면 2월을 29 일로 평년이면 28 일로 더함
		// 월의 날짜 수를 더함
		// (31 일 : 1, 3, 5, 7, 8, 10, 12 월 30일, 4, 6, 9, 11 월)
		
		/* 윤년(1년을 366일)의 조건
		1.4로 나누어 떨어지는 해는 윤년이다,
		2.4로 나누어 떨어지고 100으로도 나누어 떨어지는 해는 윤년이ㅣ 아니다.
		3.400으로 나누어 떨어지는 해는 윤년이다.
		        예)1800년은 평년이고 2000년은 윤년이다.
		* 생년월일이 1985. 1. 1, 오늘이 1985 1. 2인 경우 2일을 살았다고 가정(1일과 2일 이틀)
		*/
		
		
		Calendar today = Calendar.getInstance();
		
//		for(int i = 0; i < today.getActualMaximum(i)) {}
//		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {	}
		
		
		

		return 0;

	}

//	public String isLeapYear(int year) {
//		// 연도가 윤년이면 true, 평년이면 false 리턴
//		// (윤년 : 연도가 4 의 배수이면서 100 의 배수가 아니거나 400 의 배수가 되는 해)
//
//		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // 윤년
//			return "올해는 윤년입니다.";
//		} else {
////			return "올해는 평년입니다.";
//			return System.out.println("올해는 평년입니다.");
//		}
//	}
	public void isLeapYear(int year) {
		// 연도가 윤년이면 true, 평년이면 false 리턴
		// (윤년 : 연도가 4 의 배수이면서 100 의 배수가 아니거나 400 의 배수가 되는 해)

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // 윤년
//			return "올해는 윤년입니다.";
			System.out.println("올해는 윤년입니다.");
		} else {
//			return "올해는 평년입니다.";
			System.out.println("올해는 평년입니다.");
		}
	}

}
