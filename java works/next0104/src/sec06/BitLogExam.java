package sec06;

public class BitLogExam {

	public static void main(String[] args) {
		 
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("---------------------");
		
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + "(십진수 " + v1);
		System.out.println(toBinaryString(v1) + "(십진수 " + v2);
		System.out.println(toBinaryString(v1) + "(십진수 " + v3);
	}
		
		
		public static String toBinaryString(int num) {
			String str = Integer.toBinaryString(num);  //정수를 2진 문자열로 변환해주는 매소드
			while(str.length() < 32) {
				str = "0" + str;
			}
			return str;
			
		}
}

