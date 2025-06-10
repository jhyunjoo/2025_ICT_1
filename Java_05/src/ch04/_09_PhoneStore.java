package ch04;

// 대리점 클래스
public class _09_PhoneStore {

	// 멤버변수 - 폰 정보가 필요하므로 phone 정보가 들어있는 클래스를 가져옴
	private _09_Phone phone;	// 멤버변수(model,price) 정보를 들고옴
								// 핸드폰 객체 - 아이폰, 1000000
	// 디폴트 생성자
	public _09_PhoneStore() {}
	
	// 매개변수 생성자
	public _09_PhoneStore(_09_Phone phone) {	// = new _09_Phone("아이폰", 1000000)
		this.phone = phone;
	}
	
	// 핸드폰 판매
	public _09_Phone sellPhone(String model, double budget) {
		String phoneModel = phone.getModel();	// 대리점 모델 
		
		// 고객이 원하는 모델 == 대리점 모델 && 예산 >= 핸드폰가격
		if (model.equals(phoneModel) && budget >= phone.getPrice()) {
			// 요금제 등록
			registerPayment();
			// 프로모션 할인
			discountPromotion();
			// 데이터 저장
			saveData();
			return phone;
		} else {
			return null;
		}
	} // sellPhone
	
	// 요금제 등록
	private void registerPayment() {
		System.out.println("대리점 : 요금제를 등록합니다. 약정을 등록합니다.");
	}
	
	// 프로모션 할인
	private void discountPromotion() {
		System.out.println("대리점 : 프로모션을 할인합니다.");
	}
	
	// 데이터 저장
	private void saveData() {
		System.out.println("대리점 : 데이터를 저장하고 새로운 폰으로 이동합니다.");
	}
	
	
	// printInfo()
	public void printInfo() {
		System.out.println("phone : " +  phone);
	}
}
