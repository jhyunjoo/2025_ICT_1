package ch10;

import java.util.ArrayList;
import java.util.List;

public class _07_Main {
	
	public static void main(String[] args) {
		
		// 매개변수 생성자를 통한 값 전달
		_07_EnumEx cat = new _07_EnumEx(Animal.CAT, "먀미");
		_07_EnumEx dog = new _07_EnumEx(Animal.DOG, "므모");
		_07_EnumEx fish = new _07_EnumEx(Animal.FISH, "몌무");
		
		// 리스트생성
		List<_07_EnumEx> animal = new ArrayList<_07_EnumEx>();
		
		// 리스트에 담는다.
		animal.add(cat);
		animal.add(dog);
		animal.add(fish);
		
		// 향상된 for(for-each)문으로 출력
		for(_07_EnumEx e : animal) {
			System.out.println(e.getKind() + " : " + e.getName());
			// System.out.println(e.toString());	// 재정의 안 할 경우 주소값 출력
		} 
		
		// CAT : 야옹이
		// DOG : 댕댕이
		// FISH : 물고기
		
	}

}
