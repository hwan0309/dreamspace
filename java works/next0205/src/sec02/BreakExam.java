package sec02;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int num =(int)(Math.random()*6) +1;		//random 으로 6까지 나오는 것 0부터 시작이기에 +1 입력
		System.out.println("컴퓨터가 선택한 주사위 값을 알아맞춰보시오");
		int userNum = sc.nextInt();
		if(num == userNum) {
			System.out.println("정답입니다.");
			break;	//정답이면 break를 통해 프로그램 종료
	}
	}
		System.out.println("프로그램 종료");
		sc.close();
	}	
}
