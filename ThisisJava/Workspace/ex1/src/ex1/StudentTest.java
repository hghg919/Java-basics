package ex1;
import java.util.Scanner;
class Student{
	String name;
	private String rollno;
	int age;
	
	public Student(String name, String rollno, int age) {
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
	
	public String getRollno() {
		return rollno;
	}
	
	public void setRollno(String rollno) {
		this.rollno=rollno;
	}
	
	@Override
	public String toString() {
		return "Student 객체가 생성되었습니다.";
	}
}

public class StudentTest {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc=new Scanner(System.in);
		System.out.print("학생의 이름: ");
		String name=sc.next();
		System.out.print("학생의 학번: ");
		String id=sc.next();
		System.out.print("학생의 나이: ");
		int age=sc.nextInt();
		Student obj=new Student(name,id,age);
		System.out.println(obj);
	}
}
