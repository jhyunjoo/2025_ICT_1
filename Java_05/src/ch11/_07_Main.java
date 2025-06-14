package ch11;

public class _07_Main {

	public static void main(String[] args) {
	
		/*
		 * 1) 한계좌의 금액을 다른 계좌로 이체
		 * 2) 공유영역(김태희 계좌(200만원) + 비 계좌(100만원))
		 * 3) 두 계좌의 잔액합계를 출력하는 일을 동시에 한다.
		 */
		
		_07_Account kim = new _07_Account("010-1111-2222", "김태희", 2000000);
		_07_Account b = new _07_Account("010-8888-9999", "비", 1000000);
		
		_07_SharedArea account = new _07_SharedArea(kim, b);
		
		// 스레드 발생
		// 매개변수 생성자 호출
		_07_TransferThread transfer = new _07_TransferThread(account);
		_07_TotalBalanceThread totalBalance = new _07_TotalBalanceThread(account);
		
		// 스레드 실행
		transfer.start();
		totalBalance.start();

	}
	
}
