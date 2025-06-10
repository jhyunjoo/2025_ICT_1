package ch07;

// 자식클래스
public abstract class _01_NoteBook extends _01_Computer{

	@Override
	public void display() {
		System.out.println("_01_NoteBook - display()");
	}
	
//	@Override - 자식에게 위임
//	public void typing() {
//		
//	}

}
