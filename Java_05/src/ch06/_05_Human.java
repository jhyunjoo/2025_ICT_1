package ch06;

// 자식클래스
public class _05_Human extends _05_Animal {
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("독서를 합니다.~~");
	}
}
