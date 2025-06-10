package ch07;

public class _03_Main {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 4;
		
		// 자식클래스 객체 생성
		// 03_Calculator calc = new _03_Calculator();
		
		// 다형성 적용하여 인스턴스 생성
		_03_Calc calc = new _03_Calculator();
		
		// 부모 추상메서드 -> 재정의된 자식메서드 호출
		System.out.println("덧셈 : " + calc.add(num1, num2));
		System.out.println("뺄셈 : " + calc.substract(num1, num2));
		System.out.println("곱셈 : " + calc.times(num1, num2));
		System.out.println("나눗셈 : " + calc.divide(num1, num2));
		
		System.out.println();
		
		_03_Calculator calc2 = (_03_Calculator) calc;	// 다운캐스팅
		calc2.showInfo();
	}
}
