package ex1;
class Dog{
	private String name;
	public String breed;
	private int age;
	
	public Dog(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Dog(String name, String breed, int age) {
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	
	@Override
	public String toString() {
		return name + ", " +age+", "+breed; 
	}
	public void barking() {
		System.out.println("멍멍!");
	}
}

public class Dogtest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Dog obj = new Dog("york","orange",1);
		System.out.println(obj);
		obj.barking();
	}

}
