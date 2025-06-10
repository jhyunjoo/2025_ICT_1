package ch07;

public class _02_CarMain {
	
	public static void main(String[] args) {
		System.out.println("<<< 자율 주행하는 자동차 >>>");
		_02_Car ai = new _02_AICar();
		ai.run();
		
		System.out.println();
		
		System.out.println("<<< 사람이 운전하는 자동차 >>>");
		_02_Car manual = new _02_ManualCar();
		manual.run();

	}

}
