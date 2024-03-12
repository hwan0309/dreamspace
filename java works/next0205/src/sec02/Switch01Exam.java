package sec02;

public class Switch01Exam {

	public static void main(String[] args) {	
		char grade = 'B';
		switch(grade) {
		case 'A':	//break걸지 않고 A,a 확인
		case 'a':
			System.out.println("우수한 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;			
		default:
			System.out.println("손님입니다.");
		}
	
		}
		
		
	}


