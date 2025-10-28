
public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	public String getName() { return name;}
	public void setName(String name) {this.name = name;}
	public int getBalnce() {return balance;}
	public void setBalance(int balance) { this.balance = balance;}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalnce() + "입니다.");
	}

}
