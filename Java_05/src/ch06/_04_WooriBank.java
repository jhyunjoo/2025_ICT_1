package ch06;

public class _04_WooriBank extends _04_Bank {
	
	// 멤버변수
	private String vipMember;	// vip
	
	// 디폴트 생성자
	public _04_WooriBank() {}
	
	// 매개변수 생성자
	public _04_WooriBank(String bankname, String accountNumber, double rate, String vipMember) {
		super(bankname,accountNumber,rate);
		this.vipMember = vipMember;
	}
	
	// getter setter
	public String getVipMember() {
		return vipMember;
	}
	public void setVipMember(String vipMember) {
		this.vipMember = vipMember;
	}
	
	// 멤버메서드
	public void makeWoooriProduct() {
		System.out.println("이율 높은 상품 출시");
	}
	
	// 출력
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("vip : " + vipMember);
	}
}
