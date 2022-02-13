package com.study.practice06;


public class Run {

	public static void main(String[] args) {
			Practice06 p = new Practice06();
			System.out.println("---------1---------");
			p.method1();
			System.out.println("---------2---------");
			p.method2();
			System.out.println("---------3---------");
			p.method3();
			System.out.println("---------4---------");
			p.method4();
			System.out.println("---------5---------");
			p.method5();
			System.out.println("---------6---------");
			p.method6();
			System.out.println("---------7---------");
			p.method7();
			System.out.println("---------8---------");
			p.method8();
			System.out.println("---------9---------");
			p.method9();
		}
		
	

		public void method4() {
			int[][] arr = new int[4][4];
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr[i].length - 1; j++) {

					arr[i][j] = (int) (Math.random() * 10 + 1);

					int num = arr.length - 1;

					arr[i][3] += arr[i][j];
					arr[3][j] += arr[i][j];
					arr[3][3] += arr[i][j];
					System.out.printf("arr[%d][%d] = %d%n", i, j, arr[i][j]);
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("%3d ", arr[i][j]);
				}
				System.out.println();
			}
		}
	}