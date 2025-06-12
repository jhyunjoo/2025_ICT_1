package ch09;

// p540
public class _06_Main {

	public static void main(String[] args) {
		
		_06_IDFormat id = new _06_IDFormat();

		// 따로 주석처리해서 테스트
		// userID = null
		try {
			id.setUserId(null);
		} catch (_06_IDFormatException e) {
			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		} finally {
			System.out.println("finally 부분");
		}
		
		// userID != null
		try {
			id.setUserId("1234567");
		} catch (_06_IDFormatException e) {
			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		} finally {
			System.out.println("finally 부분");
		}
		
	}
	
}
