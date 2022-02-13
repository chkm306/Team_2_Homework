package com.study.practice09.hw3.run;

import com.study.practice09.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {

		// StaticSample 클래스 변수인 value를 “Java”로 초기화 후 출력
		// toUpper 메소드 실행을 통해 대문자로 변경 후 출력
		// valueLength 메소드 실행을 통해 길이 출력
		// valueConcat 메소드 실행을 통해 “PROGRAMMING” 문자열 합친 후 출력
		// setChar 메소드 실행을 통해 “J”를 “C”로 변경 후 출력
		// * 각 메소드에서 출력문은 존재하지 않는다. 테스트 출력은 main 함수에서 value에 접근하여 출력
		
		StaticSample ss = new StaticSample();
		
		ss.setValue("Java");
		System.out.println("value : "+ss.getValue());
		
		StaticSample.toUpper();
		System.out.println("대문자로 : "+ss.getValue());
		
		System.out.println("길이 : "+ss.valueLength());
		
		System.out.println("PROGRAMMING 붙여서 : "+ss.valueConcat("PROGRAMMING"));

		ss.setChar(0, 'C');
		System.out.println("J > C : "+ss.getValue());
	}

}
