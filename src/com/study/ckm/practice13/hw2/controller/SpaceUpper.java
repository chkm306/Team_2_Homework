package com.study.practice13.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	public SpaceUpper() {
	}

	public void spaceToUpper() {
		
		// 영문을 입력 받는다.
		// StringTokenizer를 통해 띄어쓰기를 기준으로 토큰 단위로 나온 것을 연산하는 메소드를 구성
		// 띄어쓰기 이후 첫 글자는 대문자로 되게 하고 그 외에 나머진 소문자로 해서 StringBuilder에 담아 출력
		
		Scanner sc = new Scanner(System.in);

		System.out.println("영어를 입력하시오 (띄어쓰기 포함): ");
		String str = sc.nextLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		StringBuilder sb = new StringBuilder();
		// String result = "";

		while (st.hasMoreTokens()) {
		
			String token = st.nextToken(); // 매번 토큰이 담김
//			System.out.println("token : " + token);
		
			for (int i = 0; i < token.length(); i++) {
				if (i == 0) // 첫번쩨 글자 대문자로 만들기
					sb.append(token.toUpperCase().charAt(i));
				else
					sb.append(token.charAt(i));
			}
			sb.append(" ");
		}
		
		/*char[] arr = str.toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		for(int i = 0; i < arr.length; i++) {
		}*/
		
		/*while (st.hasMoreTokens()) { // 토큰이 있을 경우 true
			String token = st.nextToken();
			token.toUpperCase().charAt(0);
			
			System.out.println(token.toUpperCase().charAt(0));
		}*/
		System.out.println(sb);
	}
}
