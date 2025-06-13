package ch10;

// p368
public class _03_Student {
	
	// p368
	int studentId;
	String studentName;
	
	public _03_Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}
	
	// p371 equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _03_Student) {
			_03_Student student = (_03_Student)obj;
			if (this.studentId == student.studentId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	// p374 hashCode() 재정의
	@Override
	public int hashCode() {
		return studentId;
	}

}
