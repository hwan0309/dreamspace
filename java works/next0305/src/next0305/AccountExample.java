package next0305;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		//get in
		account.deposit(10000);
		System.out.println("get in" + account.getBalance());
		
		//get out
		try {
			account.withdraw(30000);
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
