package ch04;

// p167
// 핸드폰 클래스
public class _09_Phone {
	
	// 멤버변수
	private String model;	// 아이폰
	private double price;	// 1000000
	
	// 디폴트 생성자
	public _09_Phone() {}
	
	// 매개변수 생성자
	public _09_Phone(String model, double price) {
		this.model = model;
		this.price = price;
	}
	
	// 멤버메서드
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("model : " + model);
		System.out.println("가격 : " + price);
	}
}
