package sec08;

public class Exam {

	public static void main(String[] args) {
		
		
		
		//2번
//		String grade = "B";
//		int score1 = 0;
//		switch (grade) {
//		case "A":
//		score1 = 100;
//		break;
//		case "B":
//		int result = 100 - 20;
//		score1 = result;
//		break;
//		default:
//		score1 = 60;

//		------> Expression(표현식)으로 변경
//		String grade = "B";
//		int score = switch(grade){
//		case "A" -> 100;
//		case "B" -> {
//			int result = 100 - 20;
//			yield result;
//		}
//		default ->60
//	};
											
//		//3번		
//		int sum = 0;
//		int i = 0;
//		for(i=0; i<100;i++) {
//			if(i%3 ==0) {
//				sum += i;
//				System.out.println("3의 배수 총 합은? :"
//						+ sum);
//			}
//			 }		
			
		//4번
//		while(true) {
//			int ju1 = (int)(Math.random()*6)+1;
//			int ju2 = (int)(Math.random()*6)+1;
//			System.out.println("주사위 합" + ju1 + "," + ju2);
//			if(ju1+ju2 == 5) {
//				break;
//			}
//		}
		
		//5번
//		for(int x=1; x<= 10; x++) {
//			for(int y =1; y<= 10; y++) {
//				if(4*x + 5*y == 60) {
//					System.out.println(x + "," + y);
//				}
//			}
//		}
		
		//6번
//		for(int x=1; x<=5; x++) {
//			for(int y=1; y<=x; y++) {
//				System.out.print("*");
//			}
//			System.out.println();		
//		}
		
		
	}

}
