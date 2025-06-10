package test;

public class _07_BankMain {
	public static void main(String[] args) {
		
		// 방법1. 디폴트 생성자 + setter로 값 전달
		_07_Bank bank = new _07_Bank();

		bank.setBankname("신한은행");
		bank.setDepositor("지현주");
		bank.setBalance(10000);

		// printlnfo() 로 값 출력
		bank.printInfo();

		System.out.println();

		// 방법2. 매개변수 생성자로 값 전달 
		_07_Bank bank2 = new _07_Bank("농협은행","hyunjoo",20000);

		// getter로 값 출력
		System.out.println("은행 : " + bank2.getBankname());
		System.out.println("예금주 : " + bank2.getDepositor());
		System.out.println("잔고 : " + bank2.getBalance());

	}

}
