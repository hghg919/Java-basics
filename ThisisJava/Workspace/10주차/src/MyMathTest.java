class Mymath {
	public static int abs(int x) {return x>0?x:-x;}
	public static int power(int base, int expronent) {
		int result = 1;
		for (int i = 1; i<= expronent; i++)
			result *= base;
		return result;
	}
}

public class MyMathTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("10의 3승은 " + Mymath.power(10,3));
		System.out.println("abs " + Mymath.abs(-9));
	}
}