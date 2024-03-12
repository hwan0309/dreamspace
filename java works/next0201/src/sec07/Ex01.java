package sec07;

public class Ex01 {

	public static void main(String[] args) {

//
//	int num1 = 772;
//	
//	String str = Integer.toBinaryString(num1);
//	System.out.println(num1);
//	
//	int rs1 = num1 >>> 24;
//	System.out.println(rs1);
//	
//	int rs2 = num1 >>> 16;
//	System.out.println(rs2);
//	
//	int rs3 = num1 >>> 8;
//	System.out.println(rs3);
	
	
	int val = 772;
	String strVal = Integer.toBinaryString(val);
	while(strVal.length() < 32) {
		strVal = "0" + strVal;
	}
	System.out.println(strVal);
	
	byte byte1 = (byte) (val >>> 24);
	
	byte byte2 = (byte) (val >>> 16);
	
	byte byte3 = (byte) (val >>> 8);
	
	byte byte4 = (byte) val;
	
	System.out.println(byte1);
	System.out.println(byte2);
	System.out.println(byte3);
	System.out.println(byte4);
	}
	
	
}
