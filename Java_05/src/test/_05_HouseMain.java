package test;

public class _05_HouseMain {
	public static void main(String[] args) {
		// 클래스 생성문법
		_05_House house = new _05_House();

		// 참조변수 정의
		house.address = "강남구";
		house.price = 200000;
		house.kind = "아파트";
		house.size = 32;

		// 멤버변수 메서드 접근
		house.printInfo();
	}
}
