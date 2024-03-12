package sec07;

public class BitShiftExam {

	public static void main(String[] args) {
		
		int num1 = 1;
		int rs1 = num1 << 3;
		int rs2 = num1 * (int) Math.pow(2, 3);
		System.out.println(rs1);
		System.out.println(rs2);
		
		int num2 = -8;
		int rs3 = num2 >> 3;
		int rs4 = (int) (num2 / Math.pow(2, 3));
		
		System.out.println(rs3);
		System.out.println(rs4);
		
		
	}

}
