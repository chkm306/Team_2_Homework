package com.study.practice13.hw3.run;

import com.study.practice13.hw3.controller.SetDate;

public class Run {

	public static void main(String[] args) {
		// todayPrint()을 출력한다.
		// setDay() 을 출 력 한다
		
		SetDate sd = new SetDate();
		
		System.out.println(sd.todayPrint());
		System.out.println(sd.setDay());
	}

}
