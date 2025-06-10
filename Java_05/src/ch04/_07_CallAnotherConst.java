package ch04;

// p178
class Person {
	
	String name;
	int age;
	
	Person() {
		this("현주", 23);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class _07_CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
