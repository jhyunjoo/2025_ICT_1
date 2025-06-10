package ch08;

// p429
public class _04_MemberArrayListMain {
	
	public static void main(String[] args) {
		
		_04_MemberArrayList mlist = new _04_MemberArrayList();
		
		// 매개변수 -> 멤버변수에 값 전달
		_04_Member lee = new _04_Member(1001,"이지원");
		_04_Member son = new _04_Member(1002,"손민국");
		_04_Member park = new _04_Member(1003,"박서훤");
		_04_Member hong = new _04_Member(1004,"홍길동");
		
		// ArrayList에 member 들 추가
		mlist.addMember(lee);
		mlist.addMember(son);
		mlist.addMember(park);
		mlist.addMember(hong);
		
		mlist.showAllMember();
		/*
		회원 아이디 : 1001, 회원명 : 이지원
		회원 아이디 : 1002, 회원명 : 손민국
		회원 아이디 : 1003, 회원명 : 박서훤
		회원 아이디 : 1004, 회원명 : 홍길동
		*/
		/*
		toString() 재정의 한것을 주석처리하면 각각의 주소값을 출력함(Object 의 toString()이 실행됨)
		ch08._04_Member@28a418fc
		ch08._04_Member@5305068a
		ch08._04_Member@1f32e575
		ch08._04_Member@279f2327
		*/
		
		System.out.println("--- 삭제 --- ");
		mlist.removeMeber(hong.getMemberId());
		
		mlist.showAllMember();
	}

}
