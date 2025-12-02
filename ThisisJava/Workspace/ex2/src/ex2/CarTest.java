package ex2;
class Car{
	private String model;
	private String make;
	private static int numberOfCars;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make=make;
	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	public static void setNumberOfCars(int numberOfCars) {
		//static변수는 객체의 변수가 아니라 클래스의 변수임.
		Car.numberOfCars=numberOfCars;
	}
	public Car(String model, String make) {
		this.model=model;
		this.make=make;
		numberOfCars++;
		System.out.println("자동차1대 생성됨, 누적 생산량="+numberOfCars+"대");
	}
}
public class CarTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Car S1=new Car("3Series","Benz");
		Car S2=new Car("3Series","Benz");
		Car S3=new Car("3Series","Benz");
		String m = S1.getModel();
		System.out.println(m);
	}

}
