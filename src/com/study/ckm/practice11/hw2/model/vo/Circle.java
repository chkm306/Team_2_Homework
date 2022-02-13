package com.study.practice11.hw2.model.vo;

public class Circle extends Point{
	private int radius;
	public Circle() {
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public String totring() {
		return super.draw() + " 면적 : "+ Math.ceil(Math.PI * radius * radius) +", 둘레 : "+Math.ceil(Math.PI * 2 * radius);
//		super.draw();
//		System.out.printf("면적 : %2.f\n", Math.PI * radius * radius);
//		System.out.printf("둘레 : %2.f\n", Math.PI * 2 * radius);
	}
}
