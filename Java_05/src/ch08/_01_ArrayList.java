package ch08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01_ArrayList {

	public static void main(String[] args) {
		/*
       * [ArrayList]
       * 
       * Collection 인터페이스
       * - List 인터페이스 : 클래스 종류는 ArrayList, Vector, LinkedList
       * - Set 인터페이스 : 클래스종류는 HashSet, TreeSet
       * - Map 인터페이스 : 클래스종류는 HashMap, HashTable, TreeMap
       * 
       *  <면접>
       *  1. 특징
       *  List 인터페이스 : 순서가 있는 자료관리, 중복허용한다.
       *                 index를 사용하여 요소에 접근한다.
       *                 리스트에 들어있는 요소들의 인덱스는 0부터 시작한다.
       *                 클래스종류는 ArrayList, Vector, LinkedList
       *                 
       *  Set 인터페이스 : 순서가 없는 자료관리, 중복허용 않는다.
       *                클래스종류는 HashSet, TreeSet
       * 
       * 2. 선언
       * 클래스명<데이터타입클래스> 참조변수 = new 클래스명<데이터타입클래스>();
       * ArrayList<String> list = new ArrayList<String>();
       * String[] arr = new String[5];  // 배열 : 정해진갯수만큼
       * 
       * 다형성 적용
       * List<String> list = new ArrayList<String>();
       * 
       * 3. 특징 : 데이터 순서가 있다. 중복허용된다.
       * 4. 추가 : list.add(값);  // 앞에서부터 순서대로 추가
       *         list.add(추가할 위치 index, 값);  // 지정한 인덱스에 값을 추가, 그 뒤의 값은 밀려난다.
       * 5. 값 가져오기 : list.get(가져올 index);   // list.size()만큼 반복        
       * 6. 교체 : list.set(교체할 위치 index, 값); // 지정한 인덱스의 값을 변경.. 그 뒤값은 그대로이다.
       * 7. 삭제 : list.remove(삭제할 위치 index);
       * 8. 검색 : list.indexOf(검색할 값);    // 중요
       *         => 리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
       *
       *         list.lastIndexOf(검색할 값)
         *          => 리스트에서 검색할 값과 똑같은 값을 갖는 마지막번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.         
        *
       *         검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
       *         
       * 9. 전체 삭제 : list.clear();
       * 10. 반복자 : 인터페이스 Iterator<E> iterator => while(hasNext())  { next() }
       * 											: 다음값이 존재하는 동안 반복
       */
		
		// 선언
		// 클래스명<데이터타입클래스> 참조변수 = new 클래스명<데이터타입클래스>();
		List<String> list = new ArrayList<String>();
		
		list.add("곱창");		// 인덱스 : 0
		list.add("치킨");		// 1
		list.add("피자");		// 2
		list.add("닭발");		// 3
		list.add("찜닭");		// 4
		
		System.out.println("[방법1. for문]");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		System.out.println("[방법2. 향상된 for문]");
		// for(자료형 변수명 : 리스트명) {}
		for(String l : list) {
			System.out.println(l);
		}
		
		System.out.println();
		
		System.out.println("[방법3. 반복자]");
		
		// 반복자 생성
		// Iterator iterator = list.iterator();			// 자료형 생략시 가장 큰 자료형인 Object 로 받는다.
		Iterator<String> iterator = list.iterator();	
		
		// 값이 존재하는 동안 이동해가면서 출력
		while(iterator.hasNext()) {	// ArrayList의 값이 존재하는지 체크
			// String food = (String) iterator.next();		// Object 를 자식타입으로 형변환한다.
			String food = iterator.next();	// 존재하는 값을 읽어서 변수에 대입
			System.out.println(food);
		}
		
		System.out.println();
		
		System.out.println("======== 정수 ========");
		
		List<Integer> list2 = new ArrayList<Integer>();	// Integer => int의 클래스타입
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + "\t");
		}
		
		System.out.println();
		
		for(int l : list2) {
			System.out.println(l);
		}
		
		System.out.println();
		
		System.out.println("[방법3. 반복자]");
		
		Iterator<Integer> iterator2 = list2.iterator();
		
		while(iterator2.hasNext()) {
			//Integer i = iterator2.next();
			System.out.println(iterator2.next());
		}
			
	}
	
}
