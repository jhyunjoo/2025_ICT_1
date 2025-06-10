package ch07;

// 부모클래스
public abstract class _02_Car {
	
	// 추상메서드
	public abstract void drive();
	public abstract void stop();
	
	// 멤버메서드
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	
	/* 문법 : final 자료형 변수명;    예) final double PI = 3.14;
    *       1) 변수(상수) : 변수의 값 변경불가
    *      2) 메서드 : 재정의 불가	// p314
    *      3) 클래스 : 상속 불가
    */
	// 템플릿 메서드(=틀이 있는 메서드) : 자동차가 달리는 방법을 순서대로 구현
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
