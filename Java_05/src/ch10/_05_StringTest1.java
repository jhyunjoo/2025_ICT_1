package ch10;


public class _05_StringTest1 {

	public static void main(String[] args) {
		
		String str = "A Barking dog";	// 상수풀에 데이터가 있다.
		String s1, s2, s3, s4, s5;
		
		// 문자열 길이 : length()
		System.out.println("문자열 길이 : " + str.length());	// 문자열 길이 : 13 (공백포함)
		
		// 문자열 결합 : concat("연결할 문자열")
		s1 = str.concat(" never Bites!!");
		System.out.println("s1 : " + s1);	// s1 : A Barking dog never Bites!!
		
		// 문자열 교환 : replace(oldChar, newChar)
		s2 = s1.replace("dog", "cat");
		System.out.println("s2 : " + s2); 	// s2 : A Barking cat never Bites!!
		
		// 부분 문자열 : substring(beginIndex, endIndex) -> beginIndex <= 추출값 < endIndex
		// beginIndex는 0부터 시작 | endIndex = endIndex - 1
		// index는 공백 미포함해서 적용
		s3 = s2.substring(5, 9);
		System.out.println("s3 : " + s3); 	// s3 : king
		
		// 대문자로 변환 : toUpperCase()
		s4 = s2.toUpperCase();
		System.out.println("s4 : " + s4); 	// s4 : A BARKING CAT NEVER BITES!!
		
		// 소문자로 변환 : toLowerCase()
		s5 = s4.toLowerCase();
		System.out.println("s5 : " + s5); 	// s5 : a barking cat never bites!!
		
		System.out.println("--------------------------");
		// split("쪼갤 문자")	=> 중요
		// : 입력받는 정규표현식 또는 특정 문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴한다.
		String hpStr = "010-1234-5678";
		String[] hp = hpStr.split("-");
		System.out.println("hp1 : " + hp[0]);
		System.out.println("hp2 : " + hp[1]);
		System.out.println("hp3 : " + hp[2]);
		
		System.out.println("--------------------------");
		
		String city = "서울,제주도,부산,광주,대전";
		
		// ,를 기준으로 쪼개서 for문으로 출력
		String[] cityArr = city.split(",");
		for(int i = 0; i < cityArr.length; i++) {
			System.out.println("cityArr[" + i + "] : " + cityArr[i]);
		}
		
		System.out.println("--------------------------");

		// trim() : 공백제거
		String strTrim = "     Hi!!!      ";
		System.out.println(strTrim);		//      Hi!!!      |
		System.out.println(strTrim.trim());	// Hi!!!
		
	}
}
