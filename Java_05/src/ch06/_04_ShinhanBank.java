package ch06;

public class _04_ShinhanBank extends _04_Bank {

	// 멤버변수
	private String event;	// 금리인하
	
	// 디폴트 생성자
	public _04_ShinhanBank() {}
	
	// 매개변수 생성자
	public _04_ShinhanBank(String bankname, String accountNumber, double rate, String event) {
		super(bankname, accountNumber,rate);
		this.event = event;
	}
	
	// getter setter
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	
	// 멤버메서드
	public void ExecuteLoan() {
		System.out.println("신한은행 대출");
	}
	
	// 출력
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("금리인하 : " + event);
	}
}
