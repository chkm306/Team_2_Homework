package com.study.practice08.hw1;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();

		nss.printLottoNumbers();
		nss.outputChar(10, 'c');
		System.out.println("랜덤 영문자 출력 : " + nss.alphabette());
		nss.mySubstring("apple", 1, 5);
	}
}

public class NonStaticSample {
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력

		int[] ran = new int[6];

		for (int i = 0; i < ran.length; i++) {
			ran[i] = (int) (Math.random() * 45 + 1); // 1부터 45까지의 난수
			for (int j = 0; j < i; j++) { // 중복 제거
				if (ran[i] == ran[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(ran); // 오름차순 정렬
		System.out.println("랜덤 값 : " + Arrays.toString(ran));
	}

	public void outputChar(int num, char c) {
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
		System.out.printf("%s 문자 %d개 출력 : ",c ,num);
		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public char alphabette() {
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함
		int n = 0;
		char c = ' ';

		n = (int) (Math.random() * 58 + 65); // * 범위 + 시작숫자

		if (n >= 65 && n <= 90 || n >= 97 && n <= 122) {
			c = (char)n;
		}
		return c;
	}

	public String mySubstring(String str, int index1, int index2) {
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		
		System.out.printf("%s의 %d번 %d번 인덱스 사이의 값 출력 : ", str, index1, index2);
		char[] arr = new char[str.length()];

		for (int i = 0; i < index2; i++) { // 배열에 문자를 넣음
			arr[i] += str.charAt(i);
		}

		for (int i = index1-1; i < index2; i++) {
			System.out.print(arr[i] + " ");
		} 
		return null;
	}

}
