package ch04;

public class _03_BookMain {
	
	public static void main(String[] args) {
		
		//101 printInfo 호출 -  book 정보 출력
		// setter > printInfo
			
		System.out.println("-- 방법1. 디폴트 생성자 + setter 로 값 전달 -- ");
		// 디폴트 생성자 호출해서 객체생성
		_03_Book book = new _03_Book();
		
		book.setBookNo(101);
		book.setBookTitle("하얼빈");
		book.setBookAuthor("김훈");
		
		book.printInfo();
		
		System.out.println("-- 방법2. 매개변수 생성자로 값 전달 -- ");
		_03_Book book2 = new _03_Book(102,"jsp","장나라");
		book2.printInfo();
		
		System.out.println();
		
		//102 getter 구현 - book 정보 출력
		// setter > getter
		
		_03_Book book3 = new _03_Book();
		
		book3.setBookNo(103);
		book3.setBookTitle("청설");
		book3.setBookAuthor("김믕냥");
		
		System.out.println("책번호 : " + book3.getBookNo());
		System.out.println("책제목 : " + book3.getBookTitle());
		System.out.println("책저자 : " + book3.getBookAuthor());
		
	}

}
