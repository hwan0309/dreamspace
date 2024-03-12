package sec10;

public class SearchExam {

	public static void main(String[] args) {
		
		String str = "java programing";
		int rs = str.indexOf("programing"); //index number or return -1  int로 받아야함
		if(rs > -1) {
			System.out.println("programing book");
		}else {
			System.out.println("south koera");
		}
		
		boolean rs2 = str.contains("java");
		if(rs2) {
			System.out.println("programing books");
		}else {
			System.out.println("south koeras");
		}
	}

}
