package test;

public class _11_LoanMain {
	
	public static void main(String[] args) {
		// 자식매개변수 생성자를 통한 값 전달(대출번호,상품명,대출여부)
		//_11_MyLoanInfo hong = new _11_MyLoanInfo("P001","청년취업지원","홍길동", "2025-06-05", _11_Loan.STATE_REPAY);	// 0
		// 다형성 적용
		_11_Loan hong = new _11_MyLoanInfo("신한은행","110-469-544324","P001","청년취업지원","홍길동", "2025-06-05", _11_Loan.STATE_REPAY);
		
		// loan() 호출시점에 값 전달(대출자, 대출일자)
		// 대출상태 판단은 상수를 이용
		System.out.println("=== 대출시 ===");
		hong.loan();
		
		System.out.println("=== 이미 대출된 상태인데 대출시도할때 ===");
		hong.loan();
		
		System.out.println("=== 대출 상환시 ===");
		hong.repay();
		
		System.out.println("=== 이미 상환된 상태일때 대출 상환시 ===");
		hong.repay();
	}

}
