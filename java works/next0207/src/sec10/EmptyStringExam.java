package sec10;

import java.util.Scanner;

public class EmptyStringExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호의 뒷자리 한자리를 입력해주시오");
		
		int num = Integer.parseInt("");
		if(num == 1) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
		
	}

}
