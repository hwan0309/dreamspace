package next0307;

public class MethodExam {

	public static void main(String[] args) {
		try {
		int value = Integer.parseInt("loo");
	}catch(NumberFormatException e) {
		System.out.println("error");
		System.out.println(e.getMessage());
	}
	}
}
