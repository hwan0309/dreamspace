package exam01;

public class FloatDoubleexam {

	public static void main(String[] args) {
			
		double var1 = 3.14;
		float var2 = 3.14f;
		//float var3 = 3.14;  comfile error
		
		//정밀도 테스트
		double var4 = 0.12345678901234567891111111;
		float var5 = 0.1234567890123456789f;
		
		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);
		
		int var6 = 4000000;  //4e6 와 같이 표혈할 때는 실수 타입으로 저장해야한다.
		double var7 = 4e6;
		float var8 = 4e6f;
		double var9 = 2e-3;
		
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8);
		System.out.println("var9:" + var9);
		
		
		
	}

}
