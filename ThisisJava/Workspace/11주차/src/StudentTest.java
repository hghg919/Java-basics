class Person1{
	private String regnumber;
	private double weight;
	protected int age;
	String name;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight=weight;
	}

	public String getregnumber() {
		return regnumber;
	}

	public void setregnumber(String regnumber) {
		this.regnumber=regnumber;
	}
}

class Student extends Person1{
	int id;
}

public class StudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.setregnumber("1234");
		System.out.println(obj.getregnumber());
		obj.setWeight(75.0);
		System.out.println(obj.getWeight());
		obj.name="kim";
		obj.age=21;
		System.out.println(obj.name+","+obj.age);
	}
}

