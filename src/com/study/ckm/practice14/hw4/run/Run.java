package com.study.practice14.hw4.run;

import com.study.practice14.hw4.controller.EmpTest;

public class Run {

	public static void main(String[] args) {
		EmpTest et = new EmpTest();
		// setEmp()를 실행 해 기존 사원들 등록 및 입력을 통한 사원 한명 정보 등록
		// printEmp()를 실행 해 사원들 출력
		
		System.out.println("------------------------정렬 이전------------------------");
		et.setEmp();
		et.printEmp();
		
		// nameSortPrint()를 통해 사원들의 이름을 오름차순으로 출력
		// printEmp()를 실행 해 사원들 출력
		System.out.println("------------------------정렬 이후------------------------");
		et.nameSortPrint();
		et.printEmp();
		
	}

}
