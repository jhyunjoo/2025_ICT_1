package ch08;

import java.util.ArrayList;
import java.util.Iterator;

// p428
// ArrayList에 Member 데이터를 추가, 삭제, 조회
public class _04_MemberArrayList {
	
	private ArrayList<_04_Member> list;

	// 디폴트 생성자
	public _04_MemberArrayList() {
		// ArrayList 생성
		list = new ArrayList<_04_Member>();
	}
	
	// 리스트 추가 메서드
	public void addMember(_04_Member member) {	// _04_Member member = new _04_Member(1001, "이지원");
		list.add(member);		// new _04_Member(1001, "이지원")
	}
	
	// 리스트 삭제 메서드
	// 회원 탈퇴 - key로 삭제
	public boolean removeMeber(int memberId) {	// 1004
		for (int i = 0; i < list.size(); i++) {
			_04_Member member = list.get(i);	// get() 메서드로 회원을 순차적으로 가져옴
			int tempId= member.getMemberId();	// 0번째 - 1001 
			if (tempId == memberId) {	// 회원아이디가 매개변수와 일치하	면
				list.remove(i);			// 해당 회원(1004)을 삭제
				return true;			// 삭제 후 바로 종료 ... 삭제 후 아래 메서드 실행 안 함
			} // if
		} // for i
		System.out.println(memberId + "가 존재하지 않습니다.");	// 반복문이 끝날때까지 해당 아이디를 못 찾은 경우
		return false;	// 종료 ... removeMember를 빠져나감
	} // removeMember
	
	// 리스트 조회 및 출력 메서드
	public void showAllMember() {
		System.out.println("<<< 향상된 for문 >>>");
		for (_04_Member member : list) {
			System.out.println(member.toString());
		}
		System.out.println();
		
		System.out.println("<<< 반복자를 이용한 출력 >>>");
		Iterator<_04_Member> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
