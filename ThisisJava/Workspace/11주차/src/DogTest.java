class Animal {
	int age;
	void eat() {
		System.out.println("먹고 있음...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("짓고 있음...");
	}
}

public class DogTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
