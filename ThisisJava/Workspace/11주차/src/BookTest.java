import java.util.ArrayList;
import java.util.Scanner;

class Book {
	private String title;
	private int score;

	public String getTitle() { return title; }        // (1)
	public void setTitle(String title) { 
	 
		this.title = title; }   // (2)

	public int getScore() { return score; }           // (3)
	public void setScore(int score) { 
	   // 잘못된 점수값 방지 로직 추가
		if(score<0||score>100) {
			System.out.println("잘못된 점수 값입니다.(0~100만 허용");
		}
		this.score = score; }      // (4)

	static int count;

	@Override
	public String toString() {
		return "Book [title=" + title + ", score=" + score + "]";
	}

	public Book(String title, int score) {
		this.title = title;        // (5)
		this.score = score;        // (6)
		count++;
	}
}

public class BookTest {
    public static void main(String[] args) {
    	ArrayList<Book> list = new ArrayList<>();
    	Scanner sc = new Scanner(System.in);

    	while(true) {
	    	System.out.println("============================");
	    	System.out.println("1. 책 추가");
	    	System.out.println("2. 책 검색");
	    	System.out.println("3. 전체 책 출력");
	    	System.out.println("4. 종료");
	    	System.out.println("============================");
	    	System.out.print("메뉴를 선택하세요:");
	    	int menu = sc.nextInt();   // 메뉴 입력
	    	sc.nextLine();             // 버퍼 비우기

	    	switch (menu) {
		    	case 1:
		        	System.out.print("책 제목:");
		        	String title = sc.nextLine();
		        	System.out.print("책 점수:");
		        	int score = sc.nextInt();   // (7)
		        	list.add(new Book(title, score)); // (8) (9)
		    		break;

		    	case 2:
		        	System.out.print("검색할 책 제목:");
		        	String title2 = sc.nextLine();
		        	for(Book e: list) {
		        		if( e.getTitle().equals(title2)) {  // (10)
		                	System.out.println(e);
		        		}
		        	}
		    		break;

		    	case 3:
		        	for(Book e: list) {
		                	System.out.println(e); // (11)
		        	}
		    		break;

		    	case 4:
		    		return;  // (12)
	    	}
    	}
    }
}
