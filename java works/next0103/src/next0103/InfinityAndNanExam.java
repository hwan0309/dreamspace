package next0103;

import java.util.Scanner;

public class InfinityAndNanExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 값의 숫자를 입력하시오.");
		int x = sc.nextInt();
		
		

		System.out.println("y의 값으 숫자를 입력하시오.");
		double y = sc.nextDouble();
		double z = x/y;
//		System.out.println(z);
		
		//예외처리
		if(Double.isFinite(z) || Double.isNaN(z)) {
			System.out.println("값을 계산할 수 없음");
		}else {
			System.out.println(z + 2);
		}
	
	}

}
