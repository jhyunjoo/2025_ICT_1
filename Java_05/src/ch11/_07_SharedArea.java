package ch11;

// 2. 공유영역 - 계좌이체, 잔액합계
public class _07_SharedArea {
	
	// 멤버변수
	_07_Account account1;	// 김태희 계좌
	_07_Account account2;	// 비 계좌
	
	// 디폴트 생성자
	public _07_SharedArea() {}
	
	// 매개변수 생성자
	public _07_SharedArea(_07_Account account1, _07_Account account2) {	// 주소값 전달
		this.account1 = account1;
		this.account2 = account2;
	}
	
	// 계좌이체를 하다(3-1 스레드에서 호출 예정)
	void transfer(int amount) {
		// 출금하다 호출 .. withdraw() 호출 후 출력
		if (account1.withdraw(amount) == 0) {}
		else {
			System.out.println(account1.getOwnerName() + "계좌 : "  + amount + "인출");
			
			// 입금하다 호출 ..deposit() 호출 후 출력
			account2.deposit(amount);
			System.out.println(account2.getOwnerName() +" 계좌 : " + amount + "입금");
		}
	}
	
	// 잔액합계를 구하다(3-2 스레드에서 호출 예정)
	int getBalanceTotal() {
		return account1.getBalance() + account2.getBalance();	// 각 잔액 합계
	}

}
