package com.study.practice12.hw1.run;

import com.study.practice12.hw1.model.vo.GalaxyNote9;
import com.study.practice12.hw1.model.vo.SmartPhone;
import com.study.practice12.hw1.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		// 2개의 객체를 저장할 수 있는 객체배열 생성 (SmartPhone타입)
		SmartPhone[] phone = new SmartPhone[2];

		// 각각의 인덱스에 GalaxyNote9, V40 객체 생 성 기 본생성자 이 용 ----> 다 형성
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		// for 문을 이용하여 p hone 객체배열에 모든 인덱스를 참조
		// for( 초기식 ; 조건식 ; 증감식) {
		// printMaker() 호출
		// makeaCall() 호출
		// takeaCall() 호출
		// touch() 호출
		// charge() 호출
		// picture() 호출
//		System.out.println(); // 한 줄 띄기
		
		for(int i=0; i<phone.length ; i++) {
			phone[i].printMaker();
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();		
			System.out.println(); // 한 줄 띄기
		}
	}

}
