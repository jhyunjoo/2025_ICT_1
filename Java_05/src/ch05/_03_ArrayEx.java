package ch05;

public class _03_ArrayEx {

	public static void main(String[] args) {
		// 2차원 배열
		// int[][] arr2 = new int[2][3];	// 자료형[][] 배열명 = new 자료형[행개수][열개수];
		
		int[][] arr2 = {{1,2,3},
						{4,5,6}};			// 2행 3열
		
		// 배열 출력
		for(int i = 0; i < arr2.length; i++) {			// 행 - 배열.length => 2회 반복
			for(int j = 0; j < arr2[i].length; j++) {	// 열 - 행.length => 3회 반복 
				System.out.print(arr2[i][j] + " ");
				// 0행일때 : 0열 1열 2열	=> [0][0] [0][1] [0][2]
				// 1행일때 : 0열 1열 2열	=> [1][0] [1][1] [1][2]
			} // 안쪽 for 문
			System.out.println();	// 행이 바뀔때마다 출력
		} // 바깥 for 문
		
		System.out.println("-------------------");
		
		// A B C D
		// E F G H
		// I J K L
		//char[][] arr3 = new char[3][4];
		char[][] arr3 = {{'A', 'B', 'C', 'D'},		// 0행
					  	 {'E', 'F', 'G' , 'H'},		// 1행
						 {'I', 'J', 'K' , 'L'}};	// 2행
		//char ch = 'A';
		for (int i = 0; i < arr3.length; i++) {			// 행 - 배열.length => 3회 반복
			for (int j = 0; j < arr3[i].length; j++) {	// ch++	// 열 - 행.length => 4회 반복 
				//arr3[i][j] = ch;
				System.out.print(arr3[i][j] + " ");
			} // for j
			System.out.println();
		} // for i
	}
}
