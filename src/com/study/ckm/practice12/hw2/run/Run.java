package com.study.practice12.hw2.run;

import com.study.practice12.hw2.model.vo.Animal;
import com.study.practice12.hw2.model.vo.Cat;
import com.study.practice12.hw2.model.vo.Dog;

public class Run {
	
	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		Animal[] ani = new Animal[5];
		
		ani[0] = new Dog("멍멍1", "멍멍1", 11);
		ani[1] = new Dog("멍멍2", "멍멍2", 22);
		ani[2] = new Dog("멍멍3", "멍멍3", 33);
		ani[3] = new Cat("냥냥1", "냥냥1", "냥냥1", "흰색");
		ani[4] = new Cat("냥냥2", "냥냥2", "냥냥2", "검은색");
		
		for (int i = 0; i < ani.length; i++) {
			ani[i].speak();
		}
	}

}