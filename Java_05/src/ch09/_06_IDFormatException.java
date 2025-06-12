package ch09;

// p539
// 사용자정의 Exception - Exception 을 상속 받아야 함
public class _06_IDFormatException extends Exception{

	// 매개변수 생성자
	public _06_IDFormatException(String message) {
		super(message);	// 부모(=Exception) 매개변수 생성자 호출
	}
}
