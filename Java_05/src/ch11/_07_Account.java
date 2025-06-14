package ch11;

// 1. 계좌정보
public class _07_Account {

	// 멤버변수
	private String accountNo;	// 계좌번호	010-1111-2222	010-8888-9999
	private String ownerName;	// 예금주명	김태희			비
	private int balance;		// 잔액		2000000			1000000
	
	// 디폴트 생성자
	public _07_Account() {}
	
	// 매개변수 생성자
	public _07_Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 멤버메서드(getter, setter)
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	// 입금하다
	public int deposit(int amount) {
		// balance 구하기
		balance += amount;
		return amount;
	}
	
	// 출금하다
	public int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("출금금액이 잔액보다 많습니다. 다시 확인해주세요");
			return 0;
		}
		// balance 구해서 return
		balance -= amount;
		return 1;
	}
}
