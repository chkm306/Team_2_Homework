package com.study.practice01;

import java.util.Scanner;

public class Practice01 {
	Scanner sc = new Scanner(System.in);

	public void method1() {

		System.out.println("이름을 입력하세요 : ");
//		String name = sc.nextLine();
		String name = "아무개";
		
		System.out.println("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		sc.nextLine();
		int age = 20;
		
		System.out.println("성별을 입력하세요 : ");
//		char gender = sc.nextLine().charAt(0);
		char gender = '남';
		
		System.out.println("키를 입력하세요 : ");
//		double cm = sc.nextDouble();
		double cm = 180.5;
		
		System.out.printf("키 %.1f인 %d살 %s자 %s님 반갑습니다 ^^\n", cm, age, gender, name); // 소숫점 정리하기 %.nf n은 숫자

	}
	
	public void method2() {
		System.out.println("첫 번째 정수를 입력하세요 : "+"23");
		int num1 = 23;
		
		System.out.println("두 번째 정수를 입력하세요 : "+"7");
		int num2 = 7;
		
		System.out.println("더하기 결과 : " +(num1+num2));
		System.out.println("빼기 결과 : " +(num1-num2));
		System.out.println("곱하기 결과 : " +(num1*num2));
		System.out.println("나누기 결과 : " +(num1/num2));
	}
	
	public void method3() {
		System.out.println("가로 : ");
		double num1 = 13.5;
		
		System.out.println("세로 : ");
		double num2 = 41.7;
		
		System.out.println("면적 : "+(num1*num2));
		System.out.println("둘레 : "+(num1+num2)*2);
	}
	
	public void method4() {
		System.out.println("문자열을 입력하세요 : "+"apple");
		String str = "apple";
		
		System.out.println("첫 번째 문자 : "+str.charAt(0));
		System.out.println("두 번째 문자 : "+str.charAt(1));
		System.out.println("세 번째 문자 : "+str.charAt(2));
		System.out.println("네 번째 문자 : "+str.charAt(3));
		System.out.println("다섯 번째 문자 : "+str.charAt(4));
	}
	
	public void method5() {
		System.out.println("문자열을 입력하세요 : "+"A");
		char ch = 'A';
		
		System.out.println("A Unicode : "+(int)ch);
	}
	
	public void method6() {
		System.out.println("국어 : "+90.0);
		double kor = 90.0;
		
		System.out.println("영어 : "+90.0);
		double eng = 90.0;
		
		System.out.println("수학 : "+90.0);
		double math = 90.0;
		
		System.out.println("총점 : "+(int)(kor+eng+math));
		System.out.println("평균 : "+(int)(kor+eng+math)/3);
		
	}

	public void method7() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println( iNum1 % iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( (double)iNum1 /iNum2 ); // 2.5 2번 틀림 (하나만 형변환해도 가능)
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( iNum1/(int)fNum ); // 3 1번 틀림 float (int)
		System.out.println( iNum1/ fNum );// 3.3333333
		System.out.println( (double)iNum1 / fNum ); // 3.333333333333335 1번 틀림 (double)둘중 하나만 해도 길게 나옴
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( ch+iNum1 ); // 75 <- 자동형변환 가능
		System.out.println( (char)((int)ch+ iNum1) ); // 'K'
	}
}
