package ex1;
class Date{
	int year;
	int month;
	int day;
	
	public Date(int year, int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public void print1() {
		System.out.println(" "+year+"."+month+"."+day);
	}
	public void print2() {
		System.out.println(" "+month+"."+day+", "+year);
	}
}

public class DateTest {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Date obj=new Date(2022, 9, 5);
		obj.print1();
	}	
}
