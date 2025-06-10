package ch06;

// 자식클래스
public class _03_Manager extends _03_Employee {

	// 멤버변수
	private int bonus;
	
	// 디폴트 생성자
	public _03_Manager() {
		super();	// 부모의 디폴트 생성자 호출, 생략시 컴파일러가 자동 추가
		System.out.println("<<< _03_Manager 디폴트 생성자 >>>");
	}

	// 매개변수 생성자
//	public _03_Manager(int bonus) {
//		this.bonus = bonus;
//	}

	// getter setter
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	// 출력
	// 부모 메서드를 재정의해서 출력 => main에서 호출시 자식메서드가 호출된다.
	@Override		
	public void printInfo() {
		super.printInfo();		// super는 부모참조변수
		System.out.println("보너스 : " + bonus);
	}
	
}		
