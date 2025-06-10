package test;

//부모클래스
public class _11_LoanInfo {
	// 멤버변수
	protected String bankName;		// 은행명
	protected String accountNumber;	// 계좌번호	
	protected String loanNo;	// 대출번호 "P001"
	protected String productName;	// 대출상품명 "청년취업지원"

	// 디폴트생성자
	public _11_LoanInfo() {}

	// 매개변수 생성자
	public _11_LoanInfo(String bankName, String accountNumber,String loanNo, String productName) {
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.loanNo = loanNo;
		this.productName = productName;
	}

	// 멤버메서드
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
}
