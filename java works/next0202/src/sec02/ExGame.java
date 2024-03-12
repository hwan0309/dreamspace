package sec02;

import java.util.Scanner;

public class ExGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("insert random number");
		String user = in.nextLine();
		int com = (int)(Math.random()*6);	
		
		
		int user_input=0;
		
		if(user_input < 0 +1) {
			System.out.println("lose");
			
		}else if(user_input < 1 +1) {
			System.out.println("lose");
			
		}else if(user_input < 2 +1) {
			System.out.println("lose");
			
		}else if(user_input < 3 +1) {
			System.out.println("lose");
			
		}else if(user_input < 4+1) {
			System.out.println("lose");
			
		}else {
			System.out.println("tie");
		}
	}		
}
