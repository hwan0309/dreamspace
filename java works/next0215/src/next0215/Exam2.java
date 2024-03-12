package next0215;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int studentsNumber = 0;
		boolean r = true;
		int[]scores = null;
		while(r) {
		System.out.println("++++++++++++++++++++++++++++");
		System.out.print("1.학생수 |");
		System.out.print("2.점수입력 |");
		System.out.print("3.점수리스트 |");
		System.out.print("4.분석 |");
		System.out.println("5.종료");
		System.out.println("++++++++++++++++++++++++++++");
		
		int selectNo = Integer.parseInt(sc.nextLine());
		
		switch(selectNo) {
		case 1:
			System.out.println("학생수>");
			 studentsNumber = Integer.parseInt(sc.nextLine());
			scores = new int[studentsNumber];//학생수만큼 점수 배열을 만듬
			break;
			
		case 2:
			for(int i = 0; i<scores.length; i++) {
				 scores[i] = Integer.parseInt(sc.nextLine());
			} break;
			
		case 3:
			for(int i = 0; i<scores.length; i++) {
				System.out.println(scores[i]+',');
			}
			System.out.println(Arrays.toString(scores));
			break;
			
		case 4:
			int max = 0;
			int sum = 0;
			double avg = 0.0;
			for(int i = 0; i < scores.length; i++) {
				max = (max < scores[i])? scores[i] : max;
				sum += scores[i];
			}
			avg = (double) sum /studentsNumber;
			System.out.println(max);
			System.out.println(avg);
			break;
			
		case 5:
			r = false;
			break;
			default:
				r = false;	
		}
		}
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("프로그램 종료");
		System.out.println("++++++++++++++++++++++++++++");
	}

}
