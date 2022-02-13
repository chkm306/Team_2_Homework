package com.study.practice11.hw2.model.vo;

public class Point {
	private int x;
	private int y;

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String draw() {
		return "(x, y) : (" + x + ", " + y + ")";
	}

}
