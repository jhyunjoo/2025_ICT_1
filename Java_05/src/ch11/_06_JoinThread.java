package ch11;

// 1) Thread 클래스를 상속하기 - run() 메서드를 override
public class _06_JoinThread extends Thread{
	
	int start;
	int end;
	int sum;
	
	// 디폴트 생성자
	public _06_JoinThread() {}
	
	// 매개변수 생성자
	public _06_JoinThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i = start; i <= end ; i++) {
			sum += i;
		}
		//System.out.println("sum : " + sum);
	}

}
