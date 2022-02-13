package com.study.practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Practice05 {

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

		int result = arr.length; // 길이 10이 담기고 줄어드는 값을 저장해줄 변수

		for (int i = 0; i < arr.length; i++) {
			arr[i] = result--;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void method3() {
		int num = 10;
		System.out.println("양의 정수 : " + num);

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void method4() {
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("귤")) {
				System.out.println(arr[i]);
			}
		}
	}

	public void method5() {
		String str = "application";
		System.out.println("문자열 : " + str);

		char ch = 'a';
		System.out.println("문자 : " + ch);

		System.out.printf("%s에 %s가 존재하는 위치 (인덱스) : ", str, ch);

		char[] arr = new char[str.length()];
		int num = 0;

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			// System.out.printf("arr[%s] = %s %n",i,arr[i]);
			if (arr[i] == ch) {
				System.out.print(i + " ");
				num++;
			}
		}
		System.out.println();
		System.out.printf("%s 개수 : %s%n", ch, num);
	}

	public void method6() {
		int num = 0;
		System.out.println("0~6사이 숫자 입력 : " + num);
		/*switch (num) {
		case 0:
			System.out.println("월요일");
			break;
		case 1:
			System.out.println("화요일");
			break;
		case 2:
			System.out.println("수요일");
			break;
		case 3:
			System.out.println("목요일");
			break;
		case 4:
			System.out.println("금요일");
			break;
		case 5:
			System.out.println("토요일");
			break;
		case 6:
			System.out.println("일요일");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}*/

		String arr[] = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" }; // 이게 훨 편하네 ㅋㅋ
		if (num < 7 && num >= 0) {
			System.out.println(arr[num]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);

		int num = 5;
		System.out.println("정수 : " + num);

		int[] arr = new int[num];
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.printf("배열 %s번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		 System.out.println(Arrays.toString(arr));
		System.out.println("총합 : " + sum);
	}

	public void method8() {
		int num = 11;
		System.out.println("정수 : " + num);

		int[] arr = new int[num];
		int count = 1;

		if (num % 2 == 1 && num > 0) {

			for (int i = 0; i < num; i++) {
				if (i < num / 2) {
					arr[i] = count++;
				} else if (i >= num / 2) {
					arr[i] = count--;
				}
				System.out.printf(arr[i] + " ");
			}
		} else {
			System.out.println("다시 입력하세요.");
		}
		System.out.println();

		if (num % 2 == 1 && num > 0) {
			for (int i = 0; i < num; i++) {
				arr[i] = count + 1;
				if (i < arr.length / 2) { // 배열의 중간까지는
					count++; // 1증가
				} else {
					count--; // 1감소
				}
				System.out.printf(arr[i] + " ");
			}
		} else {
			System.out.println("다시 입력하세요.");
		}
		System.out.println();
	}

	public void method9() { // 에러남 왜인지 알아내기
		String arr[] = { "양념", "후라이드", "로제", "불닭", "고추바사삭", "지코바" };

		String str = "양념";
		System.out.println("치킨 이름을 입력하세요 : " + str);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				System.out.printf("%d치킨 배달 가능", str);
			} else {
				System.out.printf("%d치킨은 없는 메뉴입니다", str);
			}
		}
	}

	public void method10() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void method11() {
		int[] arr = new int[10];

		int max = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
			/*if(arr[i] > arr[i]) {
				System.out.println("최대값 : "+arr[i]);
			}
			if(arr[i] < arr[i]) {
				System.out.println("최대값 : "+arr[i]);
			}*/
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);
	}

	public void method12() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) { // 여기 조건식 사실 잘 모르겟음
				if (arr[i] == arr[j]) {
					i--;
					// break; // 이걸 안했누
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void method13() {
		String mine = "123456-1234567";
		System.out.println("주민등록번호(-포함) : " + mine);

		char[] arr = new char[mine.length()];

		for (int i = 0; i < mine.length(); i++) {
			/*if(i <= 7) {
			arr[i] = mine.charAt(i);
			}else if(i > 7) {
				System.out.print("*");
			}*/
			if (i <= 7) {
				arr[i] = mine.charAt(i);
			} else if (i > 7) {
//				System.out.print("*"); //이거쓰니까 띄어짐 ㅠ
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
//		Arrays.toString(arr);
		System.out.println();
	}

	public void method14() {
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) { // 여기 조건식 사실 잘 모르겟음
				if (arr[i] == arr[j]) { // 중복제거
					i--;
				}
				if (arr[i] < arr[j]) { // 오름차순 정렬
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
