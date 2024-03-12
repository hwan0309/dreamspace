package sec08;

import java.util.Scanner;

public class MybankExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bmoney = 0;
		boolean run = true;
		while(run) {
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println("원하는 메뉴의 번호를 선택하시오");
			System.out.println("1.예금 | 2.ㅣ출금 | 3.잔고확인 | 4.종료");
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println("선택 >");
			String sec = sc.nextLine();
			int num = Integer.parseInt(sec); //String type ->  Integer type
			switch(num) {
			case 1:
				System.out.println("예금액 >");
				bmoney += Integer.parseInt(sc.nextLine());
				break;
				
			case 2:
				System.out.println("풀금액 >");
				int newMoney = bmoney;
				newMoney -= Integer.parseInt(sc.nextLine());
				if(newMoney < 0) {
					System.out.println("잔금이 없습니다.");
					break;
				}else {
					bmoney = newMoney;
				}
				break;
				
			case 3:
				System.out.println("잔고 >");
				System.out.println(bmoney);
				break;
				
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.print("");
	}

}
