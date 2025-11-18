class Parent {
	void print() {System.out.println("Parent 메소드 호출");}
}

class Child extends Parent {
	@Override void print() {System.out.println("Child 메소드 호출");}
}

public class Casting {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Parent p = new Child();
		p.print();
		
		Child c = (Child)p;
		c.print();
	}

}
