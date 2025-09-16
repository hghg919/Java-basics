import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		System.out.print("첫 번째 숫자를 입력하시오: ");
		x = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum);
	}

}
