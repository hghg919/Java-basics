import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		long fact = 1;
		int n;
		
		System.out.println("정수를 입력하시오");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for (int i = 1 ; i <= n ;i++) {
			fact = fact * i;	
		}
		System.out.printf("%d!은 %d입니다.\n", n, fact);
	}
}

