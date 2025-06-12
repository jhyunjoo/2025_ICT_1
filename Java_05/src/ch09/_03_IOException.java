package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_IOException {
	
	public static void main(String[] args) throws IOException {	// 부모(JVM)에게 예외처리를 미룬다.
		
		// 파일처리를 할때는 두가지의 예외처리를 해줘야함
		// FileNotFoundException , IOException
		
		FileInputStream fis = null;	// 초기화를 해줘야 close를 할 수 있음
		
		try {	// 파일 읽어올때는 의무적으로 예외처리를 해줘야함
			fis = new FileInputStream("test.txt");	// try catch 선택
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			/*
			 * java.io.FileNotFoundException: test.txt (지정된 파일을 찾을 수 없습니다)
					at java.base/java.io.FileInputStream.open0(Native Method)
					at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
					at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
					at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
					at ch09._03_IOException.main(_03_IOException.java:17)
			 */
			System.out.println("메시지 : " + e.getMessage());	// test.txt (지정된 파일을 찾을 수 없습니다)
		} finally {
			System.out.println("finally 문장이므로 항상 수행됩니다.");
			if(fis != null) {	// 생략시 NullPointerException 발생 => 주소값이 없는 null 상태
				fis.close();	// throws IOException 선택
			}
		}
		
		System.out.println("<<< 정상 종료 >>>");
	}

}
