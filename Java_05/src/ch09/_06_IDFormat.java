package ch09;

// p540
public class _06_IDFormat {

	private String userID;
	
	public String getUserId() {
		return userID;
	}
	
	public void setUserId(String userId) throws _06_IDFormatException {
		if (userId == null) {
			throw new _06_IDFormatException("아이디는 null일 수 없습니다.");
		} else if (userId.length() < 8 || userId.length() > 20) {
			throw new _06_IDFormatException("아이디는 8~20자 사이로 입력해주세요");
		} else {
			this.userID = userId;
		}
	}
}
