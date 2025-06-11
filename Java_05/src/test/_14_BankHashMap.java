package test;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class _14_BankHashMap {

	private Map<Integer,_14_Bank> hashMap;

	// 디폴트 생성자를 통해 BankHashMap 생성
	public _14_BankHashMap() {
		hashMap = new HashMap<Integer, _14_Bank>();
	}

	// HashMap에 bank 추가
	public void insertBank(_14_Bank bank) {
		hashMap.put(bank.getAccountNo(), bank);
	}

	// bank 삭제
	public boolean deleteBank(int accountNo) {
		if(hashMap.containsKey(accountNo)) {
			hashMap.remove(accountNo);
			return true;
		}
		System.out.println(accountNo + "는 존재하지 않습니다.");
		return false;
	}

	// bank 출력
	public void queryBank() {
		// 향상된 for문
		for (int key : hashMap.keySet()) {
			_14_Bank bank = hashMap.get(key);
			System.out.println(bank);
		}
		System.out.println();
		// 반복자로 출력
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			_14_Bank bank = hashMap.get(key);
			System.out.println(bank);
		}
		
	}
}
