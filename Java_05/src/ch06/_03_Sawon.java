package ch06;

// 자식클래스
public class _03_Sawon extends _03_Employee {
	
	// 멤버변수
	private int sudang;	// 수당

	// 디폴트 생성자
	public _03_Sawon() {
		System.out.println("<<< _03_Sawon 디폴트 생성자 >>>");
	}

	// 매개변수 생성자
	public _03_Sawon(String sabun, String name, String deptName, int salary,String tel, String address,int sudang) {
		// 부모 매개변수 생성자로 값 전달
		super(sabun, name, deptName,salary,tel,address);
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