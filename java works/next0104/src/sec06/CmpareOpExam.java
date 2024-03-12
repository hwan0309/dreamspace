package sec06;

public class CmpareOpExam {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean rs1 = num1 == num2;
		boolean rs2 = num1 != num2;
		boolean rs3 = num1 <= num2;
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);	
		System.out.println("----------------------");
		char chara = 'A';
		char charb = 'B';
		boolean rs4 = chara < charb;
		System.out.println("rs4 " + rs4);
		System.out.println("----------------------");
		
		int num3 = 1;
		byte num4 = (byte) 1.0;
		boolean rs5 = num3 == num4;
		System.out.println("rs5: " + rs5);
		System.out.println("----------------------");
				
		String str1 = "자바";
		String str2 = "java";
		boolean rs6 = str1 == str2; 
		boolean rs8 = str1.equals(str2); //문자열은 equals로 연산해주는게 좋음 ==는 에러가 날 수 있기때문
		boolean rs7 = str1 != str2;
		System.out.println("rs6: " + rs6);
		System.out.println("rs7: " + rs7);
		System.out.println("rs8: " + rs8);
		System.out.println("----------------------");
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";// Var1 Var2는 같은 영역에 생성
		String strVar3 = new String("홍길동");//새로운 영역에 만들기 때문에 위에 Var1 Var2와 다른 영역
		
		boolean str3 = strVar1 == strVar2;
		boolean str4 = strVar1 == strVar3;
		boolean str5 = strVar1.equals(strVar3);
		System.out.println("str3: " + str3);
		System.out.println("str4: " + str4);
		System.out.println("str5: " + str5);
		
		
		
	}

}
