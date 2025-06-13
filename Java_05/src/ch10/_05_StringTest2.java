package ch10;

//p378
public class _05_StringTest2 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);		// false
		System.out.println(str1.equals(str2));	// true => String은 자동으로 재정의가 추가되어있음
		
		// str3,str4 둘다 상수풀에 존재
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);		// true
		System.out.println(str3.equals(str4));	// true
		
	}
	
}
