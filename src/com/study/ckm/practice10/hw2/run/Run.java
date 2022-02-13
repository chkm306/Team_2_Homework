package com.study.practice10.hw2.run;

import java.util.Scanner;

import com.study.practice10.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student stu[] = new Student[10];
		stu[0] = new Student(1, 5, "홍길동", 40, 60, 70);
		stu[1] = new Student(2, 1, "김말똥", 70, 80, 100);
		stu[2] = new Student(3, 3, "강개순", 100, 75, 86);

		int count = 3; // 학생 수를 나타내는 변수  한 명 추가 시 1씩 증가시켜줄꺼임

		// while(true)을 사용하여 학생들의 정보를 계속 입력 받고
		// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();

			// 사용자가 입력한 값들을 가지고 학생객체 생성 후 객체배열에 담기
			stu[count++] = new Student(grade, classroom, name, kor, eng, math);

			System.out.print("계속 추가 하시겠습니까? : ");
			String str = sc.nextLine().toUpperCase();

			if (str.equals("N")) {
				break;
			}
		}

		// 한 명씩 추가 되었기 때문에 count 1증가
		// 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
		// 현재 배열에 담겨있는
		// 학생들의 정보를 모두 출력
		for (int i = 0; i < count; i++) {

			int ave = stu[i].getKor() + stu[i].getMath() + stu[i].getEng();

			System.out.println(stu[i].information() + ", 평균 " + ave / 3);

		}

	}

}
