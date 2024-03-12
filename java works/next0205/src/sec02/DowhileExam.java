package sec02;

import java.util.Scanner;

public class DowhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력하시오.");
		System.out.println("프로그램을 종료하려면 q를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			
		}while( !inputString.equals("q"));
			System.out.println("power off");
	}

}


