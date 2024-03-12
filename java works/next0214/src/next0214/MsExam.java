package next0214;

public class MsExam {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("error");
			System.exit(0); //강제 종료
		}
		
		String snum1 = args[0];
		String snum2 = args[1];
		
		//Integer type으로 강제변환
		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		
		System.out.println(num1 + num2);

	}
}
