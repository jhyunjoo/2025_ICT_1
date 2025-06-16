package ch11;

import java.util.ArrayList;

public class _08_Library {
	
	// 멤버변수
	private ArrayList<String> shelf = new ArrayList<String> ();
	
	// 디폴트생성자
	public _08_Library() {
		shelf.add("태백산맥 1");
		shelf.add("태백산맥 2");
		shelf.add("태백산맥 3");
//		shelf.add("태백산맥 4");
//		shelf.add("태백산맥 5");
//		shelf.add("태백산맥 6");
//		shelf.add("태백산맥 7");
	}
	
	// 멤버메서드
	// 책 대여
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		while(shelf.size() == 0) {
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		String book = shelf.remove(0);	// 대여하면 맨 앞 인덱스를 삭제
		System.out.println(t.getName() + ":" + book + " lend");
		return book;
	}
	
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		shelf.add(book);
		notifyAll();
		System.out.println(t.getName() + ":" + book + " return");
	}

}
