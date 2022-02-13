package com.study.practice09.hw3.controller;

public class StaticSample {

	private static String value; // 왜안되나 했더니 static이 아니네

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static void toUpper() {
		// value 필드 값을 모두 대문자로 변경 --> char 배열 응용
		char[] arr = new char[value.length()];

		for (int i = 0; i < arr.length; i++) { // arr.length()가 아님 ㅠ
			arr[i] = value.toUpperCase().charAt(i);
			value += arr[i];
		}
		
		value = ""; // 초기화
		
		for (int i = 0; i < arr.length; i++) {
			value += arr[i];
		}
		
		// for(int i = 0; i < 4; i++) {
		// value += arr[i];
		// }
//		value = value.toUpperCase();
	}

	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		char[] arr = new char[value.length()];

		for (int i = 0; i < value.length(); i++) {
			arr[i] = value.charAt(i);
			arr[index] = c;
			// value = (String)arr[i];
		}

		value = "";
		for (int i = 0; i < arr.length; i++) {
			value += arr[i];
		}
	}

	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		int count = 0;

		for (int i = 0; i < value.length(); i++) {
			count++;
		}

		return count;
	}

	public static String valueConcat(String str) {
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		return value + str;
	}

}
