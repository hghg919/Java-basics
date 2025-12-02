
package ex3;
class Cirlce{
	protected int radius;
	public Cirlce(int r) {
		this.radius=r;
	}
}
public class Pizza extends Cirlce{
	String topping;
	public Pizza(String topping, int r) {
		super(r);
		this.topping=topping;
	}
	public void print() {
		System.out.println("피자의 종류: "+topping+", 피자의 크기: "+radius);
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}

}
