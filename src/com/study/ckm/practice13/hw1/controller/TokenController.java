package com.study.practice13.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
	}

	public String afterToken(String str) { 
		// 공백을 토큰으로 처리 한 글자 반환
		
		StringTokenizer st = new StringTokenizer(str, " ");
		String result = "";
		
//		System.out.println(st); 주소값
		
		while(st.hasMoreTokens()) {
			result += st.nextToken();
		}
		return result;
	}

	public void firstCap(String input) {
		// 매개변수로 받은 문자열의 첫 번째 글자를 대문자로 바꾼 문자열 반환
		String first = input.substring(0,1);
		String remain = input.substring(1);
		
		String result = first.toUpperCase()+remain;
		
		System.out.println("첫 글자 대문자 : "+result);
		
	}

	public void findChar(String input, char one) {
		// 매개변수로 받은 문자열 중에서 매개변수로 들어온 문자가 몇 개 존재하는지 개수를 반환
		char[] arr = input.toCharArray(); // 3
		
		int count = 0;
		
		for(int i = 0; i <input.length(); i++) {
			
			if(arr[i] == one) {
			count++;
			}
		}
		
		System.out.println(one+"이 들어간 갯수 : "+count);
	}
}
