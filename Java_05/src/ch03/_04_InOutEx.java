package ch03;

import java.util.Scanner;

public class _04_InOutEx {
	
	public static void main(String[] args) {
		
		// 객체(인스턴스) 생성
		// 클래스명 참조변수 = new 클래스명(); // 참조변수에 클래스의 주소값이 들어있다.
		// 참조변수.멤버변수 = 값;
		// 참조변수.멤버메서드();
		
		System.out.println("=== MyInfo ===");
		
		// 콘솔창에 이름, 나이, 이메일을 입력받아 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		
		System.out.println("---------------------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + email);
		
		sc.close();
	}

}
