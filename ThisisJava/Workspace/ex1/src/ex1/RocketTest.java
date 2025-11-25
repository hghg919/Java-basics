package ex1;
class Rocket{
	int x,y;
	public Rocket(int x, int y) {
		//super();
		this.x=x;
		this.y=y;
	}
	@Override	
	public String toString() {
		return "Rocket x: "+x+"y:"+y;
	}
	public void moveUP() {
		this.y+=1;
	}
}

public class RocketTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Rocket obj = new Rocket (0,0);
		obj.moveUP();
		obj.moveUP();
		obj.moveUP();
		System.out.println(obj);
	}

}
