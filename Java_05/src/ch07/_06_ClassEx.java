package ch07;

public class _06_ClassEx {

	public static void main(String[] args) {
		// call by reference => 매개변수로 주소값 전달
		// 매개변수를 통한 주소값 전달
		First first = new First();
		first.method1(new Second());
	}
	
}

class First {
	public void method1(Second second) {	// Second second = new Second();
		System.out.println("First 클래스 - method1()");
		second.method2(new Third());
	}
}

class Second {
	public void method2(Third third) {	// Third third = new Third();
		System.out.println("Second 클래스 - method2()");
		third.method3();
	}
}

class Third {
	public void method3() {
		System.out.println("Third 클래스 - method3()");
	}
}
