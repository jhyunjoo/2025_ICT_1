package ch08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_ArrayList {
	
	public static void main(String[] args) {
		/*
		 * 7. 삭제 : list.remove(삭제할 위치 index);
		 * 8. 검색 : list.indexOf(검색할 값);    // 중요
		 *         => 리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		 *
		 *         list.lastIndexOf(검색할 값)
         *          => 리스트에서 검색할 값과 똑같은 값을 갖는 마지막번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.         
         *
         *         검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
         * 9. 전체 삭제 : list.clear();
         */
		
		// HONGKILDONG
		// ArrayList 생성
		List<String> list = new ArrayList<String>();
		
		// 한문자씩 list 에 추가
		list.add("H");	// 0번째
		list.add("O");
		list.add("N");
		list.add("G");
		list.add("K");
		list.add("I");	// 5번째
		list.add("L");
		list.add("D");
		list.add("O");
		list.add("N");
		list.add("G");	// 10번째
		
		// 일치하는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		System.out.println("G문자의 인덱스 : " +  list.indexOf("G"));	// G문자의 인덱스 : 3
		System.out.println("N문자의 인덱스 : " +  list.indexOf("N"));	// N문자의 인덱스 : 2
		
		System.out.println("G문자의 마지막 인덱스 : " +  list.lastIndexOf("G"));	// G문자의 마지막 인덱스 : 10
		System.out.println("Z문자의 마지막 인덱스 : " +  list.lastIndexOf("Z"));	// Z문자의 마지막 인덱스 : -1
		
		System.out.println("--- 기본 for문 ---");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("--- 향상된 for문 ---");
		for(String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("--- Iterator 반복자 ---");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		
		// 7. 삭제 : list.remove(삭제할 위치 index);
		System.out.println("<<< revome >>>");
		list.remove(4);		// K 삭제
		for(String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		// 9. 전체 삭제 : list.clear();
		System.out.println("<<< 전체 삭제 : clear() >>>");
		list.clear();
		for(String str : list) {
			System.out.print(str + " ");		// 값이 없음
		}
		System.out.println();
		
	} 

}
