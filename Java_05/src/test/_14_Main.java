package test;

public class _14_Main {
	
	public static void main(String[] args) {
		
		_14_BankHashMap bankMap = new _14_BankHashMap();

		// 매개변수 생성자로 값 전달
		_14_Bank woo = new _14_Bank(222,"우리은행","김훈",16000);
		_14_Bank min = new _14_Bank(333,"국민은행","김승호",16020);
		_14_Bank ki = new _14_Bank(444,"기업은행","김영하",10000);
		_14_Bank san = new _14_Bank(555,"산업은행","양귀자",11700);

		// bank 추가후 출력
		
		bankMap.insertBank(woo);
		bankMap.insertBank(min);
		bankMap.insertBank(ki);
		bankMap.insertBank(san);
		
		bankMap.queryBank();

		System.out.println();
		
		// 444번 삭제후 출력
		System.out.println("<<< 444 삭제 >>>");
		bankMap.deleteBank(444);
		bankMap.queryBank();
	}

}
