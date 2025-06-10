package ch03;

import java.util.Scanner;

public class _03_InOutEx {
	
	public static void main(String[] args) {
		
		// 두 수의 합 구하기
		// 객체(인스턴스) 생성
		// 클래스명 참조변수 = new 클래스명(); // 참조변수에 클래스의 주소값이 들어있다.
		// 참조변수.멤버변수 = 값;
		// 참조변수.멤버메서드();
		// 자바 API => https://docs.oracle.com/javase/8/docs/api
		Scanner input = new Scanner(System.in); 
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = input.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("sum :  " + sum);
		
		input.close();
		
	}

}
