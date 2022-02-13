package com.study.practice11.mvc.view;

import java.util.Scanner;

import com.study.practice11.mvc.controller.LibraryManager;
import com.study.practice11.mvc.model.vo.Book;
import com.study.practice11.mvc.model.vo.Member;

public class LibraryMenu {

	private LibraryManager lmg = new LibraryManager();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		// LibraryManager의 insertMember() 메소드에 전달
		System.out.println("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(m/f) : ");
		char gender = sc.nextLine().charAt(0);
		
		Member m = new Member(name, age, gender);
		lmg.insertMember(m);

		while (true) {
			System.out.println("======= 메뉴 ======");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println(lmg.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다. ");
				return;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}

	private void selectAll() {
		// LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기

		Book[] bList = lmg.selectAll();

		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력  대여할 때 도서번호를 알기 위해
		// ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true

		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i].toString());
		}
	}

	public void searchBook() {

		// “검색할 제목 키워드 : “
		// >> 입력 받음 (keyword : String)
		// LibraryManager의 searchBook() 메소드에 전달 // 그 결과 값을 Book[] 자료형으로 받기
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();

		Book[] searchList = lmg.searchBook(keyword);

		// for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력 // NullPointerException 발생 시 오류
		// 해결하시오 ㅎㅎ

		for (Book bk : searchList) {
			System.out.println(bk);
		}
		
//		int count = 0;
//		for(Book bk : searchList) {
//			if(bk != null) {
//				System.out.println(bk);
//				count++;	// 존재할 경우 count 1증가
//			}
//		}
//		
//		if(count == 0) {
//			System.out.println("검색 결과가 없습니다.");
//		}

	}

	public void rentBook() {
		// 도서 대여를 위해 도서번호를 알아야 된다.
		//  selectAll() 메소드 호출을 통해 도서 리스트 한번 출력 해주고
		selectAll();

		// “대여할 도서 번호 선택 : ”
		// >> 입력 받음 (num : int)
		// LibraryManager의 rentBook(num) 메소드에 전달
		System.out.print("대여 할 도서 선택 : ");
		int num = sc.nextInt();

		int result = lmg.rentBook(num);

		// 그 결과 값을 result로 받고 그 result가
		// 0일 경우  “성공적으로 대여되었습니다.” 출력
		// 1일 경우  “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우  “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
		// 마이페이지를 통해 확인하세요” 출력

		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능 입니다.");
		} else if (result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
			System.out.println("마이페이지를 통해 확인하세요.");
		}
	}
}
