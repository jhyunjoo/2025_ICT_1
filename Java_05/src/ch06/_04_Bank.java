package ch06;

public class _04_Bank {
	
	// 멤버변수
	private String bankname;		// 은행명
	private String accountNumber;	// 계좌번호
	private double rate;			// 이율

	// 디폴트 생성자
	public _04_Bank() {}
	
	// 매개변수 생성자
	public _04_Bank(String bankname, String accountNumber, double rate) {
		this.bankname = bankname;
		this.accountNumber = accountNumber;
		this.rate = rate;
	}
	
	// getter setter
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	// 출력
	public void printInfo() {
		System.out.println("은행명 : " + bankname);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("이율 : " + rate );
	}
}
