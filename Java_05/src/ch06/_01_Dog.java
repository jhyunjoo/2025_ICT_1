package ch06;

// 자식 클래스
public class _01_Dog extends _01_Animal {

	// 멤버변수
	private String stroll;	// 산책 => 고유한 특징
	
	// 생성자
	public _01_Dog() {
		System.out.println("<<< _01_Dog 자식 클래스 >>>");
	}
	
	// 멤버메서드
	public void bark() {
		System.out.println("멍멍믕먕먕므웅명먕므르르멍멍먕먕믕먕");
	}
		
	// getter setter
	public String getStroll() {
		return stroll;
	}
	public void setStroll(String stroll) {
		this.stroll = stroll;
	}
	
	// 멤버변수 정보 출력
	// @Override - 재정의 => 자식 메서드가 호출
	@Override
	public void printInfo() {
		// 부모.printInfo() 호출
		super.printInfo();
		System.out.println("산책 : " + stroll);
	}
	
}
