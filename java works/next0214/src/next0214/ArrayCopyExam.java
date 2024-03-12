package next0214;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub, 
		//길이가 3인 배열을 생성
		String[] oldStrArr = {"Java", "Javascript", "Mysql"};
		//길이가 5인 배열을 생성
		String[] newStrArr = new String[5];
		
		//길이가 3인배열의 항목을 5인배열에 복사식
		//oldStrArr의 0번째부터 newStrArr의 0번째에 대입
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for(int i = 0; i < newStrArr.length; i++) {
			System.out.println(newStrArr[i]);
		}
	}

}
