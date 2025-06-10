package ch05;

public class _01_ArrayEx {

	public static void main(String[] args) {
		/*
		    * 배열(Array) : 대량의 동일한 자료형의 데이터를 한꺼번에 저장할 수 있는 저장장소이다.
		    * 방법1) 선언과 생성을 따로 한다.
		    * int[] scores; // 선언
		    * scores = new int[갯수]; // 생성
		    * scores[index] = 값;
		    * 
		    * 방법2) 선언과 생성을 동시에 한다. .. 추천
		    * int[] scores = new int[갯수];
		    * scores[index] = 값;
		    * 
		    * 방법3) int[] scores = new int[] {값1, 값2,...} // 갯수는 생략해야 함. 추천
		    * 
		    * 방법4) 선언과 할당을 동시에 한다. .. 제일 많이 사용
		    * int[] scores = {값1, 값2,...};
		    */
		/*
		* 방법2) 선언과 생성을 동시에 한다. .. 추천
	    * int[] scores = new int[갯수];
	    * scores[index] = 값;
	    */
		
		// 방법 2)
		int[] scores = new int[10];
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		scores[5] = 60;
		scores[6] = 70;
		scores[7] = 80;
		scores[8] = 90;
		scores[9] = 100;
		
		for(int i = 0; i < scores.length; i++) {	
			// System.out.println("scores[" + i + "] : " + scores[i]);
			// scores[i] = (i+1) * 10;
			System.out.printf("scores[%d] : %d\n",i,scores[i]);
		}
		
		System.out.println();
		
		// 방법 4)
		int[] scores2 = {10,20,30,40,50};
		
		for (int i = 0; i < scores2.length; i++) {	// 행 => 배열의 길이
			System.out.printf("scores[%d] : %d\n", i, scores2[i]);
		}
		

		System.out.println("----- [ 향상된 for문 ] ------");
		// 방법3. 향상된 for문 p230
		/*
		 * for(변수 : 배열) {
		 * 		반복문 실행;
		 * }
		 */
		for(int s: scores2) {
			System.out.print(s + "\t");
		}
		
		
	}
}
