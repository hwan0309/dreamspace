package next0214;

public class AdvancedForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {95, 71, 35, 69, 77, 88, 15};
		
		//배열의 합
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;		
		}
		System.out.println(sum);
		
		//평균값  (소숫점 자리까지 나오게 하기위해 double type로 강제 변환)
		double avg = (double) sum / scores.length;
		System.out.println(avg);
	}

}
