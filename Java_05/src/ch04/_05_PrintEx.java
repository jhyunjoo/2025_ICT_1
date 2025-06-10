package ch04;

public class _05_PrintEx {
	public static void main(String[] args) {
		/*
       * printf(형식지정자, 값 또는 변수)
       * - 형식지정자 : format
       *   %d : 정수를 출력한다. 예)System.out.printf("%d", 10);
       *   %f : 실수를 출력한다. 예)System.out.printf("%f", 3.14f); // 실수6자리
       *   %c : 한 문자를 출력한다. 예)System.out.printf("%c", 'a');
       *   %s : 문자열을 출력한다. 예)System.out.printf("%s", "Good Luck");
       */
		
		double value = 1.0 / 3.0;
		
		System.out.println("value : " + value); 	// value : 0.3333333333333333
		System.out.printf("value : %f" , value);	// value : 0.333333	- 실수 6자리
		System.out.println();
		
		// printf(%전체자리수.나머지자리수f, 값 또는 변수) => 자리수가 부족하면 공백으로 채운다.
		System.out.printf("vlaue : %6.2f" , value);	// vlaue :   0.33	=> 앞의 2자리가 공백으로 채워진다.
		System.out.println();
		
		System.out.printf("value : %4.2f" , value);	// value : 0.33	=> 공백없이 채워진다.
		System.out.println();
		
		System.out.printf("value : %s", "Good Luck");
		System.out.println();
		
		System.out.printf("value : %s" , "2025/05/28");
		System.out.println();
		
	}

}
