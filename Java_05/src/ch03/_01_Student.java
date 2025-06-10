package ch03;

public class _01_Student {
	
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인
	 *       - 멤버변수(속성) + 멤버메서드(기능,동작)
	 * 객체 : 클래스를 바탕으로 만들어진 힙 메모리 공간
	 */

	// 멤버변수(속성)
	// 학번, 이름, 이메일, 주소
	String studentID;	// S001
	String name;		// 지현주
	String email;		// rhdid408@naver.com
	String address;
	int age;
	int myMoney;
	
	// 멤버메서드(기능,동작)
	public void printInfo() {
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);
		System.out.println("용돈 : " + myMoney);
	}
	
}
