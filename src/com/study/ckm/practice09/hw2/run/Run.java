package com.study.practice09.hw2.run;

import com.study.practice09.hw2.controller.NonStaticSample;

public class Run {
	public static void main(String[] args) {
		
		NonStaticSample nss = new NonStaticSample();
		// 입력문scanner 써도 ㄱㅊ할듯
		int[] arr = nss.intArrayAllocation(5);
		
		System.out.printf("크기가 %d인 배열의 랜덤값 : ", 5);
		nss.display(arr);
		
		System.out.print("내림차순 출력 : ");
		nss.sortDescending(arr);
		
		System.out.print("오름차순 출력 : ");
		nss.sortAscending(arr);
		
		System.out.print("applephone 문자열에 p의 갯수 : ");
		System.out.println(nss.countChar("applephone", 'p'));
//		nss.countChar("applephone", 'p');
		
		System.out.print("13과 7사이 정수들의 합계 : ");
		System.out.println(nss.totalValue(13, 7));
		
		System.out.print("programming 문자열의 3번 인덱스 문자 : ");
		System.out.println(nss.pCharAt("programming", 3));
		
		System.out.print("JAVA와 programming을 합친 문자열 : ");
		System.out.println(nss.pConcat("JAVA", "programming"));
	}
}
