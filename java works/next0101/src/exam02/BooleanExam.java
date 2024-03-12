package exam02;

public class BooleanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = true;
		if(stop) {
			System.out.println("정지");
			
		}else {
			System.out.println("가자");
		}
		int x = 10;
		boolean result = (x == 20);
		System.out.println(result);
		
		result = (x != 20);  
		System.out.println(result);
	}

}
