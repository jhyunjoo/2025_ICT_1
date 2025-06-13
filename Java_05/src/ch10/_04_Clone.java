package ch10;

public class _04_Clone {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		// clone() : 객체를 복사하는 메서드
		// 인스턴수 변수가 동일한 인스턴스가 다른 메모리에 새로 생성되는 것
		
		_04_Circle circle = new _04_Circle(10,20,30);
		_04_Circle copyCircle =(_04_Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		
	}
	
}
