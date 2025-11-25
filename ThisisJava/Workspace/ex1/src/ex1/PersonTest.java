package ex1;
class Person{
	private String name;
	private String mobile;
	private String office;
	private String email;

	public Person(String n,String m, String o,String e ) {
		this.name=n;
		this.mobile=m;
		this.office=o;
		this.email=e;
	}

	@Override
	public String toString() {
		return "[Person name :"+name+" mobile: "
	+mobile+" office : "+office+" email : "+email+"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile=mobile;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office=office;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email=email;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj= new Person("Kim","01012341234","05112341234","knu@knu.ac.kr");
		System.out.println(obj);
	}
}
