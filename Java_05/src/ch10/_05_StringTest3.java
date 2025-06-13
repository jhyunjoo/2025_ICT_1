package ch10;

//p379
public class _05_StringTest3 {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java);	// java
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(java));	// 처음 문자열 주소값 : 717356484
		
		// 두 문자열을 합치면 앞 공간에 합쳐지는 것이 아닌,
		// 새로운 공간에 합쳐져서 저장됨
		java = java.concat(android);
		
		System.out.println(java);	// javaandroid
		System.out.println("연결된 문자열 주소값 : " + System.identityHashCode(java)); // 연결된 문자열 주소값 : 2012232625
		
	}
	
}
