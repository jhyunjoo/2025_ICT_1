package ch11;

//2) Runnable 인터페이스를 구현하는 방법 - run() 메서드를 override
public class _03_MyRunnable implements Runnable{

	// 멤버변수
	private String threadName;	// ThreadA 	ThreadB
	
	// 디폴트 생성자
	public _03_MyRunnable() {}
	
	// 매개변수 생성자
	public _03_MyRunnable(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println();
		for(int i = 10; i > 0; i--) {
			System.out.println(threadName + "-" + i + " ");
		}
	}
	
}
