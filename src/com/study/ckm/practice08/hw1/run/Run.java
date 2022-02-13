package com.study.practice08.hw1.run;

import com.study.practice08.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();
		
		nss.printLottoNumbers();
		
		nss.outputChar(10, 'c');
		
		System.out.println("랜덤 영문자 출력 : "+nss.alphabette());
		
		System.out.println(nss.mySubstring("apple", 2, 4));

}}
