package test;

public class _06_Sungjuk {
	private int kor;		// 90
	private int eng;		// 80
	private int math;		// 70

	// getter, setter
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	// 합계
	public int getTotal() {
		return kor + eng + math;
	}

	// 평균
	public double getAvg() {
		return getTotal()/3.0;
	}

	// 평점
	public char getGrade() {
		int avg = (int) getAvg();
		switch(avg / 10 ) {
			case 10: 
			case 9:
				return 'A';
			case 8:
				return 'B';
			case 7:
				return 'c';
			case 6:
				return 'D';
			case 5:
				return 'E';
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				return 'F';
			default:
				return 'W';
		}
	}

	// 출력
	public void printInfo() {
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + getTotal() );
		System.out.println("평균 : " + getAvg());
		System.out.println("평점 : " + getGrade());
	}


}
