package com.study.practice07.p3.view;

import java.util.Scanner;

import com.study.practice07.p3.model.vo.Employee;

public class EmpMenu2 {
	Scanner sc = new Scanner(System.in);
	Employee e = new Employee();

	public EmpMenu2() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {
		Employee e = null;
		while (true) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				modifyEmployee();
				break;
			case 2:
				inputEmployee(e);
				break;
			case 3:
//				e = null;
//				break; // 끄는거 말고 어떻게 하지
				return;
			case 4:
				System.out.println(e.information()); // 없을 경우 없습니다 출력하게 하기!!!!!!!!!!!
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}

	}

	private Employee modifyEmployee() {
		// 키보드를 통해 사원 정보를 입력받게끔 구현
		// 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
		// 생성된 객체의 주소 값 반환

		System.out.print("이름 : ");
		String empName = sc.nextLine();
		
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		
		System.out.print("직급 : ");
		String job = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		System.out.print("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();

		Employee ee = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);

		
		return ee; // 이걸 넣으니까 void에서 Employee로 바뀜 (프로세스 이해하기)
	}

	private void inputEmployee(Employee e2) {

		while (true) {
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.print("변경할 이름 : ");
				String newName = sc.nextLine();
				e.setEmpName(newName);
				break;
			case 2:
				System.out.print("변경할 급여 : ");
				int newSalary = sc.nextInt();
				e.setSalary(newSalary);
				break;
			case 3:
				System.out.print("변경할 부서 : ");
				String newDept = sc.nextLine();
				e.setDept(newDept);
				break;
			case 4:
				System.out.print("변경할 직급 : ");
				String newJob = sc.nextLine();
				e.setJob(newJob);
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

}
