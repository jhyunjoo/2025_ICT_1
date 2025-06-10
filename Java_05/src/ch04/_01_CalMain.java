package ch04;

public class _01_CalMain {
	public static void main(String[] args) {
		
		double n1 = 8.0;
		double n2 = 4.0;
		
		// 객체 생성
		_01_Calculator cal= new _01_Calculator();
		
		// 함수 호출
		double addR = cal.add(n1, n2);
		double subR = cal.sub(n1, n2);
		double mulR = cal.mul(n1, n2);
		double divR = cal.div(n1, n2);
		
		System.out.println("더하기 : " + addR);
		System.out.println("빼기 : " + subR);
		System.out.println("곱하기 : " + mulR);
		System.out.println("나누기 : " + divR);
	}
}
