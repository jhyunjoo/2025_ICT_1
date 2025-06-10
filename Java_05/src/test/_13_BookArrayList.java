package test;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class _13_BookArrayList {
	
	List<_13_Book> list;

	// 디폴트 생성자를 통해 ArrayList 생성
	public _13_BookArrayList() {
		list = new ArrayList<_13_Book>();
	}

	// ArrayList에 book 추가
	public void insertBook(_13_Book book) {
		list.add(book);
	}	

	// book 삭제
	public boolean removeBook(int bookNo) {
		for(int i = 0; i < list.size(); i++) {
			_13_Book book = list.get(i);
			int tempNo = book.getBookNo();
			if(tempNo == bookNo) {
				list.remove(i);
				return true;
			}
		}
		System.out.println(bookNo + "는 존재하지 않습니다.");
		return false;
	}

	// book 출력
	public void showAllBook() {
		// 1. 향상된 for 문으로 출력
		for(_13_Book book : list) {
			System.out.println(book);
		}

		System.out.println();

		// 2. 반복자로 출력
		Iterator<_13_Book> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
