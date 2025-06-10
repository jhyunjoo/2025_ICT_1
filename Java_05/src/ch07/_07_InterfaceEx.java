package ch07;

public class _07_InterfaceEx {

	public static void main(String[] args) {
		// 부모클래스의 autoPlay() 호출
		A07 a07 = new A07();
		a07.autoPlay(new B07());
		a07.autoPlay(new C07());
	}
	
}

// 부모 클래스
class A07 {
	public void autoPlay(I07 i07) {	// 매개변수 다형성 적용
		i07.play();		// 추상메서드 호출 => 자식클래스의 재정의된 자식메서드 호출
	}
}
// 인터페이스
interface I07 {
	public void play();	// 추상메서드
}

// 자식 클래스 - I07 인터페이스 구현
class B07 implements I07 {
	@Override
	public void play() {
		System.out.println("B07 클래스 - play()");
	}
}

// 자식클래스 - I07 인터페이스 구현
class C07 implements I07 {
	@Override
	public void play() {
		System.out.println("C07 클래스 - play()");
	}
}