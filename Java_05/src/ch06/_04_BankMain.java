package ch06;

public class _04_BankMain {
	
	public static void main(String[] args) {
		
		// shinhan : 디폴트 생성자 + setter,getter
		System.out.println("<< shinhan 정보 >>");
		System.out.println("방법1. 디폴트 생성자 + setter로 값 전달");
		_04_ShinhanBank shinhan = new _04_ShinhanBank();
		shinhan.setBankname("신한인행");
		shinhan.setAccountNumber("110-469-544324");
		shinhan.setRate(0.4);
		shinhan.setEvent("금리인하");
		shinhan.printInfo();
		shinhan.ExecuteLoan();
		
		System.out.println();
		
		// woori : 매개변수 생성자
		System.out.println("<< woori 정보 >>");
		System.out.println("방법2. 매개변수 생성자로 값 전달");
		_04_WooriBank woori = new _04_WooriBank("우리은행","110-531-693215",0.5,"vip");
		woori.printInfo();
		woori.makeWoooriProduct();
		
	}

}
