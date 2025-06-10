package ch08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _08_LoginHashMapEx {

	public static void main(String[] args) {
		/* [플젝]
       * 1. id, pwd 5건을 hashtable에 저장(hashMap에 저장) - put
       * 2. 콘솔로부터 id, password를 입력받는다.(로그인을 위해)
       *    1과 2를 비교해서
       * 3. 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 출력
       *    아이디가 있으면 비밀번호와 비교해서 일치시 "로그인 성공" 출력
       *                                불일치시 "비밀번호가 불일치" 출력
       * 4. id입력시 Q나 q를 입력시 종료  :  System.exit(0) // 정상종료, break, return;
       * 문자열 비교 =>  입력값.equals(비교값)   => if(id.equals("park"))
       * 패스워드 비교 => pw.equals(map.get(i))
       * 
       *  key      value    
       *    id       password
       * "park"   "park1234"
       * "kim"    "kim1234"
       * "lee"    "lee1234"
       * "son"    "son1234"
       * "choi"   "choi1234"
       */
      
      // 1. id, pwd 5건을 hashtable에 저장(hashMap에 저장) - put
		
		Map<String, String> hashMap = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		hashMap.put("park", "park1234");
		hashMap.put("kim", "kim1234");
		hashMap.put("lee", "lee1234");
		hashMap.put("son", "son1234");
		hashMap.put("choi", "choi1234");
		
		while(true) {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			if (id.equalsIgnoreCase("Q")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			System.out.print("비밀번호 입력 : ");
			String pw = sc.next();
			
			if (!hashMap.containsKey(id)) {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			} else if(pw.equals(hashMap.get(id))){
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("비밀번호 불일치");
			}
		}
		
		sc.close();
	}
	
}
