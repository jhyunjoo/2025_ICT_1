package test;

public class _08_StaticEx {
	public static void main(String[] args) {
		_08_Person person = new _08_Person("사람");
		person.move();
		person.readBook();
		person.sleep();
		//personMove(person);
		
		System.out.println();
		
		personMove(new _08_Person("사람"));
		
	} // main

	private static void personMove(_08_Person person) {
		person.move();
		person.readBook();
		person.sleep();
	} // personMove
}
