package joo;

public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student(2025 , "lee");
		
		lee.setKoreanSubject("국어", 59);
		lee.setMathSubject("수학", 55);
		
		Student kim = new Student(2026, "kim");
		
		kim.setKoreanSubject("국어", 40);
		kim.setMathSubject("수학", 60);
		
		
		lee.printInfo();
		kim.printInfo();
	}

}
