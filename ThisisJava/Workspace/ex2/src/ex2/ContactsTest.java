package ex2;
import java.util.ArrayList;
import java.util.Scanner;

class Contacts{
	private String name;
	private String tel;
	private String email;
	static int count;
	
	public Contacts(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
		count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Contacts.count=count;
	}
}

public class ContactsTest {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		ArrayList<Contacts> list = new ArrayList<>();
		System.out.println("연락처를 입력하시오(종료 -1");
		while(true) {
			System.out.print("이름과 전화번호, 이메일을 입력하시오:");
			String name = sc.next();
			if(name.equals("-1")) break;
			String tel=sc.next();
			String email=sc.next();
			list.add(new Contacts(name, tel, email));
			
		}
		System.out.println("지인들의 수는 "+Contacts.count+"명입니다.");
		sc.nextLine();
		
		System.out.print("검색할 이름을 입력하시오: ");
		String name = sc.nextLine();
		
		for (Contacts c : list) {
			if(c.getName().equals(name))
				System.out.println(name+"의 전화번호: "+c.getTel()+" 이메일: "+ c.getEmail());
		}
	}
}
