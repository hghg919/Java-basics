
package ex2;
class BankAccount{
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance() {
		this.balance=balance;
	}
	//입금기능
	void deposit(int amount) {
		balance+=amount;
	}
	//출금기능
	void withdraw(int amount) {
		balance-=amount;
	}
	public BankAccount(int balance) {
		this.balance=balance;
	}
	//계좌이체
	public int transfer(int amount, BankAccount otherAccount) {
		otherAccount.deposit(amount);
		this.balance-=amount;
		return this.balance;
	}
	
	@Override
	public String toString() {
		return "BankAccount [balance="+balance+"]";
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		BankAccount a1 = new BankAccount(10000);
		BankAccount a2 = new BankAccount(0);
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2+"\n");
		a1.transfer(1000, a2);
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2);
	}

}
