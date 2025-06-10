package ch07;

// 자식클래스 implements(구현하다) 인터페이스
public class _03_Calculator implements _03_Calc{
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		else {
			return _03_Calc.ERROR;
		}
	}

	public void showInfo() {
		System.out.println("Calc Interface 구현!!!");
	}
	
}
