package com.study.practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Practice05 {
	Scanner sc = new Scanner(System.in);

	public void method1() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void method2() {
		int[] arr = new int[10];

		for (int i = arr.length; i > 0; i--) {
			arr[i - 1] = i;
			System.out.print(arr[i - 1] + " ");
		}
		System.out.println();
	}

	public void method3() {
		int num = 5;
		System.out.println("양의 정수 : " + num);

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void method4() { // 입력하고, 도출해서, for문으로 꺼내보기
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(arr[1]);
	}

	public void method5() {// 다시풀기

		System.out.println("문자열 : ");
		String str = sc.nextLine();

		System.out.println("문자 : ");
		char str1 = sc.nextLine().charAt(0);

		int sum = 0;
		int len = str.length();

		char[] arr = new char[len];

		System.out.printf("%s에 %s가 존재하는 위치 (인덱스) : ", str, str1);

		for (int i = 0; i < len; i++) { // 약간 야매느낌
			arr[i] = str.charAt(i);

			if (arr[i] == str1) {
				System.out.print(i + " "); // 인덱스 번호
				sum++; // 안 쪽에서 이 변수를 if문이 돌때마다 증가하도록 하는 방법이 있구나!!!!!!!
			}
		}
		System.out.println();
		System.out.printf("%s 개수 : %d\n", str1, sum);

	}

	public void method6() {
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };

		if (num <= 6 && num >= 0) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[num] + "요일");
				break;
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void method7() { // 뭔가 느리다..

		System.out.println("정수 : ");
		int num = sc.nextInt();

		int sum = 0;
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {

			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int num1 = sc.nextInt(); // 값 받는 중

			arr[i] = num1; // 배열에 값 담는중
			sum += num1; // 총합 구하는 중

			// System.out.println(Arrays.toString(arr)); // 혹시 몰라서 배열 출력하는 중
		}
		System.out.println("총합 : " + sum);
	}

	public void method8() {// 다시풀기
//		while (true) {
	
			System.out.println("정수 : ");
			int num = sc.nextInt();
	
			int count = 1; // 배열에 넣을 값 (생각도 못했음)
			int[] arr = new int[num];
	
			if (num > 3 && num % 2 == 1) {
				for (int i = 0; i < arr.length; i++) {
	
					arr[i] = count; // 배열에 증가하는 값 넣기
	
					if (i < arr.length / 2) { // 모르겠어서 가이드 참조한거
						count++;
					} else {
						count--;
					}
					// arr[i] = i+1; // 내가 하던거
					// if(i > num/2) { // 중간 이후부터 1로 됨
					// arr[i] = i;
					// }
					System.out.println(Arrays.toString(arr));
				}
//				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	

	public void method9() {
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
	
		int count = 1; // 배열 안에 들어갈 변수
		
		if (num > 3 && num % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = count;
				
				if(i < arr.length/2) {
					count++;
				}else {
					count--;
				}
				System.out.println(Arrays.toString(arr)); // 출력문을 안 씀
			}
		}else {
			System.out.println("다시 입력하세요.");
		}
	}
	

	public void method546() {// 다시 풀기
		String[] arr = { "로제", "양념", "후라이드", "파닭", "어니언", "간장", "치즈" };

		System.out.println("치킨 이름을 입력하세요 : ");
		String chi = sc.nextLine();

		boolean tf = false; // 생각지도 못했던 방법! 가이드 참고 ㅠ

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(chi)) { // arr.이퀄 하지말고 arr[i]로 찾기
				tf = true;
				break;
			} /*else{ // 이게 계속 돌아간다 반복문 안의 if라서 false때 도나보다 ㅠ
				System.out.println(chi + "치킨은 없는 메뉴입니다.");
				break;
				}*/
		}
		if (tf = true) {
			System.out.println(chi + "배달 가능");
		} else {
			System.out.println(chi + "치킨은 없는 메뉴입니다.");
		}
	}

	public void method10() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 - 1);
		}
		System.out.println(Arrays.toString(arr));
	}

	public void method11() { // 궁성쓰 강의 // 다시 풀기
		
		int[] arr = new int[10];
		
		int max = arr[0];
		int min = arr[0];
	
		for (int i = 1; i < arr.length; i++) {
	
			arr[i] = (int) (Math.random() * 10 + 1);
	
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	
	/*public void method11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 +1);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		
		
	}*/

	public void method12() {
		int[] arr = new int[10];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); // 난수 생성+배열에 담기

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) { // 중복 제거
					i--;
					break;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
	}

	public void method13() {
		System.out.print("주민등록번호 : ");
		String str = sc.nextLine();

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

			if (i > 7) {
				arr[i] = '*';
			}
		}
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	/*public void method14() {
		int[] arr = new int[45];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		} // 중복값이 있을리 없음
		
		int tmp = 0;
		int j = 0;
		
		for(int i = 0; i < 6; i++) { //로또 출력되는 6숫자만 랜덤하게
			j = (int) (Math.random() * 45); // 섞을 범위
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = arr[i];
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(arr[i]+" ");
		}
	}*/
	public void method14() { // 까먹어서 가이드 봄..ㅋㅋ
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) { // 중복 제거
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i]; // 오름차순 정렬
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) { // 배열 출력
			System.out.print(lotto[i] + " ");
		}
	}
	void stack1() {
		int x = 10;
		stack2();
	}
	
	void stack2() {
		int y = 5;
	}
	
	void main() {
		stack1();
		return 0;
	}
}
