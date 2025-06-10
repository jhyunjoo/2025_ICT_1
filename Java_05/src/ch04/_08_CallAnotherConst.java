package ch04;

// p179
class Person2 {
	String name;
	int age;
	
	Person2() {
		this("지현주",23);
	}
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person2 returnItSelf() {
		return this;
	}
}

public class _08_CallAnotherConst {
	public static void main(String[] atgs) {
		Person2 person2 = new Person2();
		System.out.println(person2.name);
		System.out.println(person2.age);
		
		Person2 p = person2.returnItSelf();
		System.out.println(person2);
		System.out.println(p);
	}

}
