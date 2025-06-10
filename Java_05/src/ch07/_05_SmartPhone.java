package ch07;

// 자식클래스 => 부모클래스를 상속받고 인터페이스를 구현하는것을 동시에
public class _05_SmartPhone extends _05_PDA implements _05_Mobile,_05_MP3 {
	
	/*4. 상속과 구현을 동시 => 중요(많이 사용함)
	 * class 자식클래스명 extends 부모클래스 implements 인터페이스명1, .. 인터페이스명n {
	 */
	
	public void sendSMS() {
		System.out.println("문자를 보내다.");
	}
	public void receivesSMS() {
		System.out.println("문자를 받다.");
	}
	
	public void play() {
		System.out.println("음악을 연주하다");
	}
	public void stop() {
		System.out.println("음악을 멈추다");
	}
	
	@Override
	public int calculator(int x, int y) {
		return x / y;
	}

}
