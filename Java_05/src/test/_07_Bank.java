package test;

public class _07_Bank {

	// 멤버변수
		private String bankname;	// 은행명 - 신한은행	농협은행
		private String depositor;	// 예금주 - 본인
		private int balance;		// 잔고 - 10000		20000
		
		// 디폴트 생성자
		public _07_Bank() {}

		// 매개변수 생성자
		public _07_Bank(String bankname, String depositor, int balance) {
			this.bankname = bankname;
			this.depositor = depositor;
			this.balance = balance;
		}

		// 멤버 메서드(getter, setter)
		public String getBankname() {
			return bankname;
		}
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}

		public String getDepositor() {
			return depositor;
		}
		public void setDepositor(String depositor) {
			this.depositor = depositor;
		}

		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}

		// 멤버 메서드(printInfo)
		public void printInfo() {
			System.out.println("은행명 : " + bankname);
			System.out.println("예금주 : " + depositor);
			System.out.println("잔고 : " +balance);
		}

}
