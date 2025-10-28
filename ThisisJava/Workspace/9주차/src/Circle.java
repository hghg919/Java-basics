class Circle1{
	int radius;
	
	public Circle1(int radius) {
		this.radius = radius;
	}
	public Circle1() {
		this(0);
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
}

public class Circle {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Circle1 area = new Circle1();
		System.out.print(area.getArea());
	}

}
