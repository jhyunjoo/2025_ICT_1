package test;

public interface _11_Loan {
	// 상수 -  public static final 생략 상태
	int STATE_LOAN = 1;	// 대출상태
	int STATE_REPAY = 0;	// 상환상태

	// 추상메서드
	// public void loan(String loanNo, String productName, String borrower, String loanDate);		// 대출하다
	public void loan();			// 대출하다	
	public void repay();		// 상환하다

}
