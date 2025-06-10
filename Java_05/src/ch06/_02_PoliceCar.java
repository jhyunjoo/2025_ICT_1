package ch06;

// 자식클래스
public class _02_PoliceCar extends _02_Car {
	
	// 디폴트 생성자
	public _02_PoliceCar() {
		System.out.println("<<< _02_PoliceCar 디폴트 생성자 >>>");
	}
	
	// 멤버메서드
	public void siren() {
		System.out.println("사이렌을 울리다.~~");
	}

}
