package ch06;

// p268
public class _05_AnimalMain {
	
	public static void main(String[] args) {
		//_05_AnimalMain animal = new _05_AnimalMain();
		
		// 다형성
		// 부모클래스 참조변수 = new 자식클래스();
		// moveAnimal(new _05_Animal()); 		// _05_Animal animal = new _05_Animal();
		moveAnimal(new _05_Human());		// _05_Animal animal = new _05_Human();
		moveAnimal(new _05_Tiger());		// _05_Animal animal = new _05_Tiger();
		moveAnimal(new _05_Eagle());		// _05_Animal animal = new _05_Eagle();
	} // main
	
	// 매개변수에 다형성 적용(즉 부모타입으로 받음)
	public static void moveAnimal(_05_Animal animal) {	
		animal.move();		// 자료형이 부모클래스 타입이어도 재정의된 자식메서드가 호출
		if(animal instanceof _05_Human) {			// instanceof : animal이 _05_Human의 객체이면
			_05_Human human = (_05_Human)animal;	// 다운캐스팅
			human.readBook();
		} else if (animal instanceof _05_Tiger) {
			_05_Tiger tiger = (_05_Tiger)animal;
			tiger.hunting();
		} else if (animal instanceof _05_Eagle){
			_05_Eagle eagle = (_05_Eagle)animal;
			eagle.flying();
		} else {
			// 부모 animal
		}
		
	}
	
	/* 호출한 갯수만큼 각 자식타입으로 받는 메서드를 만들어야함
	 * public static void moveAnimal(_05_Human human) {	// _05_Human animal = new _05_Human();
		animal.move();
	}
	
	public static void moveAnimal(_05_Tiger tiger) {	// _05_Tiger animal = new _05_Tiger();
		animal.move();
	}

	public static void moveAnimal(_05_Eagle eagle) {	// _05_Eagle animal = new _05_Eagle();
		animal.move();
	}
	*/
}
