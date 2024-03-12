package exam01;

public class Intexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//byte 타입
		byte num1 = -128;
		byte num2 = -30;
		byte num3 = 0;
		byte num4 = 30;
		byte num5 = 127;
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num4);
	System.out.println(num5);
	
	//char 타입
	char c1 = 'A'; //문자를 직접 저장
	char c2 = 65;  //10진수로 저장
	char c3 = '\u0000';	//16진수로 저장
	char c4 = '가';
	char c5 = 44032;	// '가'의 유니코드 값
	char c6 = '\uac00'; //'가'의 유니코드 값 
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	}

}
