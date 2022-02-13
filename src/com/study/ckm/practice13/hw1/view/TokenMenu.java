package com.study.practice13.hw1.view;

import java.util.Scanner;

import com.study.practice13.hw1.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();

	public void mainMenu() { // 아래의 메뉴 반복 실행
		// 1. 지정 문자열  tokenMenu() 실행
		// 2. 입력 문자열  inputMenu() 실행
		// 9. 프로그램 끝내기  “프로그램을 종료합니다.” 출력 후 종료
		// 메뉴 번호 :

		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("9. 프로그램 끝내기");
		System.out.println("메뉴 번호 :");
		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 1:
			tokenMenu();
			break;
		case 2:
			inputMenu();
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			mainMenu();
		}
	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		// Token 처리 전 글자와 글자 개수를 출력하고
		// 위 str을 TokenController의 afterToken() 메소드의 인자로 보내 반환 값 출력
		// 그 반환 값을 이용해 Token 처리 후 글자 개수와 대문자 변환한 것을 출력
		System.out.println("토큰 처리 전 : "+str);
		System.out.println("토큰 처리 전 개수 : "+str.length());
		
		String result = tc.afterToken(str);
		System.out.println("토큰 처리 후 : "+result);
		System.out.println("토큰 처리 후 개수 : "+result.length());
		
		System.out.println("모두 대문자로 변환 : "+result.toUpperCase().toString());

	}

	public void inputMenu() {
		
		// 입력 받은 문자열을 TestController의 firstCap()의 인자로 보내 반환 값 출력
		// 찾을 문자 입력 받아 TestController의 findChar()의 매개변수로 아까 입력 받은
		// 문자열과 문자 하나를 매개변수로 보내 반환 값 출력
		
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		tc.firstCap(str);
		
		System.out.println("찾을 문자 하나를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		tc.findChar(str, ch);
		
	}

}
