package com.study.practice11.hw1.run;

import java.util.Arrays;
import java.util.Scanner;

import com.study.practice11.hw1.model.vo.Employee;
import com.study.practice11.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		// 위의 학생 정보 모두 출력
		Student[] stu = new Student[3];

		stu[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		stu[1] = new Student("김말뚱", 21, 187.3, 80.0, 2, "경영학과");
		stu[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		for (int i = 0; i < stu.length; i++) {
			System.out.println("stu[" + i + "]=" + stu[i].information());
		}
		System.out.println("=======================");
		// for(Student s : stu) { // (for each문)
		// System.out.println(s.information());
		// }

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
		// 한 명씩 추가 될 때마다 카운트함
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
		// ‘n’일 경우 더 이상 그만 입력 받도록..

		Scanner sc = new Scanner(System.in);
		int count = 2;

		Employee[] emp = new Employee[10];
		emp[0] = new Employee("박보검", 28, 180.3, 72.0, 10000000, "영업부");
		emp[1] = new Employee("강동원", 40, 182.0, 76.0, 20000000, "기획부");

		while (true) {
			System.out.println("사원 이름을 입력해주세요 : ");
			String name = sc.nextLine();
			System.out.println("사원 나이를 입력해주세요 : ");
			int age = sc.nextInt();
			System.out.println("사원 키를 입력해주세요 : ");
			double hei = sc.nextDouble();
			System.out.println("사원 몸무게를 입력해주세요 : ");
			double wei = sc.nextDouble();
			System.out.println("사원 급여를 입력해주세요 : ");
			int sar = sc.nextInt();
			sc.nextLine();
			System.out.println("사원 부서를 입력해주세요 : ");
			String dept = sc.nextLine();

			// for (int i = 2; i < emp.length; i++) {
			// emp[i] = new Employee(name, age, hei, wei, sar, dept);
			//
			// System.out.println("계속 추가하시겠습니까? (y/n)");
			// char ch = sc.nextLine().toUpperCase().charAt(0);
			// if (ch == 'Y') {
			// continue;
			// } else if (ch == 'N') {
			// break;
			// } else {
			// System.out.println("다시 입력해주세요.");
			// }
			// }
			emp[count++] = new Employee(name, age, hei, wei, sar, dept);

			//while (true) { 
			System.out.println("계속 추가하시겠습니까? (y/n)");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if (ch == 'Y') {
				continue;
			}
			System.out.println("========================");
			// 여기서 java.lang.NullPointerException 뜨는 이유좀 emp.length써서 그랫음 count로 바꿈

			// 배열에 담긴 사원들의 정보를 모두 출력
			for (int i = 0; i < count; i++) {
				System.out.println(emp[i].information());
			}
			break;
		}

	}

}
