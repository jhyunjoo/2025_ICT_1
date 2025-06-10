package ch03;

public class _01_StudentMain {

	public static void main(String[] args) {
		
		// 객체(인스턴스) 생성
		// 클래스명 참조변수 = new 클래스명(); // 참조변수에 클래스의 주소값이 들어있다.
		// 참조변수.멤버변수 = 값;
		// 참조변수.멤버메서드();
		
		_01_Student st1 = new _01_Student();
		st1.studentID = "S001";
		st1.name = "지현주";
		st1.email = "rhdid408@naver.com";
		st1.address = "서울시 성동구";
		st1.age = 23;
		st1.myMoney = 20000;
		
		st1.printInfo();
		
		System.out.println("-----------------------------");
		
		_01_Student st2 = new _01_Student();
		st2.studentID = "S002";
		st2.name = "유하민";
		st2.email = "min1101@gmail.com";
		st2.address = "서울시 마포구";
		st2.age = 20;
		st2.myMoney = 11000;
		
		st2.printInfo();
	}
}
