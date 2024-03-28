package com.javaex.ex02;

public abstract class Bird {
    private String name;
    
    public Bird() {
    	
    }
    public Bird(String name) {
    	this.setName(name);
    }

    // 추상 메소드 선언만
    public void fly() {
    	
    }

    public void sing() {
    	
    }
    
    public void showName() {
    	
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
