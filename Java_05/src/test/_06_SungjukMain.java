package test;

import java.util.Scanner;

public class _06_SungjukMain {
	public static void main(String[] args) {
		_06_Sungjuk sj = new _06_Sungjuk();

		sj.setKor(90);
		sj.setEng(80);
		sj.setMath(70);

		sj.printInfo();
		
		System.out.println("");

		_06_Sungjuk sj2 = new _06_Sungjuk();

		Scanner sc = new Scanner(System.in);	
		System.out.print("국어 점수 : ");
		sj2.setKor(sc.nextInt());
		System.out.print("영어 점수 : ");
		sj2.setEng(sc.nextInt());
		System.out.print("수학 점수 : ");
		sj2.setMath(sc.nextInt());

		System.out.println("국어 : " + sj2.getKor() );
		System.out.println("영어 : " + sj2.getEng() );
		System.out.println("수학 : " + sj2.getMath() );
		System.out.println("합계 : " + sj2.getTotal() );
		System.out.println("평균 : " + sj2.getAvg() );
		System.out.println("평점 : " + sj2.getGrade() );

		sc.close();
	}

}
