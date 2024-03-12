package sec06;

public class TestExam {

	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if(charCode >= 65) {
			System.out.println("charCode는 대문자 입니다.");
		}else {
			System.out.println("charCode는 대문자가 아닙니다.");
		}
		if(charCode > 97 && charCode < 122) {
			System.out.println("charCode는 소문자 입니다.");
		}else {
			System.out.println("charCode는 소문자가 아닙니다.");
		}
		if(charCode > 48 && charCode < 97) {
			System.out.println("charCode는 숫자 입니다.");
		}else {
			System.out.println("charCode는 숫자가 아닙니다.");
		}
		

	}

}
