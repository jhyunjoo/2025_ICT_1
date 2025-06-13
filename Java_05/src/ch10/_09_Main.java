package ch10;

public class _09_Main {
	
	public static void main(String[] args) {
		_09_SpreadArgs spread = new _09_SpreadArgs();
		spread.callArgs("치킨", "피자");
		spread.callArgs2("치킨", "피자", "연어스테이크", "파스타", "햄버거", "냉면", "닭발");
		spread.callArgs3("소지섭", 10,20,30,40,50);
	}

}
