package next0222;

public class Exam {

	//no.1
//	private static class Printer{}
//
//public static void main(String[] args) {
//	Printer printer = new Printer();
//	System.out.println("10");
//	System.out.println("true");
//	System.out.println("5.7");
//	System.out.println("홍길동");
//}
	
//	//no.2
//	private static Exam exam = new Exam();
//	private Exam() {}
//	String str = "ShopService";
//	public static Exam getInstance() {
//		return exam;
//	}
	
	//no.3
	private int blance;
	private int MIN_BLANCE;
	private int MAX_BLANCE;
	
	public int blance() {
		return blance;
	}

	public int getBlance() {
		return blance;
	}
	 
	public void setBlance(int blance) {
		if(blance >= 0) {
			this.blance = 0;
			MIN_BLANCE = this.blance;
			
		}if(blance <= 1000000) {
			this.blance = 0;
			MAX_BLANCE = this.blance;
			
		}else {			
		this.blance = blance;
		}
		
		}
	}
	

	
	
	
	
	
	
	
}
