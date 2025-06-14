package ch11;

// 3-1. 계좌이체 스레드 - Thread클래스 상속
public class _07_TransferThread extends Thread{
	
	// 멤버변수
	_07_SharedArea sharedArea;	// 매개변ㄴ수 생성자를 통해 주소값 전달
	
	// 디폴트 생성자
	public _07_TransferThread() {}
	
	// 매개변수 생성자
	public _07_TransferThread(_07_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	
	// run 재정의 => 계좌이체 transfer(1000) 5번 호출(for문)
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			sharedArea.transfer(1000);
		}
		
	}
}
