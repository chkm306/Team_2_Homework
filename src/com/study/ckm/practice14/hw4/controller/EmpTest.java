package com.study.practice14.hw4.controller;

import java.util.Scanner;

import com.study.practice14.hw4.model.vo.Employee;

public class EmpTest {
	private Scanner sc = new Scanner(System.in);
	Employee[] arr = new Employee[6];
	{
		arr[0] = new Employee("김문말", 24, 1500000, 1.245);
		arr[1] = new Employee("이장소", 40, 2500000, 1.4);
		arr[2] = new Employee("박금순", 22, 1780000, 1.3);
		arr[3] = new Employee("최봉호", 31, 1950000, 1.365);
		arr[4] = new Employee("홍달림", 34, 1650000, 1.212);
	}

	public void setEmp() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("급여를 입력하세요 : ");
		int salary = sc.nextInt();
		System.out.print("세율을 입력하세요 : ");
		double tax = sc.nextDouble();

		arr[5] = new Employee(name, age, salary, tax);

	}

	public void printEmp() {
		for (Employee e : arr) {
			System.out.println(e);
		}
	}

	public void nameSortPrint() { // 이름 기준 오름차순

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (0 < arr[i].getName().compareTo(arr[j].getName())) {
					Employee empTemp = arr[i];
					arr[i] = arr[j];
					arr[j] = empTemp;
				}
			}
		}
	}

}
