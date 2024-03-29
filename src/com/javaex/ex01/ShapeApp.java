package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape("빨강"); // 추상 메소드는 직접 객체화 안됌
		Circle c1 = new Circle("녹색", 10);
	
		Ractangle r1 = new Ractangle("빨강", 12, 10);
		
		Shape sr1 = new Ractangle("빨강", 12, 10);
		// Shape는 가로 길이가 없기 때문에 Ractangle로 다운캐스팅 해야 한다.
		// 다운캐스팅 연습!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		sr1.draw();
		// Shape의 가로크기 출력
		int sr1Width = ((Ractangle)sr1).getWidth();
		System.out.println("sr1의 가로는 " + sr1Width + "입니다.");
		
	}
}

	
	