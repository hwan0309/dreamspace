package next0103;

public class OverflowUnderflowExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1 = 125;
		for(int i = 0; i < 5; i++) {
			var1++;
			System.out.println("var1 : " + var1);
		}
		System.out.println("----------------------");
		byte var2 = -125;
		for(int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2 : " + var2);
		}
		System.out.println("----------------------");
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
