public class Telvevision {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Telvevision(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel + "이고 불륨은 " + volume + "입니다.");		}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Telvevision myTv = new Telvevision(7,10,true);
		myTv.print();
		
		Telvevision yourTv = new Telvevision(11,20,true);
		yourTv.print();
	}

}
