package test;

public class _13_Main {
	
	public static void main(String[] args) {

		_13_BookArrayList book = new _13_BookArrayList();

		// 매개변수 생성자로 값 전달
		_13_Book b1 = new _13_Book(101,"하얼빈","김훈",16000);
		_13_Book b2 = new _13_Book(102,"돈의 속성","김승호",16020);
		_13_Book b3 = new _13_Book(103,"단 한번의 삶","김영하",15120);
		_13_Book b4 = new _13_Book(104,"모순","양귀자",11700);
		_13_Book b5 = new _13_Book(105,"소년이 온다","한강",13500);

		// book추가후 출력
		book.insertBook(b1);
		book.insertBook(b2);
		book.insertBook(b3);
		book.insertBook(b4);
		book.insertBook(b5);
		book.showAllBook();
		
		System.out.println();
		
		System.out.println("--- 103번 삭제 ---");
		// 103번 삭제후 출력
		book.removeBook(b3.getBookNo());
		book.showAllBook();
	}

}
