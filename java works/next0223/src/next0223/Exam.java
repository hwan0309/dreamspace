package next0223;

public class Exam {

	public static void main(String[] args) {

		//no.17
//		public class ShopService {
//		    private static ShopService instance = new ShopService();  // Singleton instance
//		    
//		    private ShopService() {}  // Private constructor to prevent instantiation
//		    
//		    public static ShopService getInstance() {
//		        return instance;
//		    }
//
//		    public static void main(String[] args) {
//		        Printer.println(10);
//		        Printer.println(true);
//		        Printer.println(5.7);
//		        Printer.println("홍길동");
//
//		        ShopService obj1 = ShopService.getInstance();
//		        ShopService obj2 = ShopService.getInstance();
//
//		        if (obj1 == obj2) {
//		            System.out.println("같은 ShopService 객체입니다.");
//		        } else {
//		            System.out.println("다른 ShopService 객체입니다.");
//		        }
//		    }
//		}

		//no.18
//		public class Account {
//		    private static final int MIN_BALANCE = 0;
//		    private static final int MAX_BALANCE = 1000000;
//
//		    private int balance;
//
//		    public void setBalance(int amount) {
//		        if (amount >= MIN_BALANCE &&
//		        		amount <= MAX_BALANCE) {
//		            this.balance = amount;
//		        }
//		    }
//
//		    public int getBalance() {
//		        return balance;
//		    }
//
//		    public static void main(String[] args) {
//		        Account account = new Account();
//		        
//		        account.setBalance(10000);
//		        System.out.println("현재 잔고: " + account.getBalance()); // 현재 잔고: 10000
//		        
//		        account.setBalance(-100);
//		        System.out.println("현재 잔고: " + account.getBalance()); // 현재 잔고: 10000
//		        
//		        account.setBalance(2000000);
//		        System.out.println("현재 잔고: " + account.getBalance()); // 현재 잔고: 10000
//		        
//		        account.setBalance(300000);
//		        System.out.println("현재 잔고: " + account.getBalance()); // 현재 잔고: 300000
//		    }
//		}


		
	}

}
