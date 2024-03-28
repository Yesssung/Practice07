package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape("빨강"); // 추상 메소드는 직접 객체화 안됌
		Circle c1 = new Circle("녹색", 10);
	
		Ractangle r1 = new Ractangle("빨강", 12, 10);
		r1.draw();
		
		Shape sr1 = new Ractangle("빨강", 4, 4);
	


	}
}

	
	