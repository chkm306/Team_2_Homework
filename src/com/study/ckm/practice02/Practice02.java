package com.study.practice02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice02 {

	public void method1() {
		int num = -9;
		System.out.println("정수 : " + num);

		String result = num > 0 ? "양수다" : "양수가 아니다";

		System.out.println(result);
	}

	public void method2() {
		int num = -9;
		System.out.println("정수 : " + num);

		String result = num > 0 ? "양수다" : (num == 0) ? "0이다" : "음수다";
		System.out.println(result);
	}

	public void method3() {
		int num = 5;
		System.out.println("정수 : " + num);

		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
	}

	public void method4() {
		int num1 = 29;
		System.out.println("인원 수 : " + num1);

		int num2 = 100;
		System.out.println("사탕 개수 : " + num2);

		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 : " + (num2 % num1));
	}

	public void method5() {
		String name = "이효리";
		System.out.println("이름 : " + name);

		int num1 = 3;
		System.out.println("학년 : " + num1);

		int num2 = 15;
		System.out.println("반 : " + num2);

		int num3 = 1;
		System.out.println("번호 : " + num3);

		String gender = "f";
		System.out.println("성별 : " + gender);
		String result = gender.equalsIgnoreCase("F") ? "여학생" : gender.equalsIgnoreCase("M") ? "남학생" : "잘못 입력하셨습니다"; // 문자를
																													// 받고
																													// 대소문자
																													// 무시하고
																													// 비교문쓰기

		double num4 = 95.750;
		System.out.println("성적 : " + num4);

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", num1, num2, num3, name, result, num4);
		System.out.println();

	}

	public void method6() {
		int age = 19;
		System.out.println("나이 : " + age);
		System.out.println(age > 19 ? "성인" : age <= 13 ? "어린이" : "청소년");
	}

	public void method7() { // 배열에 담아서 해보기
		int num1 = 60;
		System.out.println("국어 : "+num1);
		
		int num2 = 80;
		System.out.println("영어 : "+num2);
		
		int num3 = 40;
		System.out.println("수학 : "+num3);
		
		System.out.println("합계 : "+(num1+num2+num3));
		System.out.println("평균 : "+(double)((num1+num2+num3)/3));
		System.out.println(num1 >= 40 && num2 >= 40 && num3 >= 40 && ((num1+num2+num3)/3)>=60 ? "합격":"불합격");
		
		Scanner sc = new Scanner(System.in);
		double sum = 0; // 총합
		double ave = 0; // 평균

		double[] arr = new double[3];
		
		while (true) {
			try {
				System.out.println("국어 : ");
//				double kor = sc.nextInt();
				arr[0] = sc.nextDouble();
				System.out.println("영어 : ");
//				double eng = sc.nextInt();
				arr[1] = sc.nextDouble();
				System.out.println("수학 : ");
//				double math = sc.nextInt();
				arr[2] = sc.nextDouble();
				
			} catch (InputMismatchException e) { // 왜 실수로 받았는데 이걸로 넘어가는지 모르겠네..
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				sc.next();
				continue;
			}
			
//			arr = new double[]{kor, eng, math};
			
			for(int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
				sum += arr[i];
			}
			ave = sum/arr.length;
			
			System.out.println("합계 : "+sum);
			System.out.printf("평균 : %.1f %n",ave);
			
			break;
		}

	}

	public void method8() {
		String num = "132456-2123456";
		System.out.println("주민번호를 입력하세요 : " + num);

		// System.out.println(num.charAt(7) == 2 || num.charAt(7) == 4 ? "여자" : "남자");
		// // 틀림
		System.out.println(num.charAt(7) == '2' || num.charAt(7) == '4' ? "여자" : "남자"); // 맞음
	}

	public void method9() {
		int num1 = 4;
		System.out.println("정수1 : " + num1);

		int num2 = 11;
		System.out.println("정수2 : " + num2);

		int num3 = 13;
		System.out.println("정수3 : " + num3);

		System.out.println(num3 > num2 || num3 < num1 ? "true" : "false");
	}

	public void method10() {
		int num1 = 5;
		System.out.println("정수1 : " + num1);

		int num2 = -8;
		System.out.println("정수2 : " + num2);

		int num3 = 5;
		System.out.println("정수3 : " + num3);

		System.out.println(num1 == num2 && num2 == num3 ? "true" : "false");
	}

	public void method11() {
		int num1 = 2500;
		double num11 = 0.4;
		System.out.println("A사원의 연봉 : " + num1);

		int num2 = 2900;
		double num22 = 0;
		System.out.println("B사원의 연봉 : " + num2);

		int num3 = 2600;
		double num33 = 0.15;
		System.out.println("C사원의 연봉 : " + num3);

		System.out.println("A사원의 인센티브 포함 연봉 : " + (num1 + (num1 * num11)));
		System.out.println((num1 + (num1 * num11)) > 3000 ? "3000 이상" : "3000 미만");

		System.out.println("B사원의 인센티브 포함 연봉 : " + (num2 + (num2 * num22)));
		System.out.println((num2 + (num2 * num22)) > 3000 ? "3000 이상" : "3000 미만");

		System.out.println("C사원의 인센티브 포함 연봉 : " + (num3 + (num3 * num33)));
		System.out.println((num3 + (num3 * num33)) > 3000 ? "3000 이상" : "3000 미만");
	}
}
