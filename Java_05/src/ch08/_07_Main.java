package ch08;

// p459
public class _07_Main {

	public static void main(String[] args) {
		_07_MemberHashMap memberHashMap = new _07_MemberHashMap();
		
		_07_Member lee = new _07_Member(1001,"이지원");
		_07_Member son = new _07_Member(1002,"손민국");
		_07_Member park = new _07_Member(1003,"박서훤");
		_07_Member hong = new _07_Member(1004,"홍길동");
		
		memberHashMap.addMember(lee);
		memberHashMap.addMember(son);
		memberHashMap.addMember(park);
		memberHashMap.addMember(hong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
	
}
