package test;

public class _15_Password {

	private String password;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws _15_PasswordFormatException{
		if(password == null) {
			throw new _15_PasswordFormatException("password null 입력 불가");
		} else if (password.length() < 10 || password.length() > 20) {
			throw new _15_PasswordFormatException("password는 10자 이상 20자 이하로 입력하세요.");
		} else {
			this.password = password;
		}
 	}
	
}
