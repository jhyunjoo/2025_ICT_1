package ch11;

public class _06_JoinMain {

	public static void main(String[] args) throws InterruptedException { // 예외처리2)
		
		// 매개변수 생성자 호출
		_06_JoinThread joinA = new _06_JoinThread(1, 50);
		_06_JoinThread joinB = new _06_JoinThread(51, 100);
		
		joinA.start();
		joinB.start();
		
		// join() 메서드는 스레드 간의 순차작업애 활용할 수 있다.
		// main() 함수의 결과가 바로 출력되지 않고, 두 스레드의 수행이 끝난 후 합산한 결과가 출력되도록 함
		joinA.join(); 	// 예외처리1) : throws 선택
		joinB.join();
		
		int total = joinA.sum + joinB.sum;
		System.out.println(joinA.sum + "+" + joinB.sum + "=" + total);
		
		System.out.println(joinA.sum);
		System.out.println(joinB.sum);
		
	}
	
}
