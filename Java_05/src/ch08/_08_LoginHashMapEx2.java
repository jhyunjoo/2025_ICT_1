package ch08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _08_LoginHashMapEx2 {
   public static void main(String[] args) {
      
       // 1. id, pwd 5건을 hashtable에 저장(hashMap에 저장) - put
         
         Map<String, String> hashtable = new HashMap<String, String>();
         hashtable.put("park", "park1234");
         hashtable.put("kim", "kim1234");
         hashtable.put("lee", "lee1234");
         hashtable.put("son", "son1234");
         hashtable.put("choi", "choi1234");
         
         Scanner scan = new Scanner(System.in);

         while(true) {         
            System.out.println("아이디 입력해주세요.(종류를 원하시면, Q 또는 q를 입력해주세요.)");
            String id = scan.next();
            
            if(id.equals("q") || id.equals("Q")) {
               System.out.println("정상적으로 종료 되었습니다.");
               scan.close();
               System.exit(0);
            } else {
               if(idWordCheck(id, hashtable) == false) {
                  System.out.println("입력하신 아이디가 존재하지 않습니다.");
               } else {
                  System.out.println("비밀번호 입력해주세요.");
                  String password = scan.next();
                  if(passWordCheck(id, password, hashtable) == true) {
                     System.out.println("로그인 성공하셨습니다.");
                     System.out.println("메인 화면으로 이동합니다.");
                     break;
                  } else {
                     System.out.println("비밀번호가 불일치 합니다..");
                  }
               }
            }
         }
      }
      
      public static boolean idWordCheck(String id, Map<String, String> hashtable) {
         
         if(hashtable.containsKey(id)) {
            return true;
         } else {
            return false;
         }
      }
      
      public static boolean passWordCheck(String id, String password, Map<String, String> hashtable) {
         
         if(password.equals(hashtable.get(id))) {
            return true;
         } else {
            return false;
         }
      }
}
