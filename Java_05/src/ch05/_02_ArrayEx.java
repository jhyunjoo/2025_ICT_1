package ch05;

public class _02_ArrayEx {

	public static void main(String[] args) {
		/*
		* 방법2) 선언과 생성을 동시에 한다. .. 추천
	    * int[] scores = new int[갯수];
	    * scores[index] = 값;
	    */
		String[] drink = new String[5];
		drink[0] = "아이스초코";
		drink[1] = "밀크티";
		drink[2] = "바닐라라떼";
		drink[3] = "아이스라떼";
		drink[4] = "아이스티";
		
		for(int i = 0; i < drink.length; i++) {	// i <= drink.length - 0~5 => ArryaIndexOutOfBoundsException
			System.out.printf("drink[%s] : %s\n",i,drink[i]);
		}
		
		System.out.println();
		
		/* 방법4) 선언과 할당을 동시에 한다. .. 제일 많이 사용
	    * int[] scores = {값1, 값2,...};
	    */
		String[] drink2 = {"핫초코", "얼그레이티", "아메리카노", "망고스무디", "밀크쉐이크" };
		
		for (int i = 0 ; i < drink2.length; i++) {	// 행 => 배열의 길이
			System.out.printf("drink2[%s] : %s\n" ,i,drink2[i]);
		}
		
		System.out.println("----- [ 향상된 for문 ] ------");
		// 방법3. 향상된 for문 p230
		/*
		 * for(변수 : 배열) {
		 * 		반복문 실행;
		 * }
		 */
		
		for(String s : drink2) {
			System.out.print(s + "\t");
		}
		
		
	}
}
