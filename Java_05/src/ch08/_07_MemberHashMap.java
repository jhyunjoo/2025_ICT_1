package ch08;

import java.util.HashMap;
import java.util.Iterator;

//p458
public class _07_MemberHashMap {

	private HashMap<Integer, _07_Member> hashMap;
	
	public _07_MemberHashMap() {
		hashMap = new HashMap<Integer,_07_Member>();
	}
	
	public void addMember(_07_Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { 
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			_07_Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
