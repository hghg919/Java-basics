class a{
	int width, height, depth;
	public a(int w, int h, int d) {
		width =w;
		height=h;
		depth=d;
	}
}

public class BoxTest1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		a b = new a(1,2,3);
		System.out.println("상자의 크기: (" + b.width + "," + b.height + "," + b.depth + ")");
	}

}
