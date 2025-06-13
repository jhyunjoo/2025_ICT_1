package ch10;

public class _03_StudentMain {
	
	public static void main(String[] args) {
		_03_Student lee = new _03_Student(100,"이상원");
		_03_Student lee2 = lee;
		_03_Student sang = new _03_Student(100,"이상원");
		
		if(lee == lee2) {
			System.out.println("lee와 lee2의 주소는 같습니다.");
		} else {
			System.out.println("lee와 lee2의 주소는 다릅니다.");
		}
		
		if(lee.equals(lee2)) {
			System.out.println("lee와 lee2는 동일합니다.");
		} else {
			System.out.println("lee와 lee2는 동일하지 않습니다.");
		}
		
		if(lee == sang) {
			System.out.println("lee와 sang의 주소는 같습니다.");
		} else {
			System.out.println("lee와 sang의 주소는 다릅니다.");
		}
		
		if(lee.equals(sang)) {
			System.out.println("lee와 sang은 동일합니다.");
		} else {
			System.out.println("lee와 sang은 동일하지 않습니다.");
		}
		
		/* equals() 메서드를 재정의 안 했을 때
		 *  lee와 lee2의 주소는 같습니다.
			lee와 lee2는 동일합니다.
			lee와 sang의 주소는 다릅니다.
			lee와 sang은 동일하지 않습니다.
		 */
		
		/* equals() 메서드를 재정의 했을 때
		 *  lee와 lee2의 주소는 같습니다.
			lee와 lee2는 동일합니다.
			lee와 sang의 주소는 다릅니다.
			lee와 sang은 동일합니다.		
		 */
		
		// hashCode() 재정의 했을 때
		System.out.println("lee의 hashCode : " + lee.hashCode());
		System.out.println("sang의 hashCode : " + sang.hashCode());
		System.out.println("lee의 실제 주소값 : " + System.identityHashCode(lee));
		System.out.println("sang의 실제 주소값 : " + System.identityHashCode(sang));
		
	}

}
