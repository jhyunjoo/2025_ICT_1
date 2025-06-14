package test;

public class _16_Bank {
	
	private static _16_Bank bank = new _16_Bank();

	private String clientName;	// 고객명	 박나래	유느님
	private String bankName;	// 은행명	우리은행	신한은행
	private int balance;		// 잔고	10000	20000

	// 싱글톤 적용해서 Bank 클래스에접근
	// 디폴트 생성자 + setter로 값 전달
	private _16_Bank() {}

	public static _16_Bank getInstance() {
		if (bank == null) {
			bank = new _16_Bank();
		}
		return bank;
	}

	// getter setter
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 메서드
	public void deposit(int money) {		// 5000
		System.out.println(balance + "를 입금하다");
		balance += money;
		System.out.println("잔고 : " + balance);
	}

	public void withdraw(int money) {		// 3000
		System.out.println(money + "를 출금하다");
		balance -= money;
		System.out.println("잔고 : " + balance);
 	}

	public void makeInterest() {		// 잔고의 2%
		System.out.println("이자 : " + balance*0.02);
		balance = balance + (int)(balance * 0.02);
		System.out.println("잔고 : " + balance);
	}

	@Override
	public String toString() {
		return "고객명 : " + clientName + " | 은행명 : " + bankName + " | 잔고 : " + balance;
	}

}