package com.javaex.ex03;

public class Sparrow implements Soundable {
	@Override // 오버라이드 안해도 작동 되지만 필요할 수도..?
	public String sound() {
		return "짹짹";
	}
}
