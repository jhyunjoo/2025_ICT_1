package test;

import java.util.List;
import java.util.ArrayList;

public class _12_ArrayListEx {
	
	public static void main(String[] args) {
		/*
		ArrayList 생성 문법 => ArrayList<데이터타입클래스> 참조변수명 = new ArrayList<데이터타입클래스>();
		추가메서드명 list.add(), 삭제메서드명 list.remove(), 조회메서드명 list.get()
		특징 => 순서가 있고, 중복이 가능함

		ArrayList에 추가해서 출력하기(다형성 적용)

		1. 추가 => 봄 여름 가을 겨울
		   조회 => for문
				향상된 for문

		2. 추가 => 90 80 70 60 50
		   조회 => for문으로 합계
				향상된 for문으로 합계
		*/
		
		List<String> list = new ArrayList<String>();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add("겨울");
		
		System.out.println("for문으로 ArrayList 출력");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("향상된 for문으로 ArrayList출력");
		for(String l : list) {
			System.out.println(l);
		}

		System.out.println();

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(90);
		list2.add(80);
		list2.add(70);
		list2.add(60);
		list2.add(50);

		int sum = 0;
		System.out.println("for문으로 ArrayList 합계 구하기");
		for(int i = 0; i < list2.size(); i++) {
			sum += list2.get(i);
	 	}
		System.out.println("합계 : " + sum);

		sum = 0;
		System.out.println("향상된 for문으로 ArrayList 합계 구하기");
		for (int l : list2) {
			sum += l;
		}
		System.out.println("합계 : " + sum);
	}

}
