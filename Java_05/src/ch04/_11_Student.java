package ch04;

public class _11_Student {
	
	static int serialNum = 1000; 
	int studentID;			
	static String name;			
		
	// 디폴트 생성자
	public _11_Student() {
		serialNum++;				// 학생이 생성될때마다 증가
		this.studentID = serialNum;	// 증가값을 멤버변수에 대입
	}
	
	// 매개변수 생성자
	public _11_Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	// getter, setter
	
	// static 메서드
	public static int getSerialNum() {
		name = "홍길동";		// 일반멤버변수이므로 static 메서드 안에서 사용불가, 따라서 static 변수로 변경
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		_11_Student.serialNum = serialNum;
	}

}
