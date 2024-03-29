package com.javaex.ex02;

public class Duck extends Bird {
	
	public void Bird(String name) {
		// 이미 부모클래스에서 필드들을 다 상속 받았기 때문에 추가할게 있는게 아니라면 필드는 쓸 필요 없즁
	}

	@Override
    public void sing() {
    	System.out.printf("오리 (%s) 소리내서 웁니다.%n", getName()); // -> Bird class 에 getName이 protected이기 때문에 그냥 접근 가능
    															 //	private일 경우에 슈퍼로 참조
    }
	@Override
    public void fly() {
    	System.out.printf("오리 (%s) 가 날지 않습니다.%n", super.getName());
    }
	@Override
    public void showName() {
    	System.out.printf("오리의 이름은 %s 입니다.%n", super.getName());
    }

}
