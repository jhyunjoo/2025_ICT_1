package test;

public class _10_WooriBank extends _10_Bank {
	
	// 멤버변수
	private String vipMember;

	// 디폴트 생성자
	public _10_WooriBank() {}

	// 매개변수 생성자
	public _10_WooriBank(String bankname, String accountNumber, double rate, String vipMember) {
		super(bankname, accountNumber, rate);
		this.vipMember = vipMember;
	}

	// getter setter
	public String getVipMember() {
		return vipMember;
	}	
	public void setVipMember(String vipMember) {
		this.vipMember = vipMember;
	}

	public void makeWooriProduct() {
		System.out.println("이율 높은 상품 출시");
	}

	// 출력
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("vip : " + vipMember);
	}
}
