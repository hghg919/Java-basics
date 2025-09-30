import java.util.*;

public class rps {
	final int SICSSOR = 0;
	final int ROOK = 1;
	final int PAPER = 2;
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user = sc.nextInt();
		
		int computer = (int) (Math.random() * 3);
		if (user == computer )
			System.out.println("인간과 컴퓨터가 비겼음");
		else if (user == (computer + 1) % 3)
			System.out.println("인간: " +user+ " 컴퓨터: " + computer +" 인간승리");
		else
			System.out.println("인간: " +user+ " 컴퓨터: " + computer +" 컴퓨터 승리");
	}

}
