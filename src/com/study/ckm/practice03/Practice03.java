package com.study.practice03;

import java.util.Scanner;

public class Practice03 {

	Scanner sc = new Scanner(System.in);

	public void method1() {
		int num = 5;
		System.out.println("1 이상의 숫자를 입력하세요 : " + num);

		/*for (int i = 1; i <= num; i++) {
			if (num > 0) {
				System.out.print(i + " ");
			} else if (num <= 0){ // 이게 왜 건너뗘지지?
				System.out.println("잘못 입력하셨습니다.");
			}
		}*/

		if (num > 0) { // 조건문을 밖으로 빼니까 잘 작동함. 반복문 안에 조건문이 있을때는 작동을 못했음.
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("잘못 입력하셨습니다.");
		}
		System.out.println();
	}

	public void method2() {

		Loop1: for (;;) { // 반복문에 이름 붙이기
			System.out.println("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) { // 0 초과일 때 반복문 실행됨
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break Loop1; // 이름 붙인 반복문 빠져나가기
			} else { // 0 이하일 때 다시 입력받음
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	/*public void method3() { // 고심끝에 조건식을 생각해냄....
		int num = 11;
		System.out.println("1 이상의 숫자를 입력하세요 : " + num);
	
		if (num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}*/

	public void method3() {
		int num = 11;
		System.out.println("1 이상의 숫자를 입력하세요 : " + num);

		// for(int i = 0; i <= num; i++) { // i는 늘고 num은 줄어서 3번 반복하고 끝남
		// num--;
		// System.out.println("num"+num+" i "+i);
		// }
		for (int i = 1; i <= num;) {
			System.out.print(num + " "); // i를 고정하고 num만 변하는데 처음 num 까지 출력해야해서 식보다 먼저 출력
			num -= i;
			// System.out.println("num"+num+" i "+i);
		}

		for (int i = 0; i < num; i++) { // num을 출력할 게 아니라 따로 출력할 변수를 선언해주는 게 답이네
			int result = num - i;
			System.out.print(result + " ");
		}

		System.out.println();

	}

	public void method4() {
		for (;;) {
			System.out.println("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	/*	public void method5() { // 좀 복잡하게 됨... 다른 방식으로 해보기
			int num = 8;
			System.out.println("정수를 하나 입력하세요 : " + num);
	
			int result = 0;
			for (int i = 1; i < num; i++) {
				System.out.print(i + " + ");
				result += i;
			}
			System.out.println(num + " = " + (result + num));
		}*/

	public void method5() {
		int num = 10;
		int result = 0;
		System.out.println("정수를 하나 입력하세요 : " + num);

		for (int i = 1; i <= num; i++) {

			result += i;
			if (i >= num) { // i와 num이 같거나 클때 =를 출력하고 continue로 반복문을 빠져나감
				System.out.println(i + " = " + result);
				continue;
			}
			System.out.print(i + " + ");
		}
	}

	/*public void method6() { // 먼가 아닌거같은데 일단 됐음. 다시 해보기.
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		for (int i = num1; num1 < num2 || num2 < num1; i++) {
		}
		if (num1 < num2) {
			for (int i = num1; num1 > num2; i++) {
				System.out.println(i+" ");
			}
		}else if(num1 > num2) {
			for (int i = num2; num1 < num2; i++) {
				System.out.println(i+" ");
			}
		}else if (num1 < 0 || num2 < 0){
			System.out.println("1 이상의 숫자만을 입력해주세요.");
		}
		if (num1 > 0 && num2 > 0) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자만을 입력해주세요.");
		}
	}*/
	public void method6() {
		int num1 = 5;
		System.out.println("첫 번째 숫자 : " + num1);
		
		int num2 = 7;
		System.out.println("두 번째 숫자 : " + num2);
		
		int result = 0; // 결과 담아줄 변수 사용 ★★★★★
		
		if(num1 >0 && num2 > 0) {
		for(int i = num1; i <= num2; i++) {
			result = i;
			System.out.print(result+" ");
		}
		System.out.println();
		
		}else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}
		
	}

	public void method7() {
		for (;;) {

			System.out.println("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.println("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 > 0 && num2 > 0) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자만을 입력해주세요.");
			}
			System.out.println();
		}
	}

	public void method8() {
		int num = 4;
		System.out.println("숫자 : " + num);
		System.out.printf("=====%d단=====\n", num);
		for (int i = num; i <= num; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

	public void method9() {
		int num = 4;
		System.out.println("숫자 : " + num);
		if (num > 1 && num < 10) {
			for (int i = num; i < 10; i++) {
				System.out.printf("=====%d단=====\n", i);
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}

	public void method10() {
		while (true) {
			System.out.println("숫자 : ");
			int num = sc.nextInt();

			if (num > 1 && num < 10) {
				for (int i = num; i < 10; i++) {
					System.out.printf("=====%d단=====\n", i);
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i * j);
					}
				}
				break;
			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}

	/*public void method11() { // 어쩌다가 했네... ㅋㅋㅋ 이해제대로 못함
		System.out.println("시작 숫자 : ");
		int num1 = sc.nextInt();
	
		System.out.println("공차 : ");
		int num2 = sc.nextInt();
	
		for (int i = num1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + " ");
				i = i + num2;
			}
		}
		System.out.println();
	}*/
	public void method11() {
		int num1 = 4;
		System.out.println("시작 숫자 : " + num1);
		
		int num2 = 3;
		System.out.println("공차 : " + num2);
		
//		int result = 0;
		
		for(int i = 0; i < 10; i++) { // i는 반복문 도는 횟수
			System.out.print(num1 + " "); // 첫 시작은 num1 그 다음부터는 num2만큼 증가된 숫자로 표현됨
			num1 += num2; // 반복문 끝날때까지 계속 num1은 num2만큼 증가되어 저장되는 변수
		}
		System.out.println();
	}
	

	public void method12() {
		while (true) {
			int num1 = 5;
			System.out.println("정수1 : " + num1);
			int num2 = 0;
			System.out.println("정수2 : " + num2);

			System.out.println("연산자(+ - / * %) : ");
			String add = sc.nextLine();

			switch (add) {
			case "+":
				System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
				break;
			case "-":
				System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
				break;
			case "/":
				if (num1 == 0 || num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					break;
				} else { // 이게 자꾸 실행이 됨... 아 위에 if문에 break를 안걸었다.
					System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
					break;
				}
			case "*":
				System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
				break;
			case "%":
				System.out.printf("%d % %d = %d\n", num1, num2, (num1 % num2));
				break;
			case "exit":
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
}
