package sec02;

public class IfClockExam {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*4)+1;
		
		
		switch(num) {
		case 1:
		System.out.println("8시에 출근합니다");
		break;
		
		case 2:
			System.out.println("9시에 회의를 합니다.");
			break;
			
		case 3:
			System.out.println("10시에 업물르 시작합니다.");
			break;
			
		case 4:
			System.out.println("11시에 외근을 나갑니다.");
			break;
	}
	}

}
