package ch04;

public class _10_StudentMain {
	public static void main(String[] args) {
		
		_10_Student lee = new _10_Student();
		lee.setName("이지우");
		
		//System.out.println("serial : " + lee.serialNum);
		System.out.println("serial : " + _10_Student.serialNum);
		System.out.println("이름 : " + lee.getName());
		System.out.println("학번 : " + lee.getStudentID());
		
		/*
		serial : 1001
		이름 : 이지우
		학번 : 1001
		*/
		
		System.out.println("---------------");
		
		_10_Student son = new _10_Student();
		son.setName("손수경");
		System.out.println("serial : " + _10_Student.serialNum);
		System.out.println("이름 : " + son.getName());
		System.out.println("학번 : " + son.getStudentID());
		
		/*
		serial : 1002
		이름 : 손수경
		학번 : 1002
		*/
		
		System.out.println("---------------");
		
		_10_Student kim = new _10_Student();
		kim.setName("김나경");
		System.out.println("serial : " + _10_Student.serialNum);
		System.out.println("이름 : " + kim.getName());
		System.out.println("학번 : " + kim.getStudentID());
		
	}

}
