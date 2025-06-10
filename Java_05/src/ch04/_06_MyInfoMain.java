package ch04;

public class _06_MyInfoMain {
	public static void main(String[] args) {
		
		// 방법1. 디폴트 생성자 + setter
		_06_MyInfo my = new _06_MyInfo();
		
		my.setName("지현주");
		my.setAge(23);
		my.setAddress("성동구");
		my.setEmail("hyunj02@gmail.com");
		my.setDream("고양이랑 살기");
		
		my.printInfo();
		
		System.out.println();
		
		// 방법2. 매개변수 생성자
		
		_06_MyInfo my2 = new _06_MyInfo("현주",23,"서울시","nya1101@gmail.com","로또1등");
		my2.printInfo();
		
	}

}
