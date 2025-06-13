package test;

// p539~540
public class _15_Main {
	
	public static void main(String[] args) {
		
		/*1. 예외처리 목적 : 프로그램이 비정상 종료되는것을 방지하고 정상종료하기 위해서
		  2. 예외처리 문법 :
			try {
				// 예외가 발생하는 코드
			} catch (예외구문 참조변수){
				// 예외가 발생했을 때 실행할 코드
			} finally {
				// 예외와 상관없이 항상 실행되는 코드
			}
		 * 
		 */
		
		_15_Password pw = new _15_Password();
		
		try {
			pw.setPassword(null);
		} catch (_15_PasswordFormatException e) {
			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		} finally {
			System.out.println("finally 부분");
		}

		System.out.println("정상 종료");

		try {
			pw.setPassword("1234");
		} catch (_15_PasswordFormatException e) {
			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		} finally {
			System.out.println("finally 부분");
		}

		System.out.println("정상 종료");
	}


}
