package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
//	@Override
//	public void draw() {
//		System.out.println("[원]#면색:" +super.fillColor+ 
//				"  #넓이:" + width + " #높이:" + height + " 그렸습니다.");  
//	}
	
	@Override
	public void draw(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + " 그렸습니다.");                                                                        
	}
		

}


