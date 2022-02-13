package com.study.practice08.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력
		int[] arr = new int[6];
		
		System.out.print("랜덤값 : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		Arrays.toString(arr); // 왜 이건 안되지
		System.out.println();
	}

	public void outputChar(int num, char c) {
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
		System.out.printf("%s문자 %d개 출력 : ",c,num);
		for (int i = 0; i <= num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public char alphabette() {
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함
		char ch = ' ';
		int n = 0;
		
		for (int i = 0; i < 10; i++) {
			n = (int)(Math.random() * 57 + 65);
			if(n >= 65 && n <= 90 || n >= 97 && n <= 122) {
				ch = (char)n;
			}
		}
		return ch;
	}

	public String mySubstring(String str, int index1, int index2) {
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		System.out.printf("%s의 %d번 %d번 인덱스 사이의 값 출력 : ",str,index1,index2);

		String ss = "";
		char[] arr = new char[str.length()];
//		if(index1 >)
		for (int i = index1; i < index2; i++) {
			arr[i] = str.charAt(i);
//			System.out.print(arr[i]);
			ss += arr[i];
		}
		return ss;
	}
}
