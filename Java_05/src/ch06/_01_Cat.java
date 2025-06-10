package ch06;

// 자식 클래스
public class _01_Cat extends _01_Animal{
	
	// 멤버변수
	private String cute;	// 애교 : 유	=> 고유한 특징
	
	// 생성자
	public _01_Cat() {
		super();	// 부모의 디폴트 생성자 호출
					// 생략해도 컴파일러가 자동으로 호출함
		System.out.println("<<< _01_Cat 자식클래스 >>>");
	}
	
	// 멤버메서드
	public void cry() {
		System.out.println("냥냐옹그르르녕냥눙냥뇽냐아뉴우늉냥냐");
	}
	
	// getter setter
	public String getCute() {
		return cute;
	}
	public void setCute(String cute) {
		this.cute = cute;
	}

	// 멤버변수 정보 출력
	// @Override - 재정의 => 자식 메서드가 호출
	@Override	// 컴파일러한테 재정의한다고 알려주면서 문법 체크하라고 함
	public void printInfo() {
		// 부모.printInfo() 호출
		super.printInfo();		// super. => 부모참조변수로 접근
		System.out.println("애교 : " + cute);
		//System.out.print("울다 : ");
		//cry();
	}
}
