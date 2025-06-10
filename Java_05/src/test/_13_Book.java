package test;

public class _13_Book {
	
	// 멤버변수
	private int bookNo;	// 101	1002		103			104		105
	private String title;	// 하얼빈	돈의 속성	단 한번의 삶	모순		소년이 온다
	private String author;	// 김훈	김승호	김영하		양귀자	한강
	private int price;		// 16000	16020	15120		11700	13500

	// 디폴트 생성자
	public _13_Book() {}

	// 매개변수 생성자
	public _13_Book(int bookNo, String title, String author, int price) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// getter, setter, toString	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "책번호 : " + bookNo + "| 책제목 : " + title + "| 책저자 : " + author + "| 책가격 : " + price;
	}

}
