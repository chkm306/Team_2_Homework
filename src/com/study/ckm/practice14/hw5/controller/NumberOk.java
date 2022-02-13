package com.study.practice14.hw5.controller;

import java.util.Scanner;

public class NumberOk {
	Scanner sc = new Scanner(System.in);

	private int ran;

	public NumberOk() {
	}

	public void numGame() {

		int ran = (int) (Math.random() * 100 + 1);//35
		int count = 0; // 시도 횟수

		while (true) {
			System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();

			if (num < ran) {
				count++;
				System.out.println(num + "보다 큽니다." + count + "번째 실패!!");

			} else if (num > ran) {
				count++;
				System.out.println(num + "보다 작습니다." + count + "번째 실패!!");

			} else if (num == ran) {
				count++;
				System.out.println(count + "번 만에 맞췄습니다!");
				break;
			}

		}

	}

}
