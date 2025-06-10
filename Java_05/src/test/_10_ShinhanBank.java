package test;

public class _10_ShinhanBank extends _10_Bank {
	
	// 멤버변수
	private String event;

	// 디폴트 생성자
	public _10_ShinhanBank() {}

	// 매개변수 생성자
	public _10_ShinhanBank(String bankname, String accountNumber, double rate, String event) {
		super(bankname, accountNumber, rate);
		this.event = event;
	}

	// getter setter
	public String getEvnet() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public void executeLoan() {
		System.out.println("신한은행 대출");
	}

	// 출력
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("이벤트 : " + event);
	}
}
