package next0103;

public class AccuracyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apple =1;
		double onePeace = 0.1;
		int number = 7;
		
		double resultApple = apple - number * onePeace;
		System.out.println("사과 한개에서 남은 값은 : " + resultApple);
		
		int totalPeace = apple * 10;
		int resultApple2 = totalPeace - number;
		System.out.println("사과 열조각 중에 남은 값은 : " + resultApple2);
		System.out.println("사과 한개에서 남은 값은 : " + resultApple2/10.0);
		
		
	}

}
