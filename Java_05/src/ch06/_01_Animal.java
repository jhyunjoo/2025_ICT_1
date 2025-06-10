package ch06;

// 부모 클래스 => extends Object 생략되어있음
public class _01_Animal {
	
	// 공통인 멤버변수
	private String kind;	// 종류 : 고양이	강아지
	private int legs;		// 다리 : 4		4
	private int weight;		// 체중 : 5		7
	
	// 디폴트 생성자
	public _01_Animal() {
		System.out.println("<<< _01_Animal 생성자 >>>");
	}

	// getter setter
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// 멤버변수 정보 출력
	public void printInfo() {
		System.out.println("종류 : " + kind);
		System.out.println("다리 개수 : " + legs);
		System.out.println("체중 : " + weight);
	}
}
