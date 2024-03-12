package next0305;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
		public void deposit(int money) {
			balance += money;
		}
		public void withdraw(int money) throws InsufficientException{
			if(balance < money) {
				throw new InsufficientException("no money: " +(money-balance)+ " un full");
			}
			balance -= money;
		}
}
