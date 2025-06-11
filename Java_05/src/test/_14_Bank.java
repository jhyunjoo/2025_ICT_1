package test;

public class _14_Bank {
	
	// 멤버변수 => value
	private int accountNo;		// 계좌번호	222		333		444		555		=> key
	private String bankName;	// 은행명	우리은행	국민은행	기업은행	산업은행
	private String depositor;	// 예금주	김훈		김승호	김영하	양귀자
	private int balance;		// 잔고	16000	16020	10000	11700

	// 디폴트 생성자
	public _14_Bank() {}

	// 매개변수 생성자
	public _14_Bank(int accountNo, String bankName, String depositor, int balance) {
		this.accountNo = accountNo;
		this.bankName = bankName;
		this.depositor = depositor;
		this.balance = balance;
	}	

	// getter, setter, toString
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getDepositor() {
		return depositor;
	}
	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	public int getbalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "계좌번호 : " + accountNo + " | 은행명 : " + bankName + " | 예금주 : " + depositor + " | 잔고 : " + balance;
	}


}
