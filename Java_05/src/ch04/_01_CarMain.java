package ch04;

public class _01_CarMain {
	public static void main(String[] args) {
		
		_01_Car car = new _01_Car();
		
		car.setMadein("스웨덴");
		car.setBrand("볼보");
		car.setPrice(6000);
		car.setColor("gray");
		car.printInfo();
		
		System.out.println();
		
		_01_Car car2 = new _01_Car("한국", "제네시스", 10000000, "black");
		car2.printInfo();
	}

}
