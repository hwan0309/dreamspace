package sec10;

public class NullPointerExam {

	public static void main(String[] args) {
		
		int[] num = null;
		//num[0] = 20;
		String str = null;	//null일때는 어떻게 해야할까		
		System.out.println("총 문자의 수는" + str.length() + "입니다.");
		
		String str2= "Hong";
		str2 = "kim";
		str2 = null;
		
	}

}
