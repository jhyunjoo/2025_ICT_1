package test;

public class _16_BankMain {

	public static void main(String[] args) {
		_16_Bank park = _16_Bank.getInstance();
		_16_Bank yu = _16_Bank.getInstance();

		park.setClientName("박나래");
		park.setBankName("우리은행");
		park.setBalance(10000);
		System.out.println(park);
		
		System.out.println("--------------------------------");
		
		park.deposit(5000);
		park.withdraw(3000);
		park.makeInterest();
		System.out.println(park);
		
		System.out.println("--------------------------------");

		yu.setClientName("유느님");
		yu.setBankName("신한은행");
		yu.setBalance(20000);
		System.out.println(yu);
		
		yu.deposit(5000);
		yu.withdraw(3000);
		yu.makeInterest();
		System.out.println(yu);


	}

}
