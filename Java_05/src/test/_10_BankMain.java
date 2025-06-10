package test;

public class _10_BankMain {

	public static void main(String[] args) {
		_10_Bank shin = new _10_ShinhanBank("신한은행", "110-469-544324",0.3,"금리인하");
		//_10_Bank woo = new _10_WooriBank("우리은행", "016-423-647752",0.4,"vip");
		
		callBank(shin);
		System.out.println();
		//callBank(woo);
		//callBank(new _10_WooriBank("우리은행", "016-423-647752",0.4,"vip"));
		//System.out.println();
		
		_10_Bank woori = new _10_WooriBank();
		woori.setBankname("우리은행");
		woori.setAccountNumber("016-423-647752");
		woori.setRate(0.5);
		
		callBank(woori);
		System.out.println();
		
		_10_WooriBank woori2 = (_10_WooriBank) woori;
		woori2.setVipMember("vip");
		
		callBank(woori);
		System.out.println();
		callBank(woori2);
		
	}

	public static void callBank(_10_Bank bank) {	// 매개변수에 다형성 적용
		bank.printInfo();		// 자식클래스가 재정의했으므로 자식메서드 호출

		if(bank instanceof _10_ShinhanBank) {
			_10_ShinhanBank shin = (_10_ShinhanBank)bank;	// 다운캐스팅
			shin.executeLoan();
		} else if(bank instanceof _10_WooriBank) {
			_10_WooriBank woo = (_10_WooriBank)bank;		// 다운캐스팅
			woo.makeWooriProduct();
		} else {

		}
	}

}
