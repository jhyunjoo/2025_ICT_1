package test;

public class _08_Person {
	// 멤버변수
	private String kind;	// 사람 - 매개변수 생성자로 전달

	// 디폴트 생성자
	public _08_Person() {}
	
	// 매개변수 생성자
	public _08_Person(String kind) {
		this.kind = kind;
	}

	// 멤버메서드
	public void move() {
		System.out.println(kind + "이 움직입니다.");
	}

	public void readBook() {
		System.out.println(kind+ "이 독서를 합니다.");
	}

	public void sleep() {
		System.out.println(kind + "이 잠을 잡니다.");
	}
}
