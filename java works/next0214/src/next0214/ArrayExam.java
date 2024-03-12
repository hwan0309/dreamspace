package next0214;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] members = new String[2];
		
		members[0] = "철수";
		members[1] = "영희";
		
		for(int i = 0; i < 2; i++) {
			System.out.println("멤버명단 :" + members[i]);
		}
		
		members[2] = "순이";		
		members[3] = "민수";
		//컴파일 오류 이미 new String에 2개 배열만 넣을 수 있게 입력했기때문에
		for(int i = 0; i < 2; i++) {
			System.out.println("멤버명단 :" + members[i]); 	
		
		}		
		
	}
}
