package ch09;

import java.util.Scanner;

public class _05_ThrowsException {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		// readName() 호출
		// 이름의 길이가 1보다 커야합니다.
		try {
			String name = readName();
			System.out.println("이름 : " + name);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("메시지 " + e.getMessage());
		} finally {
			System.out.println("<<< finally 부분 >>>");
			sc.close();
		}
		
		System.out.println("<<< 정상 종료 >>>");
	}
	
	public static String readName() throws Exception {
		System.out.print("이름 입력 : " );
		String name = sc.next();
		if(name.length() <= 1) {
			throw new Exception("이름의 길이는 1보다 길어야 합니다.");
		}
		return name;
		
	}
}
