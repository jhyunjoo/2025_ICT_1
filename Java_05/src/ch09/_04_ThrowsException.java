package ch09;

import java.util.Scanner;

public class _04_ThrowsException {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
       * 1. 강제예외발생 : throw new Exception(message);
       * 2. 상위 메서드에게 예외 던지기
       *    throws Exception
       * 3. 예외 처리 : try ~ catch ~ finally
       *    catch(던진 Exception e){e.getMaessage()}로 받는다.
       * 
       * catch문이 여러개일때(다중 catch) 부모 Exception이 제일 아래오도록 한다. 실행순서는 위에서부터 실행
       */
		
		try {
			int age = readAge();
			System.out.println("나이 : " + age);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		} finally {
			System.out.println("<<< finally >>>");
			sc.close();
		}
		
		System.out.println("<<< 정상 종료 >>>");
		
	} // main
	
	public static int readAge() throws Exception {	// 2. 상위 메서드에게 예외 던지기 : throws Exception
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age < 0) {
			// 1. 강제예외발생 : throw new Exception(message);
			throw new Exception("나이는 0보다 커야 합니다.");
		}
		return age;
	}
}
