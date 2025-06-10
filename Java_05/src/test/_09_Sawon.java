package test;

public class _09_Sawon extends _09_Employee {
	
	// 멤버변수
	private int sudang;	// 수당

	// 디폴트 생성자
	public _09_Sawon() {}

	// 매개변수 생성자
	public _09_Sawon(int sudang) {
		this.sudang = sudang;
	}

	// getter setter
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	// 출력
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("수당 : " + sudang);
	}
}