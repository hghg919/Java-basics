class Shape3 {
	protected int x,y;
	public void draw2() {System.out.println("Shape Draw");}
}

class Rectangle2 extends Shape3 {
	private int width, height;
	public void draw2() {System.out.println("Rectangle Draw");}
}

class Triangle2 extends Shape3 {
	private int base, height;
	public void draw2() {System.out.println("Triangle Draw");}
}

class Circle2 extends Shape3 {
	private int radius;
	public void draw2() {System.out.println("Circle Draw");}
}

public class ShapeTest2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Shape3 s1, s2;
		
		s1 = new Shape3();
		s2 = new Rectangle2();
		
		s1.draw2(); // s1 객체의 draw2() 메소드 호출
		s2.draw2(); // s2 객체의 draw2() 메소드 호출
	}

}
