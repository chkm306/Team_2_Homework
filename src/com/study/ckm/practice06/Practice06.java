package com.study.practice06;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice06 {
	Scanner sc = new Scanner(System.in);

	public void method1() {

		/*int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};*/

		int[][] arr = new int[4][4];
		int num = 1;

		// for문 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// System.out.printf("arr[%d][%d] = %d%n",i,j, arr[i][j]);
				arr[i][j] = num++;
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method2() {
		/*int[][] arr = {
				{16,15,14,13},
				{12,11,10,9},
				{8,7,6,5},
				{4,3,2,1}};*/
		int[][] arr = new int[4][4];
		int num = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// System.out.printf("arr[%d][%d] = %d%n",i,j, arr[i][j]);
				arr[i][j] = num--;
				System.out.printf("%d \t ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method3() {
		String[][] arr = new String[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + "," + j + ")";
			}
		}
		// System.out.println(Arrays.deepToString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*public void method4() { // 다시 풀기 (답안지없이)
		int[][] arr = new int[4][4];
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
	
		// 난수 생성 및 더하기.......
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
	
				arr[i][j] = (int) (Math.random() * 10 + 1);
	
				int num = arr.length-1;
				
				arr[i][3] += arr[i][j]; // 이걸 생각을 못 했네..
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
				
				//arr[0][3] = arr[0][0~2] 합
				//arr[1][3] = arr[1][0~2] 합
				//arr[2][3] = arr[2][0~2] 합
	
				// arr[i][3] = arr[i][j]++;
				// a1 = arr[0][j];
				// a2 += arr[1][j];
				// a3 += arr[2][j];
				
				System.out.printf("arr[%d][%d] = %d%n", i, j, arr[i][j]);
			}
		}
	
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
	
		// arr[0][3] = a1;
		// arr[1][3] = a2;
		// arr[2][3] = a3;
		// arr[0][0] + arr[0][1];
	
	}*/

	public void method4() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
				
				if (i < 3) {
					System.out.println("i : "+i+" j : "+j);
					arr[i][3] += arr[i][j];
					arr[3][j] += arr[i][j];
					arr[3][3] += arr[i][j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method5() {

		while (true) {
			try {

				System.out.println("행 크기 : ");
				int wid = sc.nextInt();

				System.out.println("열 크기 : ");
				int len = sc.nextInt();
				char[][] arr = new char[wid][len];

				if (wid > 0 && wid <= 10 && len > 0 && len <= 10) {

					for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < arr[i].length; j++) {
							arr[i][j] = (char) (Math.random() * 26 + 65);
							System.out.printf("arr[%d][%d] = %s%n", i, j, arr[i][j]);
						}
					}

					for (int i = 0; i < arr.length; i++) {
						for (int j = 0; j < arr[i].length; j++) {
							System.out.printf("%s ", arr[i][j]);
						}
						System.out.println();
					}
					break;

				} else {
					System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
				sc.next();
				continue;
			}
		}
	}

	public void method6() { // 약간 허무하네... 그래도 풀었다!
		String[][] arr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");

				/*if (j == 0) {
					System.out.print(arr[i][0] + " ");
					continue;
				} else if (j == 1) {
					System.out.print(arr[i][1] + " ");
				} else if (j == 2) {
					System.out.print(arr[i][2] + " ");
				} else if (j == 3) {
					System.out.print(arr[i][3] + " ");
				}*/
				// 0,0 1,0 2,0 3,0 4,0 0,1
			}
		}
		System.out.println();
	}

	public void method7() { // 다시 풀기

		int asd = 0;

		System.out.println("행 크기 : ");
		int num1 = sc.nextInt();

		for (int i = 0; i < num1; i++) {

			System.out.printf("%d행의 크기 : %n", i);
			int num2 = sc.nextInt();

			char[] arr = new char[num2];

			for (int j = 0; j < arr.length; j++) {
				arr[j] = (char) (97 + asd);
				asd++;
			}

			System.out.println(arr);
		}

		/*for (int i = 0; i < num1; i++) {
			System.out.printf("%d행의 크기 : %n", i);
			int num2 = sc.nextInt();
		
			char[][] arr = new char[num1][num2];
		
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) (97 + i);
		
				System.out.printf("arr[%d][%d] = %s%n", i, j, arr[i][j]);
			}
		}*/

		/*for (int i = 0; i < num1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
		
				arr[i][j] = (char) 91+i;
		
				System.out.printf("arr[%d][%d] = %s%n", i, j, arr[i][j]);
		
			}
		}*/

		/*}while(true){
			System.out.println("열 크기 : ");
			int len = sc.nextInt();
			char[][] arr = new char[num][len];
			
		}*/
	}

	public void method8() {
		String[] stu = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] stu1 = new String[3][2];
		String[][] stu2 = new String[3][2];

		int ad = 0;

		System.out.println("=== 1분단 ===");
		for (int i = 0; i < stu1.length; i++) {
			for (int j = 0; j < stu1[i].length; j++) {
				stu1[i][j] = stu[ad];
				ad++;
				// System.out.printf("stu1[%d][%d] = %s%n", i, j, stu1[i][j]);
			}
		}

		for (int i = 0; i < stu1.length; i++) {
			for (int j = 0; j < stu1[i].length; j++) {
				System.out.print(stu1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=== 2분단 ===");
		for (int i = 0; i < stu2.length; i++) {
			for (int j = 0; j < stu2[i].length; j++) {
				stu2[i][j] = stu[ad];
				ad++;
			}
		}
		for (int i = 0; i < stu2.length; i++) {
			for (int j = 0; j < stu2[i].length; j++) {
				System.out.print(stu2[i][j] + " ");
				// System.out.printf("stu2[%d][%d] = %s%n", i, j, stu2[i][j]);
			}
			System.out.println();
		}
	}

	public void method9() {
		String[] stu = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] stu1 = new String[3][2];
		String[][] stu2 = new String[3][2];

		int ad = 0;

		System.out.println("=== 1분단 ===");
		for (int i = 0; i < stu1.length; i++) {
			for (int j = 0; j < stu1[i].length; j++) {
				stu1[i][j] = stu[ad];
				ad++;
			}
		}

		for (int i = 0; i < stu1.length; i++) {
			for (int j = 0; j < stu1[i].length; j++) {
				System.out.print(stu1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=== 2분단 ===");
		for (int i = 0; i < stu2.length; i++) {
			for (int j = 0; j < stu2[i].length; j++) {
				stu2[i][j] = stu[ad];
				ad++;
			}
		}

		for (int i = 0; i < stu2.length; i++) {
			for (int j = 0; j < stu2[i].length; j++) {
				System.out.print(stu2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================");
		while (true) {
			System.out.println("검색할 학생 이름을 입력하세요 : ");
			String sea = sc.nextLine();

			for (int i = 0; i < stu1.length; i++) {
				for (int j = 0; j < stu1[i].length; j++) {
					if (stu1[i][j].equals(sea)) {
						System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 %s에 있습니다.%n", sea, i + 1, j == 1 ? "오른쪽" : "왼쪽");
					}
				}
			}

			for (int i = 0; i < stu2.length; i++) {
				for (int j = 0; j < stu2[i].length; j++) {
					if (stu2[i][j].equals(sea)) { // 2차원 배열이면 [][] 추가하고, printf의 문자열은 %s이다!!!!!!!!
						System.out.printf("검색하신 %s 학생은 2분단 %s번째 줄 %s에 있습니다.%n", sea, i + 1, j == 1 ? "오른쪽" : "왼쪽");
					}
				}
			}
		}
	}
}
