package ch09;

import java.util.Scanner;

public class _02_ArithmeticException {
	
	public static void main(String[] args) {
		/*
       * [면접]
       * 예외 처리 목적 : 프로그램 정상종료
       * 
       * try {
       *      // 예외가 발생할 수 있는 코드 부분
       * } catch(처리할 예외타입 e) {
       *    // try 블록안에서 예외가 발생했을 때 예외를 처리하는 부분
       * } finally {
       *      // 항상 수행되는 부분(예외가 발생하지 않더라도) 
       *    // 주로 자원해제를 위한 close() 문장이 온다.
       * }
       * 
       * 1. 강제예외발생 : throw new Exception(message);
       * 2. 상위 메서드에게 예외 던지기
       *    throws Exception
       * 3. 예외 처리
       *    catch(던진 Exception e){e.getMaessage()}로 받는다.
       * 
       * catch문이 여러개일때(다중 catch) 부모 Exception이 제일 아래오도록 한다. 실행순서는 위에서부터 실행
       */
		
		System.out.println("=== 두개의 정수값 입력 ===");
		
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 값 입력 : ");
		int num2 = sc.nextInt();
		
		try { 
			// 예외가 발생할 수 있는 코드 부분 => 0으로 나눌 때
			System.out.println("몫 : " + (num1 / num2));
			System.out.println("나머지 : " + (num1 % num2));
		} catch(ArithmeticException e) {
			// try 블록안에서 예외가 발생했을 때 예외를 처리하는 부분
			System.out.println("=== 예외 처리 부분 ===");
			System.out.println("예외 처리 메시지 : " + e.getMessage());
		} finally {
			// 항상 수행되는 부분(예외가 발생하지 않더라도) 
			// 주로 자원해제를 위한 close() 문장이 온다.
			System.out.println("=== finally 부분 ===");
			sc.close();
		}
		
		System.out.println("<<< 정상 종료 !!! >>> ");
	}

}
