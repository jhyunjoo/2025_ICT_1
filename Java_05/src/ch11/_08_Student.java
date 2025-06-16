package ch11;

public class _08_Student extends Thread{
	
	@Override
	public void run() {
		try {
			String title = _08_LibraryMain.library.lendBook();
			Thread.sleep(5000);
			_08_LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
