package next0102;

public class CastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charVlaue = (char) intValue;
		System.out.println(charVlaue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		//최대값 3.1233122
		double doubleValue = 3.1233123123321312332;
		float floatValue = (float) doubleValue;
		intValue = (int) doubleValue;
		System.out.println(floatValue);
		System.out.println(intValue);
		//int max 21억
		System.out.println(Integer.MAX_VALUE);
		//int 값을 byte가 넘는 값(128 이상)을 주었을 때 변환 불가라고 출력
		int i = 127;
		if((i < Byte.MIN_VALUE)|| (i > Byte.MAX_VALUE)) {
			System.out.println("byte으로 변환할 수 없음");
		}else {
			byte b = (byte)i;
			System.out.println(b);
		}
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		int result = num1 - num2;
		System.out.println(result);
		
		float num3 = num2;
		num2 = (int) num3;
		result = num1 - num2;
		System.out.println(result);
	}

}
