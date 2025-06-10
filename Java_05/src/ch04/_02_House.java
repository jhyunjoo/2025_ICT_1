package ch04;

public class _02_House {
	
	// 4. 멤버변수(속성)
	private String address;		// 위치
	private int price;			// 가격
	private String kind;		// 종류
	private int size;			// 평수
	private int window;		// 창문여부
	
	// 멤버메서드
	// getter
	public String getAddress() {
		return address;
	}
	// 값 대입 : set
	// setter(set + 멤버변수: 첫글자 대문자)
	public void setAddress(String address) {	// 2. 매개변수
		// 3.멤버변수 = 매개변수;
		this.address = address;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price < 0) {
			System.out.println("가격 : 0원 이상!");
			// System.exit(0);		// 종료
		} else {
			this.price = price;
		}
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		if (size < 0) {
			System.out.println("평수 : 0평 이상!");
		} else {
			this.size = size;
		}
	}
	
	public int getWindow() {
		return window;
	}
	public void setWindow(int window) {
		this.window = window;
	}
	


	// 5. 멤버변수 정보 출력
	public void printInfo() {	// 멤버변수 앞에 this. 생략되어있음(당연해서)
		System.out.println("위치 : " + address);
		if (price > 0) {
			System.out.println("금액 : " + price);
		}
		System.out.println("종류 : " + kind);
		if (size > 0) {
			System.out.println("평수 : " + size);
		}
		if(window == 1) {
			System.out.println("창문 있습니다.");
		} else {
			System.out.println("창문 없습니다.");
		}
	}

}
