package ch08;

// 데이터 클래스
public class _04_Member {

	// 멤버변수
	private int memberId;		// 회원 아이디	1001	1002	1003	1004
	private String memberName;	// 회원 이름	이지원	손민국	박서훤	홍길동
	
	// 디폴트 생성자
	public _04_Member() {}
	
	// 매개변수 생성자
	public _04_Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	// 멤버메서드(getter setter)
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// toString()
	@Override	// 재정의하면 자식의 멤버변수 정보를 출력
	public String toString() {	// 원래 부모인 Object의 toString()은 주소값을 출력
		return "회원 아이디 : " + memberId + ", 회원명 : " + memberName;
	}
}
