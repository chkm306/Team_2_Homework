package com.study.practice09.hw2.controller;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {
		// 전달받은 정수 (length) 만큼 int 배열을 할당
		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴

		int[] arr = new int[length];

		for (int i = 0; i < length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		return arr;
	}

	public void display(int[] arr) {
		// 전달받은 배열 출력

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void swap(int[] arr, int idx1, int idx2) {
		// 전달받은 배열의 각각의 인덱스 값을 교환
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
//			arr[i] = arr[idx1]; 이게아니라 새로운 공간 넣어주기
			int temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;
			}
		}
	}

	public void sortDescending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				swap(arr, i, j);
			}
		}
		display(arr);
	}

	public void sortAscending(int[] arr) {
		// 위의 swqp 메소드를 이용하여 전달받은 배열을 오름차순 적용
		// 위의 display 메소드를 이용하여 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				swap(arr, j, i);
			}
		}
		display(arr);
	}

	public int countChar(String str, char c) {
		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴
		char[] arr = new char[str.length()]; // 담아줄 배열 선언
		int count = 0; // 리턴할 문자 갯수 변수 생성
		
		for (int i = 0; i < arr.length; i++) { // 문자열 배열에 담기
			arr[i] = str.charAt(i);
		}
		
		for (int i = 0; i < arr.length; i++) { // 문자배열안의 문자가 일치할 경우 count 증가
			if(arr[i] == c) {
				count++;
			}
		}
		
		
		
		return count;
	}

	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)
		
		int max = Math.max(num1, num2); // 둘 중 큰 값
		int min = Math.min(num1, num2); // 둘 중 작은 값
		
		int result = 0; // return에 넣을 변수, 합계 담아줄 변수
		
		for (int i = 1; i < max-min; i++) { // max는 13인데 13번 돌리고있었음 ㅋㅋ
			 result += min+i;
//			 min+1 + min+2 + min+3 + min+4 + min+5; 
//			 8+9+10+11+12
		}
		
		return result;
	}

	public char pCharAt(String str, int index) {
		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴
		char[] arr = new char[str.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		return arr[index]; // 반복문 안에서는 안됨
	}

	public String pConcat(String str1, String str2) {
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴
		return str1+str2;
	}

}
