package com.study.practice10.mvc.view;

import java.util.Scanner;

import com.study.practice10.mvc.controller.MemberController;
import com.study.practice10.mvc.model.vo.Member;

public class MemberMenu {
	// MemberController 클래스 접근을 위해 필드로 선언
	
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in); // 키보드로 입력 받기 위해서

	public void mainMenu() {
		while (true) {
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

	public void insertMember() {
		// 1. 현재 회원 수(memberCount)가 최대 회원 수(SIZE)를 넘어설 경우 return 처리
		// MemberController의 getMemberCount() 메소드를 통해 현재 회원 수 알아오고
		// 최대 회원 수는 상수필드여서 클래스명. 으로 직접 접근 가능

		if (mc.getMemberCount() > MemberController.SIZE) { // mc.SIZE로 했더니 오류 클래스명 입력
			return;

			// 2. 아이디를 입력 받아 MemberController의 checkId() 메소드로 전달 >> 결과 값 받기
			// (아이디 중복 체크하는 과정)
		} else {
			System.out.println("아이디를 입력해주세요 : ");
			String userId = sc.nextLine();

			if (mc.checkId(userId) != null) {
				// 2_1. 결과 값이 null이 아닌 경우 즉, 동일한 아이디가 존재하는 경우
				// “동일한 아이디가 존재합니다. 회원등록 실패” 출력
				System.out.println("동일한 아이디가 존재합니다. 회원 등록 실패.");
			} else {
				// 2_2. 결과 값이 null인 경우 즉, 동일한 아이디가 존재하지 않는 경우
				// 나머지 회원 정보 입력 받도록 (비밀번호, 이름, 나이, 성별, 이메일)
				

				System.out.println("비밀번호를 입력해주세요 : ");
				String userPwd = sc.nextLine();

				System.out.println("이름을 입력해주세요 : ");
				String userName = sc.nextLine();

				System.out.println("나이를 입력해주세요: ");
				int userAge = sc.nextInt();

				System.out.println("성별을 입력해주세요: ");
				char userGender = sc.next().charAt(0);
				sc.nextLine(); // 버퍼에 엔터빼주기

				System.out.println("이메일을 입력해주세요: ");
				String userEmail = sc.nextLine();

				// 입력 받은 정보를 Member의 매개변수 생성자를 이용하여 객체 생성 후
				// MemberController의 insertMember() 메소드로 전달
				// “성공적으로 회원 등록이 되었습니다.” 출력
				Member mem = new Member(userId, userPwd, userName, userAge, userGender, userEmail);
				mc.insertMember(mem);
				System.out.println("성공적으로 회원 등록이 되었습니다.");
			}
		}
	}

	public void searchMember() {
		while (true) {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			String search = sc.nextLine();
			
			if (menu == 9) {
				return;
			}

			// 1. MemberController의 searchMember() 메소드로 menu와 search 문자열 전달 >> 결과 값
			Member mem = mc.searchMember(menu, search);

			// 1_1. 결과 값이 null인 경우 즉, 검색 결과가 없는 경우 >> “검색된 결과가 없습니다.” 출력
			if (mem == null) {
				System.out.println("검색된 결과가 없습니다");
				
				// 1_2. 결과 값이 null이 아닌 경우 즉, 검색 결과가 존재하는 경우 >> 회원 정보 출력
			} else {
				System.out.println(mem.information());
			}
		}
	}

	public void updateMember() {
		System.out.println("====== 회원 정보 수정 ===== ");
		System.out.println("1. 비밀번호 수정");
		System.out.println("2. 이름 수정");
		System.out.println("3. 이메일 수정");
		System.out.println("9. 이전 메뉴로");

		System.out.print("메뉴 선택 : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num == 9) {
			return;
		}
		
		// 1. MemberController의 checkId()로 userId 전달 >> 결과 값 (m : Member)
		// 1_2. 결과 값이 null인경우 >> “변경할 회원이 존재하지 않습니다” 출력
		// 1_2. 결과 값이 null이 아닌 경우 기존 정보 출력 후
		// 변경내용(update : String) 입력 받고
		// MemberController의 updateMember()에 m, menu, update 전달
		// “회원의 정보가 변경되었습니다.” 출력
		
		System.out.print("변경할 회원 아이디 : ");
		String userId = sc.nextLine();

		Member m = mc.checkId(userId);

		if (m == null) {
			System.out.println("변경할 회원이 존재하지 않습니다.");
		} else {
			System.out.println("기존 정보");
			System.out.println(m.information());

			System.out.print("변경 내용 : ");
			String update = sc.nextLine();

			mc.updateMember(m, num, update);
			System.out.println("회원의 정보가 변경되었습니다.");

			System.out.println("변경 정보 : ");
			System.out.println(m.information());

		}
	}

	public void deleteMember() {

		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();

		// 1. MemberController의 checkId()에 userId 전달 >> 결과 값 (m : Member)
		Member m = mc.checkId(userId);

		// 1_1. 결과 값이 null인 경우 “삭제할 회원이 존재하지 않습니다.” 출력
		if (m == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");

			// 1_2. 결과 값이 null이 아닌 경우 기존 정보 출력
			// “정말 삭제하시겠습니까? (y/n) : “ >> 키보드로 입력 받기
			// 대소문자 구분 없이 ‘Y’인 경우 MemberController의 deleteMember()에 userId 전달
			// “회원의 정보가 삭제되었습니다.” 출력
		} else {
			System.out.println("기존 정보");
			System.out.println(m.information());
			System.out.print("정말 삭제하시겠습니까?(y / n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if (ch == 'Y') {
				mc.deleteMember(userId);
				System.out.println("회원의 정보가 삭제되었습니다.");
			}
		}
	}

	public void printAllMember() {
		// MemberController의 getMem() 메소드 호출 >> 결과 값 (mem : Member[])
		// 반복문을 통해 결과 값 안의 존재하는 회원들 정보 출력

		Member[] mem = mc.getMem();

		for (int i = 0; i < mc.getMemberCount(); i++) {
			System.out.println(mem[i].information());
		}
	}

	public void sortMember() {
		Member[] sortMem = null; // 정렬 결과를 받아 줄 객체배열 초기화

		while (true) {
			System.out.println("====== 회원 정보 정렬 ===== ");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬 (남여순)");
			System.out.println("9. 이전 메뉴로");

			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			case 9:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}
			for (int i = 0; i < sortMem.length; i++) {
				
				if (sortMem[i] != null) {
					System.out.println(sortMem[i].information());
				}
			}
		}

	}
}
