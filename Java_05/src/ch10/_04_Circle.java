package ch10;

public class _04_Circle implements Cloneable {	// 마커 인터페이스(marker interface) : 구현할 메서드가 없는 인터페이스

	_04_Point point;
	int radius;
	
	_04_Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new _04_Point(x,y);
	}
	
	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
