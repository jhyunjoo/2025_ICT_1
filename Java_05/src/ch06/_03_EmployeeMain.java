package ch06;

public class _03_EmployeeMain {

	public static void main(String[] args) {
		
		System.out.println("<< Manager 정보 >>");
		System.out.println("방법1. 디폴트 생성자 + setter로 값 전달");
		_03_Manager m = new _03_Manager();
		
		// 부모클래스의 setter로 값전달 -> 매개변수 -> 멤버변수
		m.setSabun("S001");
		m.setName("문상연");
		m.setDeptName("전산실");
		m.setSalary(100000);
		m.setTel("02-123-5678");
		m.setAddress("서울시 강남구");
		
		// 자식클래스의 setter로 값전달 -> 매개변수 -> 멤버변수
		m.setBonus(2000);
		m.printInfo();

		System.out.println();
		
		System.out.println("<< Sawon 정보 >>");
		System.out.println("방법2. 매개변수 생성자로 값 전달");
		// 자식 매개변수 생서자 -> 부모 매개변수 생성자 -> 부모 멤버변수
		_03_Sawon s = new _03_Sawon("S002","송하준","전산실",8000,"02-222-4444","서울시 마포구",1000);
		s.printInfo();
		
	}

}
