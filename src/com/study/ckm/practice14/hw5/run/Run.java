package com.study.practice14.hw5.run;

import java.util.Scanner;

import com.study.practice14.hw5.controller.NumberOk;

public class Run {

	public static void main(String[] args) {

		NumberOk no = new NumberOk();
		Scanner sc = new Scanner(System.in);

		// NumberOk 객체를 이용하여 메소드 실행
		// String의 equalsIgnoreCase() 메소드로 계속하는지 판단하는 y,n입력값 판단하기

		while (true) {
			no.numGame();
			
			System.out.println("계속 하시겠습니까?(y/n)");
			String yorn = sc.nextLine();

			if (yorn.equalsIgnoreCase("Y")) {
				no.numGame();
			} else if (yorn.equalsIgnoreCase("N")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
}
