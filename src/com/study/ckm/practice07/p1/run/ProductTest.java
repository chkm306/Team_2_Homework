package com.study.practice07.p1.run;

import com.study.practice07.p1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		// 1. 클래스 생성
		Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		// 매개변수 생성자를 이용하여 3개의 객체 생성 (위의 사용데이터 참고)
		// 객체가 가진 필드 값 출력 확인
		// p1.information(); <<<< 출력문이 없음
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
		// 객체가 가진 필드 값 출력 확인
		// setter 메소드를 이용해 가격 변경
		int i1 = 1200000;
		double i2 = 0.05;
		
		p1.setPrice(i1);
		p2.setPrice(i1);
		p3.setPrice(i1);
		p1.setTax(i2);
		p2.setTax(i2);
		p3.setTax(i2);
		
		System.out.println("====================================================");
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// 실제가격 = 가격 + (가격 * 부가세율)
//		int i = 1200000 + (1200000*0.05);
//		p1.setPrice(i);
		int i = i1 + (int)(i1*i2);
		p1.setPrice(i);
		p2.setPrice(i);
		p3.setPrice(i);
//		System.out.println(p1.information());
		System.out.println("상품명 = "+p1.getProductName());
		System.out.println("부가세 포함 가격 : "+p1.getPrice());
		
		System.out.println("상품명 = "+p2.getProductName());
		System.out.println("부가세 포함 가격 : "+p2.getPrice());
		
		System.out.println("상품명 = "+p3.getProductName());
		System.out.println("부가세 포함 가격 : "+p3.getPrice());
		
		// for문으로 해보기
	}

}
