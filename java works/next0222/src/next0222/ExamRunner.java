package next0222;

public class ExamRunner {

	public static void main(String[] args) {
		
		//no.2
//		Exam obj1 = Exam.getInstance();
//		Exam obj2 = Exam.getInstance();
//		
//		if(obj1 == obj2) {
//			System.out.println("same to obj shopservice");
//		}else {
//			System.out.println("do not same to obj shopservice");
//		}
		
		
		Exam exam = new Exam();
	
		exam.setBlance(10000);
		System.out.println("현재잔고 : " + exam.getBlance());
		
		exam.setBlance(-100);
		System.out.println("현재잔고 : " + exam.getBlance());
		
		exam.setBlance(2000000);
		System.out.println("현재잔고 : " + exam.getBlance());
		
		exam.setBlance(3000000);
		System.out.println("현재잔고 : " + exam.getBlance());
		
		
	}

}
