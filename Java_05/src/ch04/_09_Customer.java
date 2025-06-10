package ch04;

// 핸드폰 구매 고객 클래스
public class _09_Customer {
	
	// 멤버변수
	private String name;	// 고객명 : 지현주
	private double budget;	// 예산 : 1000000

	// 디폴트 생성자
	public _09_Customer() {}
	
	// 매개변수 생성자
	public _09_Customer(String name, double budget) {
		this.name = name;
		this.budget = budget;
	}
	
	// 멤버메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	public void buyPhone(_09_PhoneStore store) {
		// 구입 완료 출력
		_09_Phone phone =store.sellPhone("아이폰",budget);
		if(phone != null) {
			System.out.println("고객 : 핸드폰 구입이 완료되었습니다.");
		} else {
			System.out.println("고객 : 핸드폰을 구입하지 못했습니다.");
		}
	}
	
	// printInfo()
	public void printInfo() {
		System.out.println("고객명 : " + name);
		System.out.println("예산 : " + budget);
	}

}
