
public class BitOperator2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int x = 0b00001101;  // 13
		int y = 0b00001010;  // 10
		System.out.print("x&y=" + (x & y) + "   ");
		System.out.print("x|y=" + (x | y) + "   ");
		System.out.print("x^y=" + (x ^ y) + "   ");
		System.out.print("~x=" + (~x) + "   ");
		System.out.print("x>>1=" + (x>>1) + "   ");
		System.out.print("x<<1=" + (x<<1) + "   ");
		System.out.print("x>>>1=" + (x>>>1));
	}

}
