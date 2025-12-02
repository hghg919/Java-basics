package ex2;
class Circle{
	private int x,y,radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getRadius() {
		return radius;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
//	public void move(Circle c, int dx, int dy) {
//		c.x += dx;
//		c.y += dy;
//	}
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	@Override
	public String toString() {
		return "Circle [x="+x+", y="+y+",radius="+radius+"]";
	}
}

public class CircleTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Circle c = new Circle(10,10,5);
		System.out.println(c+"\n");
		c.move(10,20);
		System.out.println("move() 호출 후");
		System.out.println(c);
	}

}
