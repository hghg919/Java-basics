package ex2;
class MyMetric{
	//Static으로 선언된 메소드에서는 static으로 선언된 필드만 접근 가능.
	 private static double distance;
	 
	 public static double kiloToMile(double d) {
		 distance=d/1.6093;
		 return distance;
	 }
	 
	 public static double mileToKilo(double d) {
		 distance=d*1.6093;
		 return distance;
	 }
}

public class MyMetricTest {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		double d = MyMetric.kiloToMile(1);
		System.out.println("1km를 마일로 바꾸면"+d);
		double e = MyMetric.mileToKilo(1);
		System.out.println("1마일을 km로 바꾸면"+e);
	}
}
