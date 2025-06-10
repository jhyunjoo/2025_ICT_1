package test;

public class _09_Manager extends _09_Employee {

	// 멤버변수
	private int bonus;
	
	// 디폴트 생성자
	public _09_Manager() {}

	// 매개변수 생성자
	public _09_Manager(int bonus) {
		this.bonus = bonus;
	}

	// getter setter
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	// 출력
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("보너스 : " + bonus);
	}
}		
