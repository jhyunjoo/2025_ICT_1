package ch11;

// 2) Runnable 인터페이스를 구현하는 방법 - run() 메서드를 override
public class _02_MyThread implements Runnable{

	@Override
	public void run() {
		for(int i =1; i <= 10; i++) {
			try {
				Thread.sleep(1000);		// 1초간격
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(i + " ");
		}
	}

}
