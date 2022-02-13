package com.study.practice08.mvc.controller;

import com.study.practice08.mvc.model.vo.Member;

public class MemberController {
	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);

	public int login(String id, String pwd) {
		// 전달받은 id, pwd값과 mem의 memberId와 memberPwd 비교했을 때
		// 모두 같으면 1을 리턴
		// 아니면 0을 리턴

		int num = 0;

		/*if (mem.getMemberId().equals(id)) {
			if (mem.getMemberPwd().equals(pwd)) {
				num = 1;
			} else {
				num = 0;
			}
		} else {
			num = 0;
		}
		return num;*/
		// 위에꺼 함축버전

		if (mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
			return num = 1;
		} else {
			return num = 0;
		}
	}

	public Member readInfo() {
		// mem의 주소 값을 리턴
		return mem;
	}

	public int readAge() {
		// mem의 주민번호의 앞 2자리를 추출해서 출생년도를 알아낼 것
		// HINT : String클래스의 substring() 메소드, Integer클래스의 parseInt() 메소드 참고
		// 나이 = 올해년도 – 출생년도 + 1 ( 어떤 조건이 필요한지 생각해보시오 )
		// 구한 나이 값 리턴

		// substring : 문자열 자르기
		String num = mem.getCitizenNo().substring(0, 2);
		// System.out.println(num);

		// parseInt : 문자열을 숫자로 변환시키기
		int age = Integer.parseInt(num);
		// System.out.println(age);

		int age1 = 2022 - (1900 + age) + 1;
//		System.out.println(age1);

		return age1;
	}

	public void updateHeight(double height) {
		// 전달 받은 height값으로 mem의 height값 수정
		mem.setHeight(height);
	}

}
