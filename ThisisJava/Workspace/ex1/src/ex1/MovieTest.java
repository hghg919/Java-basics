package ex1;
import java.util.Scanner;
class Movie{
	String title;
	double rating;
	String directer;
	String actor;
	int year;
	
	public Movie(String title, String directer, int year, String actor ,double rating) {
		this.title=title;
		this.rating=rating;
		this.directer=directer;
		this.actor=actor;
		this.year=year;
	}
	
	@Override
	public String toString() {
		return "제목: "+title+"\n"+"감독: "+directer+"\n"+"연도: "+year+"\n"+"주연배우: "+actor+"\n"+"평점: "+rating;
	}
}

public class MovieTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("영화 제목: ");
		String t=sc.nextLine();
		System.out.print("영화 감독: ");
		String d=sc.nextLine();
		System.out.print("영화 연도: ");
		int y=sc.nextInt();
		sc.nextLine();
		System.out.print("영화 주연 배우: ");
		String a=sc.nextLine();
		System.out.print("영화 평점: ");
		double r=sc.nextDouble();
		Movie obj = new Movie(t,d,y,a,r);
		System.out.println(obj);
	}

}
