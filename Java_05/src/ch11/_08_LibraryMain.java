package ch11;

// p614 ~ p620 
// wait() , notify()
public class _08_LibraryMain {
	
	public static _08_Library library = new _08_Library();
	
	public static void main(String[] args) {
		_08_Student std1 = new _08_Student();
		_08_Student std2 = new _08_Student();
		_08_Student std3 = new _08_Student();
		_08_Student std4 = new _08_Student();
		_08_Student std5 = new _08_Student();
		_08_Student std6 = new _08_Student();
		_08_Student std7 = new _08_Student();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		std7.start();
		
	}

}
