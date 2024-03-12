package udemy;

class Amount{
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount that) {
		if(!this.currency.equals(that.currency)) {
		throw new RuntimeException("Currencies Don't Match" + this.currency + "*" + that.currency);
		}
		this.amount = this.amount + that.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
	
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws Exception {
		Amount amount1 = new Amount("USD",10);
		Amount amount2 = new Amount("USD",20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
