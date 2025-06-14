package ch11;

// 3-2. 잔액 합계 스레드 - Thread 클래스 상속
public class _07_TotalBalanceThread extends Thread {

	// 멤버변수
	_07_SharedArea sharedArea;
	
	// 디폴트 생성자
	public _07_TotalBalanceThread() {}
	
	// 매개변수 생성자
	public _07_TotalBalanceThread(_07_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	
	// run() 재정의 => getBalanceTotal 3번 호출해서 잔액합계 출력(for문), 1초간격
	@Override
	public void run() {
		for(int cnt = 0; cnt < 3; cnt++) {
			int sum = sharedArea.getBalanceTotal();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("잔액합계 : " + sum ); 
		}
	}
}
