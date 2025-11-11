import java.util.ArrayList;
class Person {
	String name;
	String tel;
	
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
};

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", "012345678"));
		list.add(new Person("김유신", "012345679"));
		list.add(new Person("최지영", "012345680"));
		list.add(new Person("김영희", "012345681"));
		
		for (Person obj : list)	
			System.out.println("(" + obj.name + "," + obj.tel + ")");
	}

}
