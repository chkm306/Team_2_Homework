package com.study.practice11.hw2.run;

import com.study.practice11.hw2.model.vo.Circle;
import com.study.practice11.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		// 위의 사용 데이터를 참고하여 각각 초기화
		
		Circle[] c = new Circle[2];
		
		c[0] = new Circle(1, 2, 3);
		c[1] = new Circle(3, 3, 4);
		
		Rectangle[] r = new Rectangle[2];
		
		r[0] = new Rectangle(-1, -2, 5, 2);
		r[1] = new Rectangle(-2, 5, 2, 8);
		
		// 각 도형의 draw 메소드 실행 --> 향상된 for문 이용해서
		System.out.println("===== circle =====");
		for(Circle ci: c) {
			System.out.println(ci.draw());
		}
		
		System.out.println("===== Rectangle =====");
		for(Rectangle re: r) {
			System.out.println(re.draw());
		}
		
	}

}
