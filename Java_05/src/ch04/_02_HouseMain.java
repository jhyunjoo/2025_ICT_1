package ch04;

public class _02_HouseMain {
	public static void main(String[] args) {
		_02_House house = new _02_House();
		
		// house.address = "강남구";
		// 1. setter 값
		house.setAddress("서대문구");
		
		//house.price = 200000;
		house.setPrice(-9999);
		
		//house.kind = "아파트";
		house.setKind("한옥");
		
		//house.size= 32;
		house.setSize(-40);
		
		house.setWindow(1);
		
		house.printInfo();	
		
		System.out.println("---- Main 에서 출력 ----");
		System.out.println("위치 : " + house.getAddress());
		if (house.getPrice() > 0) {
			System.out.println("금액 : " + house.getPrice());
		}
		System.out.println("종류 : " + house.getKind());
		if (house.getSize() > 0) {
			System.out.println("평수 : " + house.getSize());
		}
		
		if(house.getWindow() == 1) {
			System.out.println("창문 있습니다.");
		} else {
			System.out.println("창문 없습니다.");
		}
			
		
	}

}
