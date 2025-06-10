package test;

//자식클래스 - 부모클래스 상속받고 인터페이스 구현
public class _11_MyLoanInfo extends _11_LoanInfo implements _11_Loan {
	// 멤버변수
	private String borrower;	// 대출자 "홍길동"
	private String loanDate;	// 대출일자 "2025-06-05"
	private int state;			// 대출여부 STATE_REPAY = 0;	// 상환상태

	// 디폴트 생성자
	public _11_MyLoanInfo() {}

	// 매개변수 생성자
	public _11_MyLoanInfo(String bankName,String accountNumber,String loanNo, String productName,String borrower, String loanDate, int state) {
		super(bankName, accountNumber, loanNo, productName);
		this.borrower = borrower;
		this.loanDate = loanDate;
		this.state = state;
	}

	// 대출하다
	@Override
	//public void loan(String loanNo, String productName, String borrower, String loanDate) {		// 대출하다
	public void loan() {		// 대출하다

		if (state == STATE_LOAN) {	// 인터페이스명 생략 가능 (포함하고 있기 때문)
			System.out.println("대출하실 수 없습니다.");
		} else {
			System.out.println("대출되었습니다.");
			System.out.println("대출은행 : " + super.bankName);
			System.out.println("대출계좌 : " + super.accountNumber);
			System.out.println("대출번호 : " + loanNo);			// 부모 멤버변수 접근제어자가 protected 일 때
			System.out.println("대출상품 : " + super.productName); // 부모 멤버변수 접근제어자가 protected 일 때
			System.out.println("대출자 : " + borrower);
			System.out.println("대출일 : " + loanDate);
			// state = 1;
			state = STATE_LOAN;
		}
	}

	// 상환하다
	@Override
	public void repay() {
		if(state == STATE_REPAY) { // 0
			System.out.println("이미 상환된 상태입니다.");
		} else {
			System.out.println("상환되었습니다.");
			System.out.println("대출은행 : " + super.getBankName());
			System.out.println("대출계좌 : " + super.getAccountNumber());
			System.out.println("대출번호 : " + super.getLoanNo());	// 부모 멤버변수 접근제어자가 private 일 때
			System.out.println("대출상품 : " + getProductName());	// 부모 멤버변수 접근제어자가 private 일 때
			System.out.println("대출자 : " + borrower);
			System.out.println("대출일 : " + loanDate);
			// state = 0;
			state =STATE_REPAY;
		}
	}

}

