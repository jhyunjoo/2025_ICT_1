package ch04;

public class _09_PhoneStoreMain {
	public static void main(String[] args) {
		
		// call by refrerence - 주소값에 의한 호출
		// cf) call by value - 값을 가지고 호출

		// 매개변수 생성자를 통한 값 전달
		System.out.println("----- 핸드폰 정보 -----");
		_09_Phone phone = new _09_Phone("아이폰", 1000000);
		phone.printInfo();
		// System.out.println(phone);
		
		System.out.println("----- 대리점 정보 -----");
		_09_PhoneStore store = new _09_PhoneStore(phone);
		store.printInfo();
		//System.out.println(store);
		
		System.out.println("----- 구매고객 정보 -----");
		_09_Customer customer = new _09_Customer("지현주", 1000000);
		customer.printInfo();
		//System.out.println(customer);
		System.out.println();
		customer.buyPhone(store);
	
		/*----- 핸드폰 정보 -----
		model : 아이폰
		가격 : 1000000.0
		----- 대리점 정보 -----
		phone : ch04._09_Phone@13221655
		----- 구매고객 정보 -----
		고객명 : 지현주
		예산 : 1000000.0

		대리점 : 요금제를 등록합니다. 약정을 등록합니다.
		대리점 : 프로모션을 할인합니다.
		대리점 : 데이터를 저장하고 새로운 폰으로 이동합니다.
		고객 : 핸드폰 구입이 완료되었습니다.
		*/
		
		/*----- 노트북 정보 (Notebook)-----
		model : 그램
		가격 : 2500000.0
		할인 : 0.01%
		----- 대리점 정보 (NotebookStore)-----
		phone : ch04._09_Phone@13221655
		----- 구매고객 정보 (Guest)-----
		고객명 : 지현주
		MyMoney : 2500000.0

		대리점 : 고객 정보 등록 : 모델명, 고객, 가격
		대리점 : 프로모션을 할인합니다. ___원에 구매
		고객 : 노트북 구입이 완료되었습니다.
		*/

	}

}
