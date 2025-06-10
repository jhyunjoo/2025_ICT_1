package ch04;

// DTO(data Transfer Object : 데이터 전송 객체)
// 화면 입력값 -> setter -> 멤버변수 -> getter -> 데이터베이스로 전달
public class _03_Book {
	
	// 멤버변수
	private int bookNo;			//101		102
	private String bookTitle;	// 하얼빈
	private String bookAuthor;	// 김훈
	
	// 생성자 => 멤버변수 초기화
	// 생성자 => new에 의해 호출된다. 클래스이름과 같고, 반환값이 없다.
	   // 1-1. 기본생성자(디폴트생성자) => 인스턴스 생성시점에 호출 
	   // => 생성자가 하나도 없을때 자바 컴파일러가 자동추가
	   // 매개변수 생성자가 존재시 컴파일러가 디폴트생성자를 자동추가하지 않으므로, 개발자가 추가하지 않으면 컴파일 오류 발생
	// 디폴트 생성자(기본 생성자)
	public _03_Book() {
		System.out.println("<<< 디폴트 생성자 >>> ");
	}	// public도 생략 가능
	
	// 매개변수 생성자
	// 생성자 오버로드 -> 메소드 이름이 같고 매개변수가 다른 경우
	public _03_Book(int bookNo) {
		System.out.println("<<< 매개변수 생성자 >>> ");
		this.bookNo = bookNo;
	}
	
	public _03_Book(int bookNo, String bookTitle, String bookAuthor) {
		System.out.println("<<< 매개변수 생성자 >>> ");
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}
	
	// 멤버 메서드
	// getter, setter(멤버변수 초기화)
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	// printInfo()
	public void printInfo() {
		System.out.println("책번호 : " + bookNo);
		System.out.println("책제목 : " + bookTitle);
		System.out.println("책저자 : " + bookAuthor);
	}

}
