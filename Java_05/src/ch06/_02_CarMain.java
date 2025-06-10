package ch06;

public class _02_CarMain {
	
	public static void main(String[] args) {
		
		// _02_FireCar 자식클래스 정보 + 공통 기능 출력
		_02_FireCar fire = new _02_FireCar();
		fire.setKind("소방차");
		fire.setSpeed(2000);
		fire.carInfo();
		fire.water();
		
		System.out.println();
		
		// _02_PoliceCar 자식클래스 정보 + 공통 기능 출력
		_02_PoliceCar police = new _02_PoliceCar();
		police.setKind("경찰차");
		police.setSpeed(3000);
		police.carInfo();
		police.siren();
		
	}

}
