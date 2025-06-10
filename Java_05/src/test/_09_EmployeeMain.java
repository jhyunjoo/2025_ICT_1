package test;

public class _09_EmployeeMain {

	public static void main(String[] args) {
		
		_09_Manager m = new _09_Manager();
		m.setSabun("S001");
		m.setName("문상연");
		m.setDeptName("전산실");
		m.setSalary(100000);
		m.setBonus(2000);
		m.printInfo();

		System.out.println();
		
		_09_Sawon s = new _09_Sawon();
		s.setSabun("S002");
		s.setName("송하준");
		s.setDeptName("전산실");
		s.setSalary(8000);
		s.setSudang(1000);
		s.printInfo();
	}

}
