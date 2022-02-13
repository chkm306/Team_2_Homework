package com.study.practice04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice04 {
	Scanner sc = new Scanner(System.in);

	public void method1() {

		/*System.out.println("메뉴 번호를 입력하세요 : ");
		
		try {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
		
		} catch (InputMismatchException e) {
			Scanner sc = new Scanner(System.in);
		}*/

		int num = 0; // 미리 선언 위에꺼 에러★★★★★★★★★★★★
		String str = "";

		while (true) {
			try {
				System.out.println("=====================");
				System.out.println("1. 입력");
				System.out.println("2. 수정");
				System.out.println("3. 조회");
				System.out.println("4. 삭제");
				System.out.println("9. 종료");
				System.out.println("메뉴 번호를 입력하세요 : ");
				num = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); // 로그용 출력값이 입력으로 가버려서 무한반복됨
				sc.nextLine(); // 버퍼 빼주는 걸로 오류 잡음
				continue;
			}

			switch (num) {
			case 1:
				System.out.print("입력");
				break; // return으로 완전히 빠져나가면 종료됨.
			case 2:
				System.out.print("수정");
				break;
			case 3:
				System.out.print("조회");
				break;
			case 4:
				System.out.print("삭제");
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.print("없는");
			}
			System.out.print(" 메뉴입니다.\n");
			break;
		}

		/*// 3. switch문 이용할 때 String 변수 이용하는 방법 (가이드에 있던거 내꺼랑 비슷한 방식)
		switch (num) {
		case 1:
			str = "입력";
			break;
		case 2:
			str = "수정";
			break;
		case 3:
			str = "조회";
			break;
		case 4:
			str = "삭제";
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(str + " 메뉴입니다.");*/
	}

	/*public void method2() {
	
		int num = 0; // 받은 값 저장하기
	
		while (true) {
			try {
				System.out.println("숫자를 한 개 입력하세요 : ");
				num = sc.nextInt();
	
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.");
				sc.nextLine();
			}
			break;
		}
		String result = num < 0 ? "양수만 입력해주세요.":
						num > 0 && num % 2 == 0 ? "짝수다." : 
						num > 0 && num % 2 == 1 ? "홀수다." : 
						"1 이상의 숫자를 입력해주세요."; // 0일 경우나 문자열일 경우
		System.out.println(result);
		// 잘못 입력했든 제대로 입력했든 바로 끝남
	}*/

	public void method2() { // 최종 : 예외처리+if문 사용 // 나중에 더블형으로 해볼까..

		int num = 0;

		while (true) {
			try {
				System.out.println("숫자를 한 개 입력하세요 : ");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				sc.next();
				continue;
			}

			if (num > 0) {
				if (num % 2 == 0) {
					System.out.println("짝수다");
					break;
				} else if (num % 2 == 1) {
					System.out.println("홀수다");
					break;
				}
			} else if (num <= 0) {
				System.out.println("양수만 입력해주세요.");
			}
		}
	}

	public void method3() { // 더블형으로 받아봤음 // 배열로 해보기
		double kor = 0;
		double math = 0;
		double eng = 0;

		while (true) {
			try {
				System.out.print("국어 점수 : ");
				kor = sc.nextDouble();
				System.out.print("수학 점수 : ");
				math = sc.nextDouble();
				System.out.print("영어 점수 : ");
				eng = sc.nextDouble();

			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				sc.next();
				continue; // 이거 안써주면............뭐더라? 아 if 맨 마지막 else로 가짐
			}

			double sum = kor + math + eng;
			double ave = sum / 3;

			if (kor >= 40 && math >= 40 && eng >= 40) {
				if (ave > 60) {
					System.out.printf("국어 : %.1f\n수학 : %.1f\n영어 : %.1f\n합계 : %.1f\n평균 : %.1f\n", kor, math, eng, sum,
							ave);
					System.out.println("축하합니다. 합격입니다!");
					break;
				} else {
					System.out.println("불합격입니다.");
					break;
				}
			} else {
				System.out.println("불합격입니다.");
				break;
			}
		}
	}

	public void method4() {

		int month;

		while (true) {
			try {
				System.out.println("-------------------");
				System.out.println("1~12월 사이의 정수 입력 : ");
				month = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				sc.next();
				continue;
			}
			switch (month) {
			case 3, 4, 5:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6, 7, 8:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9, 10, 11:
				System.out.println(month + "월은 가을입니다.");
				break;
			case 1, 2, 12:
				System.out.println(month + "월은 겨울입니다.");
				break;
			default:
				System.out.println(month + "월은 잘못 입력된 달입니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
	}

	public void method5() {
		String id = "asdf";
		String pwd = "1234";

		System.out.println("아이디 : ");
		String logid = sc.nextLine();

		System.out.println("비번 : ");
		String logpwd = sc.nextLine();

		if (logid.equals(id)) {
			if (logpwd.equals(pwd)) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

	public void method6() {
		String grade = "관리자";
		System.out.println("권한을 확인하고자 하는 회원 등급 : " + grade);

		if (grade.equals("관리자")) {
			System.out.println("회원 관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
		} else if (grade.equals("회원")) {
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
		} else if (grade.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		switch (grade) { // 예문처럼 하려면 이렇게 해야함
		case "관리자":
			System.out.println("회원 관리, 게시글 관리");
		case "회원":
			System.out.println("게시글 작성, 댓글 작성");
		case "비회원":
			System.out.println("게시글 조회");
			break;
		}

	}

	public void method7() {
		double m = 1.62;
		System.out.println("키(m)를 입력해 주세요 : " + m);
		double kg = 100;
		System.out.println("몸무게(kg)를 입력해 주세요 : " + kg);

		double bmi = kg / (m * m);

		// System.out.println(bmi > 30 ? "고도비만" : bmi > 23 ? "과체중" : bmi > 18.5 ? "저체중"
		// : "잘못 입력하셨습니다.");
		System.out.println("BMI : " + bmi);
		// System.out.println(bmi < 18.5 ? "저체중" : bmi <= 23 ? "과체중" : bmi > 30 ? "과체중"
		// : "");
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else if (bmi >= 30) {
			System.out.println("고도 비만");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void method8() {
		int num1 = 15;
		System.out.println("피연산자1 입력 : " + num1);
		int num2 = 4;
		System.out.println("피연산자2 입력 : " + num2);

		String ope = "%";
		System.out.println("연산자 입력 (+,-,*,/,%) : " + ope);

		switch (ope) {
		case "+":
			System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
			break;
		case "-":
			System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
			break;
		case "*":
			System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
			break;
		case "/":
			System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
			break;
		case "%":
			System.out.printf("%d %% %d = %d", num1, num2, (num1 % num2));
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		System.out.println();
	}

	public void method9() {
		int num1 = 100;
		System.out.println("중간고사 점수 : " + num1);
		int num2 = 80;
		System.out.println("기말고사 점수 : " + num2);
		int num3 = 50;
		System.out.println("과제 점수 : " + num3);
		int num4 = 15;
		System.out.println("출석 회수 : " + num4);

		double sum = (num1 * 0.2) + (num2 * 0.3) + (num3 * 0.3) + ((num4 * 5) * 0.2);

		System.out.println("=======결과=======");

		if (num4 >= 20 * 0.7 && sum >= 70) {
			System.out.println("중간 고사 점수 \t(20) : " + (num1 * 0.2));
			System.out.println("기말 고사 점수 \t(30) : " + (num2 * 0.3));
			System.out.printf("과제 점수 \t\t(30) : %s%n", (num3 * 0.3));
			System.out.printf("출석 점수 \t\t(20) : %s%n", ((num4 * 5) * 0.2)); // 100점 중에서 20이 100이 되려면 5번 곱해야해서(기준이 100임)

			System.out.println("총점 : " + sum); // 위에꺼 전체 괄호로 연산가능

			System.out.println("PASS!!");
		} else {
			// if (sum < 70) {
			// System.out.printf("FAIL [점수 미달] (총점 %s)%n", sum);
			// } else if (num4 < 20 * 0.7) {
			// System.out.printf("FAIL [출석 횟수 부족] (%s / 20)%n", num4);
			// }
			if (sum < 70) { // 둘다 출력하고 싶으면 별개로 쓰면 됨.......ㅠ
				System.out.printf("FAIL [점수 미달] (총점 %s)%n", sum);
			}
			if (num4 < 20 * 0.7) {
				System.out.printf("FAIL [출석 횟수 부족] (%s / 20)%n", num4);
			}
		}
	}

	public void method10() {
		for (;;) {
			System.out.println("===================");
			System.out.println("실행할 기능을 선택하세요.");
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. Pass/Fail");
			System.out.println("선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 4:
				method4();
				break;
			case 5:
				method5();
				break;
			case 6:
				method6();
				break;
			case 7:
				method7();
				break;
			case 8:
				method8();
				break;
			case 9:
				method9();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		}
	}
}
