package ch10;

//p364,366
public class _02_BookMain {
	
	public static void main(String[] args) {
		_02_Book book = new _02_Book(200, "개미");
		
		// toString()을 재정의 안 했을 때
		//System.out.println(book);				// ch10._02_Book@2f92e0f4
		//System.out.println(book.toString());	// ch10._02_Book@2f92e0f4
		
		// toString()을 재정의 했을 때
		System.out.println(book);
		System.out.println(book.toString());
	}

}
