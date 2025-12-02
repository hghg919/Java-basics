package ex2;
class Circle22{
	int radius;
	@Override
	public String toString() {
		return "Circle[radius="+radius+"]";
	}
	public Circle22(int d) {
		this.radius=d;
	}
}

public class Test22 {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Circle22[] list = new Circle22[3];
		for (int i =0;i<3;i++) {
			list[i] = new Circle22((int)(Math.random()*100));
		}
		for(int i =0;i<3;i++) {
			System.out.println(list[i]);
		}
	}
}