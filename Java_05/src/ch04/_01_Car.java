package ch04;

public class _01_Car {
	
	// 멤버변수
	private String madein;	// 스웨덴		한국
	private String brand;	// 볼보		제네시스
	private int price;		// 6000		10000000
	private String color;	// gray		black
	
	// 디폴트 생성자
	public _01_Car() {}
	
	// 매개변수 생성자
	public _01_Car(String madein, String brand, int price, String color) {
		this.madein = madein;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	// 멤버메서드 getter, setter
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// 멤버메서드 printInfo() ... 멤버변수 정보를 출력
	public void printInfo() {
		System.out.println("국가 : " + madein);
		System.out.println("브랜드 : " + brand);
		System.out.println("가격 : " + price);
		System.out.println("색상 : " + color);
	}

}
