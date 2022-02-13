package com.study.practice11.hw2.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public String draw() {
		return super.draw() + " 면적 : " + width*height + ", 둘레 : " + 2*(height+width);
	}
	
	
}
