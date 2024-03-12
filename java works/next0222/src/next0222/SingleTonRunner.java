package next0222;

public class SingleTonRunner {

	public static void main(String[] args) {
		
		
			SingleTon obj1 = singleton.getInstance();
			SingleTon obj2 = singleton.getInstance();
			
			
				if(obj1 == obj2) {
					System.out.println("true");
				}else {
					System.out.println("false");
				
			}	
	}
}
