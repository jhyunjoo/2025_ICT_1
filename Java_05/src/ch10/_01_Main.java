package ch10;

public class _01_Main {

	public static void main(String[] args) {
		
		// _01_Company hong = new _01_Company();
		// _01_Company kim = new _01_Company();
		
		_01_Company hong = _01_Company.getInstance();
		hong.gotoWork("홍길동");
		hong.work("홍길동");
		hong.gotoCafeteria("홍길동");
		hong.gotoHome("홍길동");
		
		System.out.println();
		
		_01_Company kim = _01_Company.getInstance();
		hong.gotoWork("김태희");
		hong.work("김태희");
		hong.gotoCafeteria("김태희");
		hong.gotoHome("김태희");
		
		System.out.println("--------------------");
		System.out.println(hong == kim);
		System.out.println(hong);	//ch10._01_Company@73035e27
		System.out.println(kim);	//ch10._01_Company@73035e27
	}
	
}
