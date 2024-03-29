package com.javaex.ex02;

public abstract class Bird {
    private String name;
    // 생성자는 필요없남?!
//    public Bird() {
//    	
//    }
//    public Bird(String name) {
//    	this.setName(name);
//    }

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

    // 추상 메소드 선언만
    public abstract void fly();

    public abstract void sing(); 
    
    public abstract void showName();


}
